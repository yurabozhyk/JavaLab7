package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    private String text;

    public StringProcessor() {
    }

    public StringProcessor(final String textObj) {
        this.text = textObj;
    }

    public final void setText(final String textObj) {
        this.text = textObj;
    }

    public final void textProcessing() {
        String processedText = "";
        Pattern pattern = Pattern.compile("\\s+");

        String[] words = pattern.split(text);

        for (String word : words) {
            Pattern patternIsNumber = Pattern.compile("\\d+");
            Matcher matcher = patternIsNumber.matcher(word);
            if (!matcher.find()) {
                processedText = processedText + word + " ";
            }

            Pattern patternExpel = Pattern.compile(
                    "(^0$)|(^[1-9]$)|(^1[0-9]$)|(^2[0-5]$)");
            Matcher matcherExpel = patternExpel.matcher(word);
            if (matcherExpel.find()) {
                processedText = processedText + "EXPEL ";
            }

            Pattern patternCommission = Pattern.compile("(^2[6-9]$)|"
                    + "(^[3-4][0-9]$)");
            Matcher matcherCommission = patternCommission.matcher(word);
            if (matcherCommission.find()) {
                processedText = processedText + "COMMISSION ";
            }

            Pattern patternSatisfactory = Pattern.compile("(^[5-6][0-9]$)|"
                    + "(^70$)");
            Matcher matcherSatisfactory = patternSatisfactory.matcher(word);
            if (matcherSatisfactory.find()) {
                processedText = processedText + "SATISFACTORY ";
            }

            Pattern patternGood = Pattern.compile("(^7[1-9]$)|(^8[0-7]$)");
            Matcher matcherGood = patternGood.matcher(word);
            if (matcherGood.find()) {
                processedText = processedText + "GOOD ";
            }

            Pattern patternExcellent = Pattern.compile(
                    "(^8[8-9]$)|(^9[0-9]$)|(^(100)$)");
            Matcher matcherExcellent = patternExcellent.matcher(word);
            if (matcherExcellent.find()) {
                processedText = processedText + "EXCELLENT ";
            }
        }
        text = processedText.trim();
    }

    public final String showResults() {
        return this.text;
    }
}

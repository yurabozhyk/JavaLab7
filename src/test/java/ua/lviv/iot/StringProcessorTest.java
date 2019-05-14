package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private String inputText;
    private String expectedText;
    private StringProcessor stringProcessor;

    @Test
    void textProcessing() {
        inputText = "Ivanenko Ivan 79 Petrenko Petro 34 Petrenko Ivan 100 Stepanenko Stepan 66 Petrovich Petro 22";
        expectedText = "Ivanenko Ivan GOOD Petrenko Petro COMMISSION Petrenko Ivan EXCELLENT Stepanenko Stepan SATISFACTORY Petrovich Petro EXPEL";
        stringProcessor = new StringProcessor(inputText);
        stringProcessor.textProcessing();
        assertEquals(expectedText, stringProcessor.showResults());
    }
}

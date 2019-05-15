package ua.lviv.iot;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return null;
    }

    public static void main(final String[] args) {
        StringProcessor tmp = new StringProcessor();
        tmp.setText(readInputText());
        tmp.textProcessing();
        System.out.println("Result:");
        System.out.println(tmp.showResults());
    }
}

package ua.lviv.iot;

import java.util.Scanner;

public class Main {

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return null;
    }

    public static void main(String[] args) {
        StringProcessor tmp = new StringProcessor();
        tmp.setText(readInputText());
        tmp.textProcessing();
        System.out.println("Result:");
        System.out.println(tmp.showResults());
    }
}

package com.pluralsight;

public class famousquotes {
}
import java.util.Scanner;

public class QuoteSelector {

    public static void main(String[] args) {

        String[] quotes = {
                "Stay curious.",
                "Small steps still move you forward.",
                "Discipline beats motivation.",
                "Your future is built today.",
                "Focus is a superpower.",
                "Consistency creates results.",
                "You learn by doing.",
                "Progress over perfection.",
                "Effort compounds.",
                "You can always improve."
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Select a number between 1 and 10: ");
        int choice = input.nextInt();

        // NO try/catch yet
        System.out.println("Your quote: " + quotes[choice - 1]);
    }

    private static class String {
    }

    private static class Scanner {
        public int nextInt() {

        }
    }

    private static class System {
    }
}
package Questionaire;

import java.util.Scanner;

public class QuestionnaireWithSelections {
    private Scanner scanner;

    public QuestionnaireWithSelections() {
        this.scanner = new Scanner(System.in);
    }

    public void runQuestionnaire() {
        // Example question with selections
        String[] colorOptions = {"Red", "Blue", "Green", "Yellow"};
        int colorSelection = getSelection("What is your favorite color?", colorOptions);
        System.out.println("You selected: " + colorOptions[colorSelection]);

        // Another example question
        String[] yesNo = {"Yes", "No"};
        int programAnswer = getSelection("Do you enjoy programming?", yesNo);
        System.out.println("You answered: " + yesNo[programAnswer]);
    }

    private int getSelection(String question, String[] options) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        int selection;
        while (true) {
            System.out.print("Enter your selection (1-" + options.length + "): ");
            try {
                selection = Integer.parseInt(scanner.nextLine());
                if (selection >= 1 && selection <= options.length) {
                    return selection - 1;  // Return 0-based index
                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public void close() {
        scanner.close();
    }
}

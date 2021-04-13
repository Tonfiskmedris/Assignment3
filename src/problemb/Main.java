package problemb;


import javax.swing.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    ArrayList<Issues> ticket = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main myApp = new Main();
        int choice;

        do {

            myApp.displayMenu();
            System.out.print("Select action: ");
            choice = Integer.parseInt(myApp.input.nextLine());

            switch (choice) {
                case 1 -> myApp.createIssue();

                case 2 -> myApp.solveIssue();

                case 3 -> myApp.viewSolvedIssues();
                //print solved issues

                case 4 -> myApp.viewUnsolvedIssues();

            }

        } while (choice != 5);

    }

    private void displayMenu() {
        System.out.println();
        System.out.println("|  ------- Menu -------   |");
        System.out.println("| 1. Create new issue     |");
        System.out.println("| 2. Solve issue          |");
        System.out.println("| 3. View solved issues   |");
        System.out.println("| 4. View unsolved issues |");
        System.out.println("| 5. Exit program         |");
        System.out.println("| ----------------------- |");
        System.out.println();
    }

    private void createIssue() {

        Issues issue1 = new Issues();
        String newIssues;
        System.out.print("What is your issue?: ");
        newIssues = input.nextLine();
        issue1.setNewIssues(newIssues);
        ticket.add(issue1);
        issue1.setSolved(false);

    }

    private void solveIssue() {

        ArrayList<Issues> unsolvedIssues = getUnsolvedIssues();
        System.out.println("--- Current issues ---");
        System.out.println(unsolvedIssues);
        System.out.println("Select which issue you would like to solve: ");
        int solve = Integer.parseInt(input.nextLine());
        unsolvedIssues.get(solve).setSolved(true);


    }


    private void viewSolvedIssues() {
        ArrayList<Issues> solvedIssues = new ArrayList<>();
        System.out.println("--- Solved issues ---");
        for (Issues i : ticket) {
            System.out.println(solvedIssues);
        }

    }

    private ArrayList<Issues> getUnsolvedIssues() {
        ArrayList<Issues> unsolvedIssues = new ArrayList<>();
        for (Issues i : ticket) {
            if (i.isSolved()) {
                unsolvedIssues.add(i);

            }
        }
        return unsolvedIssues;
    }

    private void viewUnsolvedIssues() {


    }
}


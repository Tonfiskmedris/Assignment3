package problemb;


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
        System.out.println(issue1.isSolved());
    }

    private void solveIssue() {
        Issues issue1 = new Issues();
        System.out.println("--- Current issues ---");
        viewUnsolvedIssues();
        System.out.println("Select which issue you would like to solve: ");
        int solve = Integer.parseInt(input.nextLine());
        ticket.remove(solve);
        issue1.setSolved(true);


    }

    private void viewSolvedIssues() {
        Issues issue1 = new Issues();
        System.out.println("--- Solved issues ---");

    }

    private void viewUnsolvedIssues() {
        for (Issues i : ticket) {

            System.out.println("[" + ticket.indexOf(i) + "]" + i.getNewIssues());

        }
    }
}


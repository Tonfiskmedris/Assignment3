package problemb;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    ArrayList<Issues> ticket = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main myApp = new Main();
        int choice;

        //do-while loop sätts för att programmet vet hur den skall köras och när den ska exita.
        do {
            //Kallar på vår menymetod som printar vår meny.
            myApp.displayMenu();
            System.out.print("Select action: ");
            choice = Integer.parseInt(myApp.input.nextLine());

            //switch funkar som vår menu selecter där användaren får välja vad hen vill göra och på val 1-4 så kallar vi på en av våra metoder. Avslutar programmet om val 5 tas.
            switch (choice) {
                case 1 -> myApp.createIssue();
                case 2 -> myApp.solveIssue();
                case 3 -> myApp.viewSolvedIssues();
                case 4 -> myApp.viewUnsolvedIssues();
            }
        } while (choice != 5);
    }

    //Skapar vår menymetod
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

    //skapar en metod som låter användaren skriva in sitt problem för att sedan lagra problemet i vår arraylist "ticket".
    private void createIssue() {
        Issues issue1 = new Issues();
        String newLabel;
        System.out.print("What is your issue?: ");
        newLabel = input.nextLine();
        issue1.setLabel(newLabel);
        ticket.add(issue1);

    }

    //skapar en metod som låter användaren se vilka tickets som ej är lösta och välja vilken hen vill lösa. Vald tickets boolean sätts sedan till true vilket gör att vi kan få programmet att se denna ticket som solved.
    private void solveIssue() {
        ArrayList<Issues> unsolvedIssues = getUnsolvedIssues();
        System.out.println("--- Current issues ---");
        viewUnsolvedIssues();
        System.out.println("Select which issue you would like to solve: ");
        int solve = Integer.parseInt(input.nextLine());
        unsolvedIssues.get(solve).setSolved(true);
    }

    //metod som låter användaren se vilka tickets som är lösta med hjälp av en enhanced for-loop och vårat boolean värde.
    private void viewSolvedIssues() {
        System.out.println("--- Solved issues ---");
        for (Issues i : ticket) {
            if (i.isSolved()) {
                System.out.println("[" + ticket.indexOf(i) + "]" + i.getLabel());
            }
        }
    }

    //metod som klassifierar ifall en ticket är löst eller ej. Kollar vårt boolean värde, om den inte är true så adderas ticketen till vår arraylist för icke lösta tickets.
    private ArrayList<Issues> getUnsolvedIssues() {
        ArrayList<Issues> unsolvedIssues = new ArrayList<>();
        for (Issues i : ticket) {
            if (!i.isSolved()) {
                unsolvedIssues.add(i);
            }
        }
        return unsolvedIssues;
    }

    //metod som låter användaren att se vilka tickets som inte är lösta.
    private void viewUnsolvedIssues() {
        ArrayList<Issues> unsolvedIssues = getUnsolvedIssues();
        for (Issues i : unsolvedIssues) {
            System.out.println("[" + unsolvedIssues.indexOf(i) + "]" + i.getLabel());
        }
    }
}






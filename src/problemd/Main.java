package problemd;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    //Vår array som har 10 element -> att vi inte kan få en kö på mer än 10 personer.
    PhoneCall[] phoneCalls = new PhoneCall[10];
    int index = 0;

    public static void main(String[] args) {

        Main myApp = new Main();
        int choice;

        //do while gör att vi kan köra programmet tills att användaren valt att avsluta programmet.
        do {
            myApp.displayMenu();
            System.out.print("Input action: ");
            choice = Integer.parseInt(myApp.input.nextLine());

            //switch låter användaren att välja vad hen vill göra. Vi använder oss av de två metoderna vi skapat nedan för att antingen skapa en caller eller svara en caller.
            switch (choice) {
                case 1 -> myApp.createPhoneCall();
                case 2 -> myApp.answerPhoneCall();
            }
        } while (choice != 3);
    }

    //metod för att skapa vår meny och printa antal callers i kö
    private void displayMenu() {
        System.out.println();
        System.out.println("|  ------- Menu -------   |");
        System.out.println("| 1. Add phone call       |");
        System.out.println("| 2. Answer phone call    |");
        System.out.println("| 3. Exit                 |");
        System.out.println("| ----------------------- |");
        System.out.printf("Current queue: %d%n ", index);
        System.out.println();
    }

    //metod för att skapa en caller med hjälp av PhoneCall klassen och index för att sätta personen i kösystemet.
    private void createPhoneCall() {
        //if(index < 10) gör så att användaren endast kan lägga till en ny caller i kön så länge som att vi inte redan har 10 i kön.
        if (index < 10) {
            System.out.println("--- Add call ---");
            phoneCalls[index] = new PhoneCall();
            System.out.print("Enter name: ");
            phoneCalls[index].setPhoneCallName(input.nextLine());
            System.out.print("Phone number: ");
            phoneCalls[index].setPhoneCallNumber((input.nextLine()));
            index += 1;
        }
    }

    //metod för att svara på våra callers och sedan skriva ut vem som vi svarat och samtidigt ta bort den personen från vår array. Alltid index 0 som vi svarar näst.
    //när index 0 svaras på så tas callern bort och vår index 1 blir då nya index 0 dvs vi flyttar alla element ett steg till vänster.
    //samtlidigt som vi flyttar alla element till vänster så sätter vi då vårt sista index till null igen så att programmet kan känna av att det finns plats för en till caller i kön.
    private void answerPhoneCall() {
        if (index > 0) {
            System.out.printf("Current caller: %s, Phone number: %s%n", phoneCalls[0].getPhoneCallName(), phoneCalls[0].getPhoneCallNumber());
            if (phoneCalls.length - 1 >= 0) {
                System.arraycopy(phoneCalls, 1, phoneCalls, 0, phoneCalls.length - 1);
            }
            phoneCalls[phoneCalls.length - 1] = null;
            index -= 1;
        }
    }
}

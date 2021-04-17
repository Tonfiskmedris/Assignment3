package problemd;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main myApp = new Main();
        int choice;

        //kör programmet tills att användaren valt att avsluta programmet.
        do {
            myApp.displayMenu();
            System.out.println("Input action: ");
            choice = Integer.parseInt(myApp.input.nextLine());

            switch (choice) {
                case 1 -> myApp.createPhoneCall();
                case 2 -> myApp.answerPhoneCall();
            }
        } while (choice != 3);
    }

    private void displayMenu() {
        System.out.println();
        System.out.println("|  ------- Menu -------   |");
        System.out.println("| 1. Add phone call       |");
        System.out.println("| 2. Answer phone call    |");
        System.out.println("| 3. Exit                 |");
        System.out.println("| ----------------------- |");
        System.out.println();//printa bara hur många index som är fulla dvs den ska inte printa alla 10 element om inte alla är fyllda.
        System.out.println();
    }

    private void createPhoneCall() {
        //få metoden att lägga till ett element i arrayen vid varje exekvering.
        PhoneCall[] createPhoneCall;
        createPhoneCall = new PhoneCall[10];
        createPhoneCall[0] = new PhoneCall();
        createPhoneCall[1] = new PhoneCall();
        createPhoneCall[2] = new PhoneCall();
        createPhoneCall[3] = new PhoneCall();
        createPhoneCall[4] = new PhoneCall();
        createPhoneCall[5] = new PhoneCall();
        createPhoneCall[6] = new PhoneCall();
        createPhoneCall[7] = new PhoneCall();
        createPhoneCall[8] = new PhoneCall();
        createPhoneCall[9] = new PhoneCall();

        for (int i = 0; i<createPhoneCall.length; i++) {
            System.out.println("Enter name of caller:");
            createPhoneCall[i].setPhoneCallName(input.nextLine());
            System.out.println("Enter number of caller: ");
            createPhoneCall[i].setPhoneCallNumber(Integer.parseInt(input.nextLine()));
        }
        for (PhoneCall phoneCall : createPhoneCall) {
            if (phoneCall.name != null) {
                phoneCall.display();
            }
        }
    }


    //for(int i = 0; i < queuesize.lenght; i++) vi vill få programmet så att den endast kan addera 10 element till listan dvs max kö = 10 personer.


    private void answerPhoneCall() {
        PhoneCall[] answerPhoneCall;
        answerPhoneCall = new PhoneCall[10];

        // ta bort från array listan och printa vem vi (tar bort) svarar: namn (telnr).
    }
}


//    Skapa ett program som håller reda på inkommande telefonsamtal och placerar dem i en kö. Varje telefonsamtal skall representeras av ett objekt som lagrar namnet på personen som ringer och dennes telefonnummer.
//    När man svarar på ett telefonsamtal skall det tas bort från kön. Man svarar alltid på det samtal som finns på index 0. Alla andra samtal i kön skall ”flyttas fram” ett steg så att det samtal som tidigare hade index 1 skall nu få index 0 ock så vidare.
//    Kön skall vara begränsad till tio samtal och skall representeras av en array (inte ArrayList) som kan lagra telefonsamtal.
//    I testfasen skall programmet köras som ett konsolprogram där man manuellt kan lägga till och svara på samtal via en meny.
//    Programmet skall inte avslutas direkt utan tillåta att man lägger till och svarar på samtal så länge man vill och i vilken ordning man vill (ex. lägg till två, svara på ett, lägg till ytterligare ett, svara på två...).
//
//    Följande måste användas:
//    Två klasser, en klass som innehåller main-metoden och en klass från vilken objekt skapas
//    En interaktiv meny, använd if-sats eller switch-sats
//    En loop
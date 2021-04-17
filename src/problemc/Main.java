package problemc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //skapar våra bag objekt baserat på vår Bags klass
        Bags smallBag = new Bags(10, 10, 10);
        Bags mediumBag = new Bags(50, 100, 40);
        Bags largeBag = new Bags(100, 200, 50);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the volume of your truck in cm3: ");
        long truckVolume = input.nextLong();
        int largeBagCount = 0;
        int mediumBagCount = 0;
        int smallBagCount = 0;

        //3 stycken for loopar som körs. Börjar med den första for loopen som kollar om vi får plats med några stora bags genom att kolla lastvolymen kontra bag volymen. Om stor bag får plats
        //så läggs en stor väska till i totalen och tar bort den volymen på kvarvarande lastvolymen. När inte längre stora bags får plats går programmet vidare till nästa for loop och genomgår
        //samma process fast på medel bags och tillsist går den vidare efter att den inte kan lasta några fler medel bags och kollar om några små bags får plats.
        for (int i = 0; i <= truckVolume; i++) {
            if (largeBag.bagVolume() <= truckVolume) {
                largeBagCount += 1;
                truckVolume -= largeBag.bagVolume();
            }
        }

        for (int j = 0; j <= truckVolume; j++) {
            if (mediumBag.bagVolume() <= truckVolume) {
                mediumBagCount += 1;
                truckVolume -= mediumBag.bagVolume();
            }
        }

        for (int k = 0; k < truckVolume; k++) {
            if (smallBag.bagVolume() <= truckVolume) {
                smallBagCount += 1;
                truckVolume -= smallBag.bagVolume();
            }
        }

        //Sedan printar vi ut vårt resultat av antalet stora, medel och små bags som fick plats samt respektives dimentioner och volymer. Printar även ifall vi har någon onyttjad yta kvar i lastvolymen.
        System.out.printf("Number of large bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", largeBagCount, largeBag.getLength(), largeBag.getWidth(), largeBag.getHeight(), largeBag.bagVolume());
        System.out.printf("Number of medium bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", mediumBagCount, mediumBag.getLength(), mediumBag.getWidth(), mediumBag.getHeight(), mediumBag.bagVolume());
        System.out.printf("Number of small bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", smallBagCount, smallBag.getLength(), smallBag.getWidth(), smallBag.getHeight(), smallBag.bagVolume());
        System.out.printf("Amount of empty space after loading: %d cm3%n", truckVolume);
    }
}

package problemc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bags smallBag = new Bags(10, 10, 10);
        Bags mediumBag = new Bags(50, 100, 40);
        Bags largeBag = new Bags(100, 200, 50);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the volume of your truck in cm3: ");
        long truckVolume = input.nextLong();
        int largeBagCount = 0;
        int mediumBagCount = 0;
        int smallBagCount = 0;


        //problem med att den hoppar till medium bag fast den fortfarande kan fylla med largebag.
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


        System.out.printf("Number of large bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", largeBagCount, largeBag.getLength(), largeBag.getWidth(), largeBag.getHeight(), largeBag.bagVolume());
        System.out.printf("Number of medium bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", mediumBagCount, mediumBag.getLength(), mediumBag.getWidth(), mediumBag.getHeight(), mediumBag.bagVolume());
        System.out.printf("Number of small bags: %d with the following dimensions %dx%dx%d (volume: %,d cm3)%n", smallBagCount, smallBag.getLength(), smallBag.getWidth(), smallBag.getHeight(), smallBag.bagVolume());
        System.out.printf("Amount of empty space after loading: %d cm3%n", truckVolume);
    }
}

//        Åter igen är banken väldigt imponerad av de program du har skapat till dem och ger dig en ny uppgift, att beräkna hur många pengapåsar man kan få in i en lastbil.
//        Pengapåsarna kommer i tre storlekar, 10x10x10cm, 50x100x40cm och 100x200x50cm.
//        Programmet de vill ha skapat skall fungera enligt följande; Först ska programmet läsa in den totala volymen av lastbilen i kubikcentimeter från tangentbordet.
//        Därefter skall programmet beräkna hur många pengapåsar som får plats och presentera resultatet för användaren.
//        Banken vill använda så många stora pengapåsar som det bara går. Det vill säga de vill ha så många av de största pengapåsarna som möjligt,
//        när de inte kan få in fler av de stora pengapåsarna vill de ha så många av de medelstora pengapåsarna som möjligt och när de inte får in fler av de medelstora pengapåsarna fyller de upp med så många små pengapåsar som möjligt.
//        Alla pengapåsar, oavsett storlek, skall representeras av objekt skapade från samma klass. Sätt respektive påses volym under eller efter skapandet av objekten. Objekten skall användas under beräkningen.
//        Tips: Använd tre variabler för att lagra de olika påsarna och använd sen tre loopar för att beräkna hur många påsar av varje storlek som får plats.
//        Kom ihåg att börja med de största påsarna och använd den kvarvarande volymen för att se hur många medelstora påsar som får plats och så vidare.
//        Icke obligatorisk extrauppgift: Låt användaren bestämma hur många olika storlekar på pengapåsar det skall finnas och läs in pengapåsarnas volym från tangentbordet. Skriv också ut kvarvarande volym efter att max antal pengapåsar lastats i lastbilen.
//
//        Följande måste användas:
//        Två klasser, en klass som innehåller main-metoden och en klass från vilken objekt skapas
//        Getter metoder
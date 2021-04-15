package problemd;

public class Main {
    public static void main(String[] args) {

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
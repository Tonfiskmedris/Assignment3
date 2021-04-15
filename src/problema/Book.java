package problema;

public class Book {
    String name;
    String isbn;
    double price;

    //Skapar en array för authors.
    String[] authors;

    //Skapar en konstruktor med parametrar för att kunna skapa en bok. Parametern "String... authors" är en array för att vi ska kunna mata in flera författare.
    public Book(String name, String isbn, double price, String... authors) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.authors = authors;

        //String.join metoden låter oss retunera ett värde kombinerat med en avgränsare, vilket i vårat fall så är värdet = authors och vår avgränsare är ","
        System.out.printf("Book = %s, ISBN = %s, Price = $%.2f, Authors = [%s]%n", name, isbn, price, String.join(", ", authors));
    }

    //Skapat en getter för att kunna hämta priset på varje bok för att sedan kunna printa en total summa för samtliga böcker.
    public double getPrice() {
        return price;
    }
}


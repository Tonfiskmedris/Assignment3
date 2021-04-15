package problema;

public class Main {

    public static void main(String[] args) {

        //skapar objekt som det ej går att ändra någon bokdata i efter skapande av objektet
        final Book book1 = new Book("Rich Dad Poor Dad: What The Rich Teach Their Kids About Money That the Poor and Middle Class Do Not!", "9781612680019", 25, "Kiyosaki. Robert T.");
        final Book book2 = new Book("The Intelligent Investor", "9780060555665", 14, "Graham. Benjamin");
        final Book book3 = new Book("Corporate Finance, Global Edition", "9781292160160", 86, "Berk. Jonathan", "DeMarzo. Peter");

        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();
        System.out.println("-------------------------------");
        System.out.printf("Total price: $%.2f", totalPrice);
    }
}

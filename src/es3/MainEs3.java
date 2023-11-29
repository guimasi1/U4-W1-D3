package es3;

public class MainEs3 {
    public static void main(String[] args) {
        Customers customer1 = new Customers(1,"Sergio", "Leone","sergio.leone@gmail.com");
        Article television = new Article(1, "Bellissima televisione", 300, 4);
        television.printArticle();
        customer1.printCustomer();
        Cart cart1 = new Cart(customer1);
        cart1.printCart();

    }
}

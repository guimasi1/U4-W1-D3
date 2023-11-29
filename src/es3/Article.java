package es3;

public class Article {
    private final int id;
    private String description;
    private double price;
    private int availableItems;

    // COSTRUTTORI

    public Article(int id, String description, double price, int availableItems) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.availableItems = availableItems;
    }

   public void printArticle() {
       System.out.println("id: " + this.id + ", description: " + this.description + ", price: " + this.price + ", available items: " + this.availableItems);
   }
   public int getId() {
        return this.id;
   }
   public String getDescription() {
        return this.description;
   }
   public double getPrice() {
        return this.price;
   }
   public int getAvailableItems() {
        return this.availableItems;
   }
}

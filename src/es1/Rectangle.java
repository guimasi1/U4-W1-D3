package es1;

public class Rectangle {
   public int base;
   public int height;

   // COSTRUTTORI

   public Rectangle(int base, int height) {
      this.base = base;
      this.height = height;
   }

   // METODI

   public int perimeter() {
      return (this.base + this.height) * 2;
   }

   public int area() {
      return this.base * this.height;
   }

   public void printRectangleMethod() {
      int perimeter = this.perimeter();
      int area = this.perimeter();
      System.out.println("perimeter: " + perimeter);
      System.out.println("area: " + area);
   }
}

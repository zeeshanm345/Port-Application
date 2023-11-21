package mainpkg;

public class LiquidCantainer implements Cantainer {

  private int id;
  private double capacity;
  private double weight;
  private double price;

  public LiquidCantainer(int id, double weight, double price) {
    this.id = id;
    this.capacity = 2500;
    this.weight = weight;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public double getCapacity() {
    return capacity;
  }

  public double calculatePrice() {
    return weight * price;
  }

  public void updateCantainerCount(Ship ship) {
    ship.setBasicCantainerCount(ship.getBasicCantainerCount() + 1);
  }

  public void displayCantainerDetail(Ship ship) {
    System.out.println("Liquid Cantainer (Count : " + ship.getBasicCantainerCount());
  }

}
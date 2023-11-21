package mainpkg;

public class RefrigeratedCantainer implements Cantainer {
  private int id;
  private double capacity;
  private double weight;
  private double price;

  public RefrigeratedCantainer(int id, double capacity, double weight, double price) {
    super();
    this.id = id;
    this.capacity = capacity;
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
    System.out.println("Refrigerated Cantainer(count: " + ship.getBasicCantainerCount());
  }

}
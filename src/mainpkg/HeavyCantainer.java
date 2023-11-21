package mainpkg;

public class HeavyCantainer implements Cantainer {

  private int id;
  private double capacity;
  private double weight;
  private double price;

  public HeavyCantainer(int id, double weight, double price) {
    this.id = id;
    this.capacity = 5000;
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
    ship.setHeavyCantainer(ship.getHeavyCantainerCount());
  }

  public void displayCantainerDetail(Ship ship) {
    System.out.println("Heavy cantainer (count: " + ship.getBasicCantainerCount());
  }

}
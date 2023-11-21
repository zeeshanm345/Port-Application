package mainpkg;

public interface Cantainer {
  int getId();

  double getCapacity();

  double calculatePrice();
  void updateCantainerCount(Ship ship);

  void displayCantainerDetail(Ship ship);

}
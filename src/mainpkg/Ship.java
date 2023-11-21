package mainpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship {
  private int shipId;
  private double fuel;
  private double weight;
  private List < Cantainer > listOfCantainers;

  private int basicCantainerCount;
  private int heavyCantainerCount;
  private int liquidCantainerCount;
  private int refrigeratedCantainerCount;

  public Ship(int shipId, double fuel, double weight) {
    this.shipId = shipId;
    this.fuel = fuel;
    this.weight = weight;
    this.listOfCantainers = new ArrayList < Cantainer > ();
  }
  public void addContainer(Cantainer cantainer) {

    listOfCantainers.add(cantainer);
    cantainer.updateCantainerCount(this);

  }

  private void updateCantainerCount(Cantainer cantainer) {
    if (cantainer instanceof BasicCantainer) {
      basicCantainerCount++;
    } else if (cantainer instanceof HeavyCantainer) {
      heavyCantainerCount++;
    } else if (cantainer instanceof LiquidCantainer) {
      liquidCantainerCount++;
    } else if (cantainer instanceof RefrigeratedCantainer) {
      refrigeratedCantainerCount++;
    }
  }

  public int getShipid() {
    return shipId;
  }

  public double getFuel() {
    return fuel;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  //Getter methods
  public int getBasicCantainerCount() {
    return basicCantainerCount;
  }

  public int getHeavyCantainerCount() {
    return heavyCantainerCount;
  }
  public int getLiquidCantainerCount() {
    return liquidCantainerCount;
  }
  public int getRefrigeratedCantainerCount() {
    return refrigeratedCantainerCount;
  }
  public List < Cantainer > getListOfCantainers() {
    return listOfCantainers;
  }

  //Setter methods
  public void setBasicCantainerCount(int count) {
    basicCantainerCount = count;
  }
  public void setHeavyCantainer(int count) {
    heavyCantainerCount = count;
  }
  public void setLiquidCantainer(int count) {
    liquidCantainerCount = count;
  }
  public void setRefrigeratedCantainer(int count) {
    liquidCantainerCount = count;
  }

  public void displayShipStatistics() {
    System.out.println("****************\n" +
      "Ship Statistics ************************** ");
    System.out.println("    \nShip ID:" + shipId);
    System.out.println("    \nFuel: " + fuel);
    System.out.println("    \nWeight : " + weight);
    System.out.println("    \nCantainer Statistics");

    for (Cantainer cantainer: listOfCantainers) {
      cantainer.displayCantainerDetail(this);
    }
  }

}
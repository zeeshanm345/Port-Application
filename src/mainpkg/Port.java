package mainpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Port {
  private int portId;
  private String geoLocation; //Add lattitude and logitaude
  private String country;
  private List < Ship > listOfShips;

  public Port(int portId, String geoLocation, String country, List < Ship > listOfShips) {
    super();
    this.portId = portId;
    this.geoLocation = geoLocation;
    this.country = country;
    this.listOfShips = listOfShips;
  }

  public void AddBill(int PortId, double amount) {

  }

  public void dock(Ship ship) {

    listOfShips.add(ship);
    System.out.println(" ****************************  Ship docked!Sucessfullay *************************");
    System.out.println();
  }

  public void insertPort() {}

  public void UnDock() {

  }

  public void CostPerMinute() {

  }
  public void CostOfWeight() {

  }

}
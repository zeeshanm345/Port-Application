package mainpkg;

import java.util.List;
import java.util.Scanner;

public class Ship {
	private int shipId;
	private double fuel;
	private double weight;
	private List<Cantainer> listOfCantainers;
	
	public Ship(int shipId, double fuel)
	{
		
	}
	public void addContainer(Cantainer cantainer)
	{
		listOfCantainers.add(cantainer);
	}
	
	Scanner scanner = new Scanner(System.in);
	
	
	
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

//	public int getCantainerLimit() {
//		return CantainerLimit;
//	}

	
	public void ShowDetails()
	{
		System.out.println("Ship id :"+ getShipid() );
		System.out.println("Ship fuel:"+ getFuel());
		System.out.println("Ship Weight: "+ getWeight());
	//	System.out.println("Total Cantainer Limit in ship: "+ getCantainerLimit());
		System.out.println("Cantainer Type: ");
		System.out.println();
		
	}



	
	
	public void Dock()
	{
		
	}
	
	public void UnDock()
	{
		
	}
	
	

}

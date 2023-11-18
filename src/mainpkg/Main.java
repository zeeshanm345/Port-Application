package mainpkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		char choose;
		//Ship ship = new Ship();
		//Port port = new Port(1, null, null);
		  
		do {
	
		System.out.println("1. Dock a ship to port \n"
				+ "2. List ship statistics by showing capacity, size, number of container and their types. \r\n"
				+ "4. Unlock a container from ship\r\n"
				+ "5. Load a container from ship\r\n"
				+ "6. Add fuel to ship\r\n"
				+ "7. Depart a ship to another port. \r\n");
		 choose = scanner.next().charAt(0);
		

	        switch (choose) {
	            case '1':
	                System.out.println("Dock a ship to port");
	                //ship.inputShipDetail();
	               
	              //  port.dock(ship);
	                

	                break;

	            case '2':
	                System.out.println("List ship statistics by showing capacity, size, number of container and their types. ");
	               // ship.ShowDetails();

	                break;

			case '3' :
				System.out.println("Bill a ship");
				break;
			case '4' :
				System.out.println("Unlock a container from ship");
				break;
			case '5' :
				System.out.println("Load a container from ship");
				break;
			case '6' :
				System.out.println("Add fuel to ship");
				break;
			case '7' :
				System.out.println("Depart a ship to another port");
				break;
		}
		}while(choose !=7);
		
		

	}
	
	public static Ship createShip()
	{
		 Ship ship = new Ship(2, 32);
		 return ship;
	}
		

}

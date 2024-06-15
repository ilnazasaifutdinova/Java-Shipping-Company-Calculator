package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import containers.Container;
import items.Item;
import methods.Calculation;

public class Day11 {

	public static void Add_details(String[] args) {
		
		//Add products details
		Item laptop = new Item("Laptop", 60, 50, 50, 6.5);
		Item mouse = new Item("Mouse", 30, 30, 20, 0.2);
		Item desktop = new Item("Desktop", 100, 150, 50, 20);
		Item lcd = new Item("LCD Screen", 120, 140, 80, 2.6);
		//Saving the Shape of Items using ArrayList Data Structure.
		List<Item> items = new ArrayList<>();
		
		//Add containers details
		Container smallCon = new Container("Small", 2.59, 2.43, 6.06, 500);
		Container bigCon = new Container("Big", 2.59, 2.43, 12.01, 500);
		//Saving the Type of Containers using ArrayList Data Structure.
		List<Container> containers = new ArrayList<>();
		containers.add(smallCon);
		containers.add(bigCon);
		
		//ArrayList for items1, containers1.
		List<Item> items1 = new ArrayList<>();
		List<Container> containers1 = new ArrayList<>();
		containers1.add(smallCon);
		containers1.add(bigCon);
		
		//Add items (from customer input) //Read the order
		Scanner it = new Scanner(System.in);
		System.out.print("Enter order information: <quantity><product>");
		String order = it.nextLine();
		
		//Вот тут у меня не получается
		String[] ordInfo = order.split(",");
		
		for (String orderin: ordInfo) {
			int quantity = Integer.parseInt(orderin.replace("[0-9]", ""));
			String prodName = orderin.replace("[0-9]", "").trim();
		}
		
		Calculation calculation = new Calculation();
		//Print the results
		calculation.printOrder(items1, containers1);
		
	}
}

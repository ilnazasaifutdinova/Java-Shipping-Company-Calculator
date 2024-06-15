package methods;

import java.util.List;

import containers.Container;
import items.Item;

public class Calculation {
	
	public double totalVolume(List<Item> items) {
		double totalVolume = 0;
		for (Item item: items) {
			totalVolume += item.itemVolume();
		}
		return totalVolume;
	}
	
	public double totalWeight(List<Item> items) {
		double totalWeight = 0;
		for (Item item: items) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	public String bestShipping(List<Item> items, List<Container> containers) {
		double totalVolume = totalVolume(items);
		double totalWeight = totalWeight(items);
		
		for (Container container: containers) {
			double conVolume = container.containerVolume();
			double conMaxWeight = container.getMaxWeight();
			
			if (totalVolume <= conVolume && totalWeight <= conMaxWeight) {
				return "Best shipping method is: " + container.getName();
			}
		}
		return "Best shipping method not found";
	}
	
	public double hippingPrice(List<Item> items, List<Container> containers) {
		double totalWeight = totalWeight(items);
		for (Container container: containers) {
			if (container.getName().equals("Big")) {
				return 1800;
			} else if (container.getName().equals("Small")) {
				if (totalWeight <= 500) {
					return 1000;
				} else {
					return 1200;
				}
			}
		}
		return 0;
	}
	
	public void addItems(List<Item> items, String name, double height, double wide, double length, double weight, int quantity) {
		for (int i = 0; i < quantity; i++) {
			items.add(new Item(name, height, wide, length, weight));
		}
	}
	
	public void addOrder() {
		
		
		
	}
	
	public void printItem(List<Item> items) {
		for (Item item: items) {
			item.printItemInfo();
		}
	}
	
	public void printOrder(List<Item> items, List<Container> containers) {
		double totalVolume = totalVolume(items);
		double totalWeight = totalWeight(items);
		double price = hippingPrice(items, containers);
		String bestShipping = bestShipping(items, containers);
		
		System.out.println("Order Information: ");
		printItem(items);
		System.out.println("Total Volume: " + totalVolume);
		System.out.println("Total Weight: " + totalWeight);
		System.out.println("Best Shipping Method: " + bestShipping);
		System.out.println("Price: " + price);
		}
}
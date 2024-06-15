package containers;

public class Container {

	//Attributes
	private String name;
	private double height;
	private double wide;
	private double length;
	private double maxWeight;
		
		
	//Constructors 
	public Container(String name, double height, double wide, double length, double maxWeight) {
		this.name = name;
		this.height = height;
		this.wide = wide;
		this.length = length;
		this.maxWeight = maxWeight;
	}
		
	//Getter and Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWide() {
		return wide;
	}


	public void setWide(double wide) {
		this.wide = wide;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}
	
	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	//Calculate Volume
	public double containerVolume() {
		return height * wide * length; //m**3 
	}
	
	
	//Print container info
	public void printConInfo() {
		System.out.println("Name on container: " + name);
		System.out.println("Size of container: " + height + "*" + wide + "*" + length);
		System.out.println("Maximum Weight of container: " + maxWeight);
		System.out.println("Volume of container: " + containerVolume());
	}

}

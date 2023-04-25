package oops_practice;

public class City {
	public String name;
	public long population;
	
	public void display() {
		System.out.println("City Name: " + name);
		System.out.println("Population: " + population);
	}
public static void main(String[] args) {
	City metro1,metro2;
	metro1 = new City();
	metro2 = new City();
	metro1.name = "Delhi";
	metro2.name = "Chennai";
	metro1.population = 1000000;
	metro2.population = 2000000;
	metro1.display();
	metro2.display();
	//System.out.println("Details of the metro city1: ");
	//System.out.println("Details of the metro city2: ");
}
}

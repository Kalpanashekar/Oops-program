package oops_practice;

public class Car extends Vehicle{
	private String modelName = "Mustrang";
	public static void main(String[] args) {
		
	
	Car obj = new Car();
	obj.honk();
	System.out.println(obj.brand+ " " + obj.modelName);

}
}

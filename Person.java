package oops_practice;

public class Person {
	static String name = "John";
	static int age = 25;
	void eat() {
		System.out.println("I am eating now");

}
	void run() {
		System.out.println("I am running now");
	}
	void study() {
		System.out.println("I am studying now");
	}
	public static void main(String[] args) {
		Person obj = new Person();
		obj.eat();
		obj.run();
		obj.study();
		System.out.println("Name of the person: " + name);
		System.out.println("Age of the person: " + age);
	}
		
	}
	

package oops_practice;

public class Dog extends Animal {

	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.makeSound();

	}
	void makeSound() {
		System.out.println("Barking");
	}

}

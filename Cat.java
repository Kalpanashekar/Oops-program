package oops_practice;

public class Cat extends Animals{
	void animalSound() {
		System.out.println("The cat says: meow meow");
	}
public static void main(String[] args) {
	Animals myAnimal = new Animals();
	Animals myPig = new Pig();
	Animals myCat = new Cat();
	myAnimal.animalSound();
	myPig.animalSound();
	myCat.animalSound();
	
}
}

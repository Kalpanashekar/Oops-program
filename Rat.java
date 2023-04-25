package oops_practice;

public class Rat extends Animal1 {
	public void animalsound() {
		System.out.println("wee wee");
		
	}
	public static void main(String[] args) {
		Rat obj = new Rat();
		obj.animalsound();
		obj.sleep();
		
	}

}

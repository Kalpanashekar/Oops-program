package oops_practice;

public class PolimorphismDemo {
	public int sum(int num1,int num2) {
		return(num1+num2);
		
	}
	public int sum(int num1, int num2, int num3) {
		return(num1+num2+num3);
	}
	public double sum(double num1, double num2){
		return(num1+num2);
	}

	public static void main(String[] args) {
		PolimorphismDemo obj = new PolimorphismDemo();
		
System.out.println(obj.sum(10,20));
System.out.println(obj.sum(20,30,40));
System.out.println(obj.sum(20.5,30.5));
	}

}

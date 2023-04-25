package oops_practice;

public class Website {
	String WebsiteName;
	int WebsiteAge;
	
	Website(String Name, int Age){
		WebsiteName = Name;
		WebsiteAge = Age;
		
	}
	public static void main(String[] args) {
		Website obj1 = new Website("kalpana",8);
		Website obj2 = new Website("shobana", 9);
		
		System.out.println("Website Name: "+ obj1.WebsiteName);
		System.out.println("Website Name: "+ obj1.WebsiteAge);

		System.out.println("Website Name: "+ obj2.WebsiteName);

		System.out.println("Website Name: "+ obj2.WebsiteAge);

		
	}
		
	
	}

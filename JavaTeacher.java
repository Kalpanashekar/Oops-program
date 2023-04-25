package oops_practice;
//inheritance example
public class JavaTeacher extends Teacher{
String mainSubject = "Java";


	public static void main(String[] args) {
		JavaTeacher obj = new JavaTeacher();
		obj.teach();

System.out.println(obj.designation);
System.out.println(obj.school);
System.out.println(obj.mainSubject);

	}

}

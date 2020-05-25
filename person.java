import java.util.*;
class person{
	 		  String age;
		 public void run() {
			 System.out.println("Person with  age "+ this.age +" is running");
		 }
	public static void main(String arg[]) {
		person p3 = new person();    //object is created only when new keyword is used
		person p4 = new person();
		p3.age = "ABC";	
		p4.age = "ABC";

		System.out.println(p3==p4);  // checks address, as both objects are different,hence false
		System.out.println(p3.equals(p4));
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof person)
		return true;
		else
			return false;
	}
}
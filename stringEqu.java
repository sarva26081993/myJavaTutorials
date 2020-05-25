
public class stringEqu {

	public static void main(String[] args) {
	
		String s1 = new String("DEF");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2)); // checks content
		System.out.println(s1==s2); // checks memory reference
		
		
		String s3 = "XYZ";
		String s4 =  "XYZ";
		System.out.println(s3.equals(s4)); // checks content
		System.out.println(s3==s4); // checks memory reference // defined value is String constant,thus pushed in String pool 		
		
	}

}

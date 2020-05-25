public class stringTest {
	public static void main(String[] args) {
	String s1 = new String("Paul");
	String s2 = new String("Paul");
	String s3 = "Paul";
	String s4 = "Paul";		//prior to creating new object ,java searches occurrence of exact same value in pool of string object
	//System.out.println("abc");
	String s5 =  new String( "abc");
	System.out.println("abc"=="abc");
	//System.out.println(s1==s3);
	//System.out.println(s2==s3);
	//System.out.println(s3==s4);  //value Paul is stored in Pool of String objects,thus Java uses sort of caching mechanism	
	}
}

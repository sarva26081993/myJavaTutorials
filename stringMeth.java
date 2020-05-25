public class stringMeth {
	public static void main(String[] args) {
		String s1 = new String("AHello how are you?");
		String s2 = new String("abcdefghiz234cde");
		String s3 = new String("Hello World");
		
		//**************charAt(index)**************************8aa
		char a1= s2.charAt(1);	//returns character at specified index i.e. 1 in this case
		System.out.println(a1);
		
		int a2 =  s2.charAt(1); //returns unicode value of character
		System.out.println(a2);
		
		//***********indexOf("pattern or string")***************	
		int a3 = s1.indexOf(97);  //treats 65 as unicode value and a3 stores index of matching unicode character if found, if not found then -1 
		System.out.println(a3);
		
		int a4 = s2.indexOf("cde"); //if pattern is repetitive,then index of 1st char of 1 appearing pattern
		System.out.println(a4);
		
		int a5 = s3.indexOf('o',6); // 5 denotes starting position of search, so chars at 0 to 4 won't be taken into consideration 
		System.out.println(a5);

		
		//substring
		
	}

}

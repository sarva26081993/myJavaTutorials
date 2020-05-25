
public class mytest1 {

	public static void main(String[] args) {
		phone p1;
		p1 = new phone();
		p1.setnum();
		System.out.print(p1.pn);
		

	}

}

class phone {
	String pn;
	void setnum() {
		String pn;
		pn ="8080";
	}
	
}

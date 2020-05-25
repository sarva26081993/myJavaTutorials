public class testemethod {
public static void main(String[] args) {	
phones p = new phones();
double weight = p.add(20,30);
	}
}
class phones {
	public double add( int ad1, int ad2) {
		return ad1+ad2;		
	}
	
	public double add (int ad1, double ad2) {
		return ad1+ad2;
	}
}

/////////////////////////////////////////////////////////////////////////////////////////


//public class testemethod {
//public static void main(String[] args) {	
//phones p = new phones();
//double weight = p.setwt(20);
//	}
//}
//class phones {
//	public void setwt(int a) {
//				System.out.println(a);			
//	}
//}
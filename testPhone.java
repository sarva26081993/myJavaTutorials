class phoneee {
	public int wt;	
	phoneee(int weight)
	{
		wt = weight;
	}
	public void setwt(int wt)
	{	this.wt = wt;}
	public int getwt()
	{return wt;}
}
public class testPhone {

	public static int updatewt(int wt ) {
		System.out.println(wt);
		wt++;
		System.out.println(wt);
		return wt;
		
	}
	public static void main(String[] args) {
		phoneee p1 =  new phoneee(20);
		p1.setwt(90);
		System.out.println(p1.wt);
		updatewt(p1.wt);
		System.out.println(p1.wt);
		
	}
}


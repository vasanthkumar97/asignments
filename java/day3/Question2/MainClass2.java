

public class MainClass2 {
	public static void main(String arp[])
	{
		Cycle[] cyc_obj=new Cycle[3];
		cyc_obj[0]=new Unicycle();
		cyc_obj[1]=new Bicycle();
		cyc_obj[2]=new Tricycle();
//		cyc_obj[0].balance();
//		cyc_obj[1].balance();
//		cyc_obj[2].balance();
		// error because balance is issing in cycle class
		System.out.println(new Bicycle().balance());
		
		

	}
}

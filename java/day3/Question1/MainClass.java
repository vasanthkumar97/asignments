

public class MainClass {
	public static void main(String ar[])
	{
		Rodent[] rodent_ar=new Rodent[3];

		rodent_ar[0]= new Mouse();
		rodent_ar[1]= new Gerbil();
		rodent_ar[2]= new Hamster();
		System.out.println(rodent_ar[0].getLegs());
		System.out.println(rodent_ar[1].getColor());
		System.out.println(rodent_ar[2].getLegs());
//		System.out.println(rodent_ar[2].check());
		

				
	}
}

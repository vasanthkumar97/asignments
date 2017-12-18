public class VasanthAssigmentMain {
	public static void main(String ar[])
	{
		VasanthAssignmentData data_obj=new VasanthAssignmentData();
		data_obj.print();
		data_obj.printLocal();
		VasanthAssignmentSingleton object=VasanthAssignmentSingleton.initialiseString("hello");
		object.printString();
	}
}
//class VasanthAssignmentSingleton {
//	String some_string;
//	public static VasanthAssignmentSingleton initialiseString(String str)
//	/*
//	 * initialising static member inside static method is not possible
//	 */
//	{
//		//some_string=str;
//		return new VasanthAssignmentSingleton();
//	}
//	public void printString()
//	{
//		System.out.println(some_string);
//	}
//	
//}


//class VasanthAssignmentData {
//	int number;
//	char character;
//	public void print()
//	{
//		System.out.println(number+""+character);
//	}
//	public void printLocal()
//	/*
//	 * printing unintialised local variables is not supported
//	 */
//	{
//		int a,b;
//		//System.out.println(a+""+b);
//
//	}
//}

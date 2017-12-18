
public class VasanthAssignmentSingleton {
	String some_string;
	public static VasanthAssignmentSingleton initialiseString(String str)
	/*
	 * initialising static member inside static method is not possible
	 */
	{
		//some_string=str;
		return new VasanthAssignmentSingleton();
	}
	public void printString()
	{
		System.out.println(some_string);
	}
	
}

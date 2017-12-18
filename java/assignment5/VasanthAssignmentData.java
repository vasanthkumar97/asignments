
public class VasanthAssignmentData {
	int number;
	char character;
	public void print()
	{
		System.out.println(number+""+character);
	}
	public void printLocal()
	/*
	 * printing unintialised local variables is not supported
	 */
	{
		int a,b;
		//System.out.println(a+""+b);

	}
}

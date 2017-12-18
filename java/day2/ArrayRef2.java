package assignment.day2;

public class ArrayRef2 {
	public static void main(String args[])
	{
		SomeClass2[] ar=new SomeClass2[3];
		String[] arguments= {"hello","hie","bye"};
		for(int each=0;each<arguments.length;each++)
		{
			ar[each]=new SomeClass2(arguments[each]);
		}
	}
}

class SomeClass2
{
	SomeClass2(String arg)
	{
		System.out.println(arg);
	}
}
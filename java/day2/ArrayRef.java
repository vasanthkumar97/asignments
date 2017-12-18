package assignment.day2;

public class ArrayRef {
	public static void main(String args[])
	{
		SomeClass[] ar;
		String[] arguments= {"hello","hie","bye"};
		for(String str:arguments)
		{
			new SomeClass1(str);
		}
	}
}

class SomeClass1
{
	SomeClass1(String arg)
	{
		System.out.println(arg);
	}
}
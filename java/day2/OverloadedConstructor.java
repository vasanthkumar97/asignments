package assignment.day2;

public class OverloadedConstructor {
	public static void main(String ar[])
	{
		SomeClass object=new SomeClass();
	}
}

class SomeClass
{	
	SomeClass()
	{
		SomeClass local_object=new SomeClass(5);
	}
	SomeClass(int a)
	{
		System.out.println("second constructor");
	}
}



public class SampleClass extends ConcreteClass implements IInterface4{
	public String method1() {
		return "method 1";
	}
public void method2() {
	System.out.println("method 2");

	}
public String method3() {
	return "method 3";

}
public void method4() {
	System.out.println("method 4");

}
public String method5() {
	return "method 5";

}
public void method6() {
	System.out.println("method 6");

}
public String method7() {
	return "method 7";

}
//*****************************//

public void interface1(IInterface1 interface_object)
{
	System.out.println(interface_object.method1());
}
public void interface2(IInterface2 interface_object)
{
	System.out.println(interface_object.method3());

}
public void interface3(IInterface3 interface_object)
{
	System.out.println(interface_object.method5());

}
public void interface4(IInterface4 interface_object)
{
	System.out.println(interface_object.method7());

}

}

public class MainClass
{
    public static void main(String ar[])
    {
        try{
            MainClass.method();
        }
        catch (Exception exp)
        {
            System.out.println(exp);
        }
        finally {
            System.out.println("in finally");
        }
    }

    static void method() throws MyException1,MyException2,MyException3
    {
        System.out.println("in method");

    }
}
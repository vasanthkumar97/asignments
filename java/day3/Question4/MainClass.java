public class MainClass
{
    public static void main(String ar[])
    {
        Cycle unicycle = Factory.getCycle("unicycle");
        Cycle bicycle = Factory.getCycle("bicycle");

        Cycle tricycle = Factory.getCycle("tricycle");
        System.out.println("Factory unicycle Config::"+unicycle);
        System.out.println("Factory bicycle Config::"+bicycle);
        System.out.println("Factory tricycle Config::"+tricycle);
    }

}

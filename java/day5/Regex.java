import java.util.Scanner;
import java.util.regex.*;

public class Regex
{
    public static void main(String ar[])
    {
        Scanner scanner=new Scanner(System.in);
        String sentence=scanner.nextLine();
        if (Pattern.matches("^[A-Z](.)*\\.$",sentence))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");

        }

    }
}
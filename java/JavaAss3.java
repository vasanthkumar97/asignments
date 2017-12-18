
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.Scanner;

public class JavaAss3 {
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		String server_name=sc.nextLine();
		long currentTime = System.currentTimeMillis();
		Boolean isPinged=false;
		try
		{
		String[] command = { "cmd.exe", "/C", "ping "+server_name };
		Process child = Runtime.getRuntime().exec(command);
		currentTime = System.currentTimeMillis() - currentTime;
	    System.out.println("pinged successfully in "+ currentTime+ "millisecond");
		}
		catch(Exception e)
		{
		    System.out.println("PIng failed.");
		}
		
		sc.close();
	}
}

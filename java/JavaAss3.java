
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
		InetAddress inet = InetAddress.getByName(server_name);
		inet.isReachable(5000);

		currentTime = System.currentTimeMillis() - currentTime;
	    System.out.println("pinged successfully in "+ currentTime+ "millisecond");
		}
		catch(Exception e)
		{
			System.out.println(e);

			System.out.println("Ping failed.");
		}
		
		sc.close();
	}
}

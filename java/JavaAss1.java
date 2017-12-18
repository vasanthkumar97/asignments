
import java.util.* ;
import java.io.File;
import java.util.regex.*;
class JavaAss1
{
	public static void main(String args[])
	{	
	   Scanner sc=new Scanner(System.in);  
	System.out.println("enter file pattern");  
	String file_pattern=sc.nextLine();  
     	   while(true)
	   {
		Pattern pattern = Pattern.compile(file_pattern);

	try
	{  
	File folder = new File("/home");
	File[] listOfFiles = folder.listFiles();
	for(File fil:listOfFiles)
	{	
		Matcher m = pattern.matcher(fil.getName()); 
		if (m.find())
			System.out.println(fil.getAbsolutePath());
	}
	
	System.out.println("enter file pattern or quit to quit");  
	file_pattern=sc.nextLine();  


}
	catch(Exception e)
	{continue;
	}

	}


}
}

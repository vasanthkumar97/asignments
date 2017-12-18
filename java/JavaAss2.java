import java.util.*;

public class JavaAss2
{public static void main(String args[])
{Scanner sc=new Scanner(System.in);
String input_word=sc.nextLine();

String distinct_lower="";
for(int i=0;i<input_word.length();i++)
{
	char current_char=input_word.charAt(i);
	if (current_char>='a'&&current_char<='z'&&distinct_lower.contains(Character.toString(current_char))==false)
		distinct_lower+=current_char;
}
if(distinct_lower.length()==26)
	System.out.println("True");
else
{System.out.println("false");
}	
	

}
}

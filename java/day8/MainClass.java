import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class MainClass
{
    public static void main(String ar[]) throws IOException
    {
        String content = new String(Files.readAllBytes(Paths.get(ar[0])));
        Map <Character,Integer> map=new HashMap<Character,Integer>();
        for(int each=0;each<content.length();each++)
        {
            if (map.containsKey(content.charAt(each)))
            {
                map.put(content.charAt(each),map.get(content.charAt(each))+1);
            }
            else
            {
                map.put(content.charAt(each),1);
            }
        }
        System.out.println(map);

    }
}


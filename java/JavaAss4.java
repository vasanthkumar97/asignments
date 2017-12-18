
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class JavaAss4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String[] dates=input.split(" ");
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dates[0].replace('-','/'));
			Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(dates[1].replace('-','/'));
			Instant instant = date1.toInstant();
			ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
			LocalDate date = zdt.toLocalDate();
			LocalDate plus=date.plusDays(30);
			LocalDate minus=date.minusDays(30);
			System.out.println(minus+"          "+plus);

		} catch (Exception e) {
		    e.printStackTrace();
		}
		sc.close();
	}
}

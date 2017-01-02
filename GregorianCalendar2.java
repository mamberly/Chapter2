import java.util.GregorianCalendar;
import java.util.Calendar;
public class GregorianCalendar2
{
public static void main(String[] args)
{
GregorianCalendar cal = new GregorianCalendar();//Today's Date
GregorianCalendar megsbday = new GregorianCalendar(1998, Calendar.AUGUST, 7);
cal.add(Calendar.DAY_OF_MONTH, 100);
int in100 = cal.get(Calendar.DAY_OF_MONTH);
int day100 = cal.get(Calendar.DAY_OF_WEEK);
// cal = cal.set(Calendar.YEAR, 1998);
// cal = cal.set(Calendar.MONTH, Calendar.AUGUST);
// cal = cal.set(Calendar.DAY_OF_MONTH, 7);
int megWkDay = megsbday.get(Calendar.DAY_OF_WEEK);
megsbday.add(Calendar.DAY_OF_MONTH, 10000);
int megYear = megsbday.get(Calendar.YEAR);
int megMonth = megsbday.get(Calendar.MONTH);
int megDay = megsbday.get(Calendar.DAY_OF_MONTH);
System.out.println("In 100 days from now, the date will be: " + in100);
System.out.println("In 100 days from now, the day of the week will be: "+ day100);
System.out.println("My birthday is on this day of the week: " + megWkDay);
System.out.println("In 10000 days, my bday will be on: " + megMonth + "/" + megDay + "/" + megYear);
}
}

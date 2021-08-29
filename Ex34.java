//34.Write a JAVA program to display the current date and time.  
 
import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      System.out.println("Display the current time and date:");
      System.out.println("------------------------------------------");
      int day, month, year,weekday,dayofyear;
      boolean daylight;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      weekday=date.get(Calendar.DAY_OF_WEEK);
      dayofyear=date.get(Calendar.DAY_OF_YEAR);
      daylight=TimeZone.getDefault().inDaylightTime( new Date());
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
      System.out.println("Seconds:"+second);
      System.out.println("Minutes:"+minute);
      System.out.println("Hours:"+hour);
      System.out.println("Day of month:"+day);
      System.out.println("Month of year:"+(month+1));
      System.out.println("Year:"+year);
      System.out.println("Weekday:"+weekday);
      System.out.println("Day of year:"+dayofyear);
      System.out.println("Daylight savings:"+daylight);
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}

//OUTPUT
//Display the current time and date:
//------------------------------------------
//Seconds:18
//Minutes:28
//Hours:10
//Day of month:29
//Month of year:8
//Year:2021
///Weekday:1
//Day of year:241
//Daylight savings:false
//Current date is  29/8/2021
//Current time is  10 : 28 : 18

//[Program finished]

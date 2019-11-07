package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();


        System.out.println(d);


        String today = null;
        Date date = new Date();
        System.out.println(date);
         SimpleDateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss", Locale.UK);


         Calendar cal = Calendar.getInstance(); cal.setTime(date);
         cal.add(Calendar.MINUTE, 10);
         today = format.format(cal.getTime());
         System.out.println("10분후 : " + today);
         cal.setTime(date);
         cal.add(Calendar.HOUR, +1);
         today = format.format(cal.getTime());
         System.out.println("1시간 후 : " + today); cal.setTime(date);



        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(time.HOUR);
        int minute = time.get(time.MINUTE);

        System.out.println(hour + " : " + minute);


    }
}

package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class seeDate {
    public static void main(String[] args) {


        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);


        String time1 = format1.format(cal.getTime());
        String hour2 = time1.substring(11, 13);
        String minute2 = time1.substring(14, 16);

        System.out.println(hour + " : " + minute);
        System.out.println(time1);
        System.out.println(now);
        System.out.println(hour2 + " : " + minute2);

    }
}

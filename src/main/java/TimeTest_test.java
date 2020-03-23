import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTest_test {

    public static void main(String[] args) {




        // 시간 더하는 프로그램~
        long retryDate = System.currentTimeMillis();
        int sec = 600;
        Timestamp original = new Timestamp(retryDate);
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(original.getTime());
        cal.add(Calendar.SECOND, sec);
        Timestamp later = new Timestamp(cal.getTime().getTime());
        System.out.println(original); System.out.println(later);

    }


}


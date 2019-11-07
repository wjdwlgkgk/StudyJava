package Study.Car_ex.util;

import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        //Calendar 클래스는 추상클래스이므로 직접 객체 생성 불가능하고, 아래처럼 getinstance를 통해서만 생성 가능.
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        System.out.println(year + "년" + mon + "월" + day + "일");
        System.out.println(hour + "시" + min + "분" + sec + "초");
        System.out.println(cal.getTime());
        System.out.println(cal.getTime().toLocaleString());
    }
}

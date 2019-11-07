package Study.Car_ex.util;

import java.util.Formatter;

public class FormatterC {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Formatter formatter = new Formatter(sb);
        //Formatter format(String format, Object... obj) -> 첫번째는 무조껀 스트링 -> 변환 할 스트링 값이고(중간에 %로 시작하는 format을 지정함 format문자열 Object타입의 가변형 매개변수 갯수와 동일해야함
        //, 두번째 이상은 가변 매개 변수. 가변의 이유 : 몇개의 데이터를 형식화 할 것인지 사전에 확정할 수 없기 때문에 가변적 매개변수를 사용함.
        // 데이터 타입별 : %B 대문자 boolean, %b 소문자 boolean, %C 문자형 데이터 사용, %c 문자형 데이터 사용, %d, %e, %f, %x 16, %o 8 , %s, %t, %n 개행, %% %사용할때
        // %t 날짜 format : %tA, %tY 년, %tB 월, %tm, %te 일, %tk 시, %tl, %tM 분, %tS 초, %tZ
        // Formatter 클래스를 사용하기 위해서는 Appendable 인터페이스를 구현 값을 new 인자 안에 넣어주어야한다.
        // 대표적인 Appendable 인터페이스로는 StringBuffer가 있다.

    }
}

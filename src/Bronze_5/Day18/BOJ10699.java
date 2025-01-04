package Bronze_5.Day18;

import java.text.SimpleDateFormat;
import java.util.Date;


public class BOJ10699 {

    public static void main(String[] args) {
        Date date = new Date();
        // day의 형식은 소문자d로 해야 함
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(formatter.format(date));
    }
}

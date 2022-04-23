package Day17;

import java.util.Calendar;
import java.util.GregorianCalendar;

class ExceptionTest{
    GregorianCalendar deadline = new GregorianCalendar(1999,11,31);
    GregorianCalendar now = new GregorianCalendar();

    int month = now.get(Calendar.MONTH);
    int weekDay  =now.get(Calendar.DAY_OF_WEEK);

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

    }
}

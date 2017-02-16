package ua.itea.less01FormatterAndIO;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/26/17
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /*InputStream i = new ByteArrayInputStream();
        System.out.println(i.markSupported());*/
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale("ru"));
        Calendar c = Calendar.getInstance(new Locale("ru"));
        Date date = new Date();
        //System.out.println(date);
        System.out.println(gregorianCalendar);

    }
}

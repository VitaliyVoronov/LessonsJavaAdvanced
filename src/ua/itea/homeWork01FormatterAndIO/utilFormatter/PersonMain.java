package ua.itea.homeWork01FormatterAndIO.utilFormatter;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/29/17
 */

import java.util.GregorianCalendar;

/**
 * Утилитные классы для фоматирования
 util/formatter
 1. Format. Дополнить класс Person внутренним enum (формат) с константами SHORT, MEDIUM, LONG и
 возможностью печатать Person в указанный PrintStream (например System.out или System.err),
 в указанном (одном из трех) формате. Выводимые поля и их конечный формат выберите на свое усмотрение.
 Дата рождения человека должна выводится в принятом у нас формате (в нашей локале).

 2. Format. Дополнить класс Person реализацией ин-фейса Formattable для вывода через %s

 [3. Format. При форматировании учитывать FormattableFlags
 */
public class PersonMain {
    public static void main(String[] args) {
        Person pers = new Person("Vasya","Petrov",true,new GregorianCalendar(2000,05,16), new PhoneNumber("+380", "44", "5787684"),
                Person.Temperament.MELANCHOLIC);

        pers.showPersonInfo(Person.Format.LONG,System.out);

        /*System.out.format("1 : '%s'\n", pers);
        System.out.format("2: '%20.15s'\n", pers);
        System.out.format("3: '%-10.5s'\n", pers);
        System.out.format("4: '%S10.5s'\n", pers);*/
    }
}

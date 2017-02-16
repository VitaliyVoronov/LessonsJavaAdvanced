package ua.itea.homeWork02Generics;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Formattable;
import java.util.Formatter;
import java.util.GregorianCalendar;

import static java.util.FormattableFlags.LEFT_JUSTIFY;
import static java.util.FormattableFlags.UPPERCASE;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/26/17
 */

class Person implements Formattable {

    private String name;
    private String surName;
    private boolean gender;
    private int age;
    private Calendar birthDay;
    private PhoneNumber phoneNumber;
    private Temperament temperament;

    enum Temperament{SANGUINE, PHLEGMATIC, SUPINE, CHOLERIC, MELANCHOLIC}
    enum Format{SHORT,MEDIUM,LONG}

    public Person(String name, String surName, boolean gender, Calendar birthDay, PhoneNumber phoneNumber,
                  Temperament temperament ){
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.age = calcAge();
        this.phoneNumber = phoneNumber;
        this.temperament = temperament;
    }

    @Override
    public void formatTo(Formatter formatter, int flag, int width, int precision) {

        StringBuilder sb = new StringBuilder();

        if (precision == -1) {
            sb.append(toString());
        } else if (toString().length() < precision) {
            sb.append(toString());
        } else {
            sb.append(toString().substring(0, precision-1)).append('*');
        }

        // Применяем выравнивание и задаем ширину
        if ((width != 0) && (sb.length() < width)) {
            for (int i = 0, n=sb.length(); i < width - n; i++) {
                if ((flag & LEFT_JUSTIFY) == LEFT_JUSTIFY) {
                    sb.append(' ');
                } else {
                    sb.insert(0, ' ');
                }
            }
        }
        if ((flag & UPPERCASE) == UPPERCASE){
            formatter.format(sb.toString().toUpperCase());
        } else {
            formatter.format(sb.toString());
        }
    }


    @Override
    public String toString(){
        String bd = getName()+", "+getSurName()+", "+getAge()+", "+getGender()+", "
                +getTemperament()+", "+getPhoneNumber().getFullNumber()+", "
                + getBirthDay().get(Calendar.DAY_OF_MONTH)+"."+getBirthDay().get(Calendar.MONTH)+"."
                +getBirthDay().get(Calendar.YEAR);
        return bd;
    }

    private int calcAge(){
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear  = currentDate.get(Calendar.YEAR);
        int currentDayOfYear = currentDate.get(Calendar.DAY_OF_YEAR);
        int birthDayYear  = birthDay.get(Calendar.YEAR);
        int birthDayOfYear = birthDay.get(Calendar.DAY_OF_YEAR);
        if (birthDayOfYear > currentDayOfYear){
            return currentYear - birthDayYear - 1;
        } else {
            return currentYear - birthDayYear;
        }
    }

       @Override
    public boolean equals(Object another){
        if (this == another) return true;
        if (another == null) return false;
        if (this.getClass() != another.getClass()) return false;
        Person p = (Person) another;
        return (name.equals(p.name) && (gender == p.gender) && (age == p.age) &&
                birthDay.equals(p.birthDay) && phoneNumber.equals(p.phoneNumber));
    }

    public void showPersonInfo(Format f, PrintStream out){
        String str = "";
        switch (f) {
            case SHORT:
                str += getName()+", "+getSurName();
                break;
            case MEDIUM:
                str += getName()+", "+getSurName()+", "+getAge()+", "+getGender()+", "+getPhoneNumber().getSubscriberNumber();
                break;
            case LONG:
                str += getName()+", "+getSurName()+", "+getAge()+", "+getGender()+", "
                        +getTemperament()+", "+getPhoneNumber().getFullNumber()+", "
                        + getBirthDay().get(Calendar.DAY_OF_MONTH)+"."+getBirthDay().get(Calendar.MONTH)+"."
                        +getBirthDay().get(Calendar.YEAR);
        }
        out.println(str);

    }

    public String getName(){
        return name;
    }

    public String getSurName(){
        return surName;
    }

    public int getAge(){
        return age;
    }

    public Calendar getBirthDay(){
        return birthDay;
    }

    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }

    public Temperament getTemperament(){
        return temperament;
    }

    private String getGender(){
        if(gender){
            return "male";
        }
        else {
            return "female";
        }
    }
}
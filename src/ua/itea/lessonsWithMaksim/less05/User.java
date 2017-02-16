package ua.itea.lessonsWithMaksim.less05;

/**
 * Created by vitaliy on 12/5/16.
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String birth_date;
    private String sex;
    private String city;

    public User(int id, String firstName, String lastName, String birth_date, String sex, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth_date = birth_date;
        this.sex = sex;
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }
}

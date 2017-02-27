package ua.itea.homeWorkDesignPatterns.PrototypePattern;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/27/17
 */
public class User implements Cloneable {

    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public String toString(){
        return "name: "+getName()+", surname: "+getSurname()+", age: "+getAge()+";";
    }
}

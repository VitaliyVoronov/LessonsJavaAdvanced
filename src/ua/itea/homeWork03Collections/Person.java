package ua.itea.homeWork03Collections;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/5/17
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return ""+getName()+" "+getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person pers = (Person) obj;
        if (!name.equals(pers.getName()))
            return false;
        if (age != pers.age)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + name.hashCode();
        return result;
    }

}

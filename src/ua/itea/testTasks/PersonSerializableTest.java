package ua.itea.testTasks;

import java.io.Serializable;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/3/17
 */
public class PersonSerializableTest implements Serializable {

    private int id;
    private String name;
    private Integer age;

    public PersonSerializableTest(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString(){
        return "ID: "+getId()+", Name: "+getName()+", Age: "+getAge();
    }
}

package ua.itea.additionalLesson;

import java.io.*;

/**
 * Additional lesson ITEA with Alexander Sulzhenko
 *
 * Object Serialization example with interfaces: Serializable(and use transient for example) and Externalizable
 * @author vitaliy
 * @version 1.0
 * @since 2/4/17
 */
public class DemoSerializableMainAndPerson {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Viktor",49L);
        //try with resources
        try (FileOutputStream fos = new FileOutputStream("2.bin")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        readAndPrint();

    }

    private static void readAndPrint() throws IOException {
        Person person = null;
        try (FileInputStream fin = new FileInputStream("2.bin")) {
            ObjectInputStream ois = new ObjectInputStream(fin);
            person = (Person) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }

}

class Person implements Externalizable /*Serializable*/ {
    private String name;

    //transient told that this variable not serializable
    private transient Long age;
    public Person(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    //When we use externalizable we have to write default constructor
    public Person() {
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeLong(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        age = in.readLong();
    }
}
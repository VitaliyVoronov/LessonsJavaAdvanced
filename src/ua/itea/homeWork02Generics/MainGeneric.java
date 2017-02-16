package ua.itea.homeWork02Generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/31/17
 */
public class MainGeneric {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Array arr = new Array();
        //Task one
//        Integer[] arrInt =  {20,19,68,45};
//        System.out.println(arr.countLowerElementsFromArray(arrInt, 36));

        //Task two
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add((int)(20 + (Math.random() * ((200 - 20) + 1))));
            System.out.print(list.get(i)+", ");
        }
        System.out.println();
        System.out.println(arr.sortAndMinus(list));

        //Task three
//        Department department = new Department("Marketing");
//        department.addEmployee(new Employee("Petya","Petrov",true,new GregorianCalendar(2000,05,16), new PhoneNumber("+380", "44", "5787684"),
//                Person.Temperament.MELANCHOLIC));
//        department.addEmployee(new Employee("Kolya","Ivanov",true,new GregorianCalendar(1997,05,16), new PhoneNumber("+380", "44", "5787684"),
//                Person.Temperament.MELANCHOLIC));
//        System.out.println(department.averageAge());
//        System.out.println(department.hasSameAverageAge(department,17.5));




        //Task four
//        RandomInputStream ris = new RandomInputStream();
//        NumArray<LazyBigInteger> numArr = new NumArray<>();
//        for (int i = 0; i < 5; i++) {
//            numArr.add(new LazyBigInteger(""+ris.readAllFromFile()));
//        }
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("numArray.txt"));
//        oos.writeObject(numArr);
//        oos.flush();
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("numArray.txt"));
//        NumArray nArr = (NumArray) ois.readObject();
//        System.out.println(nArr);

    }
}

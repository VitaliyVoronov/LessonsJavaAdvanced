package ua.itea.homeWork03Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Iterators. Написать метод  filter(..) который принимает множество Person и параметр возраст.
 * Возвращает новое множество, содержащее только людей равных и старше указанного возраста.
 * Продемонстрировать использование.
 * @author vitaliy
 * @version 1.0
 * @since 2/5/17
 */
public class Iterators {

    public Set<Person> filter(Set<Person> persons, int age){
        Set<Person> resultPersons = new HashSet<>();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getAge() == age){
                resultPersons.add(person);
            }
        }
        return resultPersons;
    }
}

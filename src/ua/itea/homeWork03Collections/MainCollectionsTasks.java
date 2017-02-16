package ua.itea.homeWork03Collections;


import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Homework with collections
 *
 * Tasks: TryingOutList, QueueWrapper, SetMath
 * @author vitaliy
 * @version 1.0
 * @since 2/4/17
 */
public class MainCollectionsTasks {
    public static void main(String[] args) throws IOException {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Max");
        treeSet.add("Toha");
        treeSet.add("Vova");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        //Translator task
//        MyTranslator myTranslator = new MyTranslator();
//        String text = "There was a proud teak tree in the forest. He was tall and strong. " +
//                "There was a small herb next to the tree.";
//        System.out.println(myTranslator.translateAllEnglishTextToRussian(text));

//        //Iterator task
//        Iterators iterators = new Iterators();
//        Set<Person> persons = new HashSet<>();
//        persons.add(new Person("Alex",35));
//        persons.add(new Person("Petya", 29));
//        persons.add(new Person("Vitya", 43));
//        persons.add(new Person("Alex", 35));
//        Person person = new Person("Vova", 30);
//        persons.add(person);
//        persons.add(person);
//
//        System.out.println(persons);
//        System.out.println(iterators.filter(persons,35));

//        //SetMath task
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set2.add(3);
//        set2.add(4);
//
//        SetMath setMath = new SetMath();
//        System.out.println("Union: "+setMath.unionSets(set1,set2));
//        System.out.println("Intersection: "+setMath.intersectionSet(set1,set2));
//        System.out.println("Difference: "+setMath.differenceSet(set1,set2));


//        //TryingOutList task
//        TryingOutList<String> tryingOutList = new TryingOutList();
//        List<String> list1 = new ArrayList();
//        List<String> list2 = Collections.unmodifiableList(list1);
//        list2.add("dd");
//
//        List<String> list = new ArrayList<>();
//        String[] arrStr = {"ffff", "gggg","rrrr"};
//        tryingOutList.asList(arrStr,list);
//        System.out.println(list);
//
//        tryingOutList.printRm();


        //QueueWrapper task
//        QueueWrapper qw = new QueueWrapper();
//        Queue<Integer> queue = new ConcurrentLinkedQueue<>(); //new LinkedList<>();
//        queue.add(34);
//        queue.add(67);
//        queue.add(78);
//        List list = qw.asList(queue);
//        System.out.println(list);
//        queue.add(99);
//        queue.add(111);
//        queue.poll();
//        System.out.println(queue);
//        System.out.println(list);

        //SetMath setMath = new SetMath();

    }
}

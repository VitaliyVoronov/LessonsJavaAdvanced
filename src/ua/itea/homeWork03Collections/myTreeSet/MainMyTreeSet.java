package ua.itea.homeWork03Collections.myTreeSet;

import java.util.Comparator;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/8/17
 *
 */
public class MainMyTreeSet {

    public static void main(String[] args) {

        //MyTreeSetImpl<String> set = new MyTreeSetImpl<>();

        MyTreeSetImpl<String> mts = new MyTreeSetImpl<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(mts.add("Pe"));
        System.out.println(mts.add("Vasyaj"));
        mts.add("Kolyanich");
        mts.add("Dimon");
        mts.add("Ann");
        mts.add("Enn");
        System.out.println(mts.size());
        mts.showAllElements();
//        mts.remove("Petya");
//        System.out.println(mts);
//        Iterator iterator = mts.iterator();
//        iterator.next();
//        iterator.remove();
//        System.out.println(mts);
    }
}

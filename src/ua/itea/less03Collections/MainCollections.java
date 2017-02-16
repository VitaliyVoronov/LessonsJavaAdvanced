package ua.itea.less03Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/6/17
 */
public class MainCollections {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("three", 3);
        System.out.println(map);
    }
}

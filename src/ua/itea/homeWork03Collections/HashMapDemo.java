package ua.itea.homeWork03Collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * в HashMapDemo добавить пару пар ключ/значение затем при итерировании по EntrySet сделать в Map
 * перевод значений на англ. язык (entrySet.value()?)
 * проитерироваться по коллекции значений и поудалять все пустые значения(проверка на Null)
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/7/17
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("hi", "привет");
        hashMap.put("all", "все");
        hashMap.put("big", "большой");
        hashMap.put("no",null);

//        for (Map.Entry entry: hashMap.entrySet()){
//            String key = (String) entry.getKey();
//            entry.setValue(key);
//            String value = (String) entry.getValue();
//            System.out.println(key+" - "+value);
//        }

        for (Map.Entry entry: hashMap.entrySet()){
            if (entry.getValue() == null){
                hashMap.remove(entry.getKey());
            }
        }
        System.out.println(hashMap);
    }


}

package com.nikoleta;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        KeyValue<String, Integer> firstMap = new KeyValue<String, Integer>("First", 1);
        KeyValue<String, Integer> secondMap = new KeyValue<String, Integer>("Second", 2);
        KeyValue<String, Integer> thirdMap = new KeyValue<String, Integer>("Third", 3);

        Collection<KeyValue<String, Integer>> keyValueCollection = new ArrayList<KeyValue<String, Integer>>();
        keyValueCollection.add(firstMap);
        keyValueCollection.add(secondMap);
        keyValueCollection.add(thirdMap);

        String[] keysArr = {"First", "Third"};

        Integer[] ar = new Integer[keysArr.length];
        Class componentType = ar.getClass().getComponentType();

        Integer[] values =firstMap.returnValues(keyValueCollection, keysArr, componentType );
        for (Integer value : values){
            System.out.println(value);
        }
    }
}

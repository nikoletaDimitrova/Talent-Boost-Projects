package com.nikoleta;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class KeyValue<K, V> {
    public K key;
    public V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public V[] returnValues(Collection<KeyValue<K,V>> keyValues,K[] keyArr,Class<?> componentType){
        V[] values = (V[]) Array.newInstance(componentType, keyArr.length);
        int indexOfValueArr=0;

        for(int i =0; i<keyArr.length; i++) {
            Iterator<KeyValue<K,V>> iterator = keyValues.iterator();
            while (iterator.hasNext()) {
                KeyValue<K, V> keyValueObject = iterator.next();
                K keyFromArr = keyArr[i];

                if (keyValueObject.getKey().equals(keyFromArr)) {
                    Array.set(values, indexOfValueArr, keyValueObject.value);
                    indexOfValueArr++;
                }
            }
        }
        return values;
    }

}

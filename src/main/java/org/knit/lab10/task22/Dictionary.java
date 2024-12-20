package org.knit.lab10.task22;

import java.util.HashMap;
import java.util.Map;

public class Dictionary <K, V> {
    private Map<K, V> dictionary;
    public Dictionary(){
        dictionary = new HashMap<>() ;
    }
    public V getValue(K key){
        return dictionary.get(key);
    }
    public void put(K key, V value){
        dictionary.put(key,value);
    }
    public boolean containsKey(K key) {
        return dictionary.containsKey(key);
    }
    public boolean containsValue(V value) {
        return dictionary.containsValue(value);
    }
    public Iterable<K> keys() {
        return dictionary.keySet();
    }
    public Iterable<V> values() {
        return dictionary.values();
    }

    public void remove(K key) {
        dictionary.remove(key);
    }
}

package org.java4term.pr_3;

import java.util.HashMap;
import java.util.Map;

public class SafeMap<K, V> {
    private Map<K, V> map;

    public SafeMap() {
        this.map = new HashMap<>();
    }

    public synchronized V put(K key, V value) {
        return map.put(key, value);
    }

    public synchronized V remove(K key) {
        return map.remove(key);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

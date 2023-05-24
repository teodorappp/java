package isp.lab3.exercise6;

import java.util.Collection;
import java.util.Set;

public class Map<T, T1> implements java.util.Map<String, Integer> {
    public void put(T name, T1 quantity) {
    }

    public boolean containsKey(T name) {
    }

    public T1 get(T name) {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Integer get(Object key) {
        return null;
    }

    @Override
    public Integer put(String key, Integer value) {
        return null;
    }

    @Override
    public Integer remove(Object key) {
        return null;
    }

    @Override
    public void putAll(java.util.Map<? extends String, ? extends Integer> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Integer> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return null;
    }
}

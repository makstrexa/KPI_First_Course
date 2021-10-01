package com.TheoryOfAlgorithms.Lab_8.trying;

public interface Container<K, V> {

    V getValue(K key);

    void setValue(K key, V value);

    void removeValue(K key);

}

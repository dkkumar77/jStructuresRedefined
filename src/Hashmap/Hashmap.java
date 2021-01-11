package Hashmap;

import java.util.LinkedList;

/**
 * Generic Hashmap that uses separate chaining implementation.
 * @param <E>
 */
public class Hashmap<E> {
    private LinkedList[] hashmap;
    private int loadFactor;


    Hashmap(int loadFactor){
        this.loadFactor = loadFactor;
        hashmap = (LinkedList[]) new Object[loadFactor];
    }


    public E add(E value) {
        int _valueHash = value.hashCode();
        int adjustedIndice = _valueHash % loadFactor + 1;
        if (hashmap[adjustedIndice] != null) {
            hashmap[adjustedIndice] = new LinkedList();


        }

        return null;

    }
}

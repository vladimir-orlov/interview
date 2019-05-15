package edu.javacore.collection;

import java.util.AbstractList;
import java.util.List;

public class CheckAbstractList {
    public static void main(String[] args) {
        List<String> customVector = new CustomVector();
        System.out.println("Instance of List: " + (customVector instanceof List));

        for (Class<?> c : CustomVector.class.getInterfaces())
            System.out.println(c);
    }
}

final class CustomVector<E> extends AbstractList<E> {

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
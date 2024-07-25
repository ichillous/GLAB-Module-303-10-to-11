package GLABS.Section11.HashSetsAndProcessing;

import java.util.TreeSet;

public class TreesetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(2);
        numbers2.add(5);
        numbers2.add(6);
        System.out.println("TreeSet: " + numbers2);

        // Using the first() method
        int first = numbers2.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers2.last();
        System.out.println("Last Number: " + last);

    }
}

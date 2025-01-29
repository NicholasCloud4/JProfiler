/**
 * Author: Nicholas Dhannie
 * Date: 02/02/2025
 * This class measures the performance of ArrayList, LinkedList, and Hashtable.
 */

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayListPerformanceMeasure();
        linkedListPerformanceMeasure();
        hashtablePerformanceMeasure();
    }

    private static void arrayListPerformanceMeasure() {
        List<Integer> arrayList = new ArrayList<>();

        // Adding elements

        for (int i = 0; i < 2_000_000; i++) {
            arrayList.add((int) (Math.random() * Integer.MAX_VALUE));
        }

        // Removing elements
        arrayList.clear();
    }

    private static void linkedListPerformanceMeasure() {
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 2_000_000; i++) {
            linkedList.add((int) (Math.random() * Integer.MAX_VALUE));
        }

        linkedList.clear();
    }

    private static void hashtablePerformanceMeasure() {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < 2_000_000; i++) {
            hashtable.put(i, (int) (Math.random() * Integer.MAX_VALUE));
        }

        hashtable.clear();
    }
}

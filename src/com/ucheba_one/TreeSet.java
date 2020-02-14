package com.ucheba_one;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        for (Object element : set)
            System.out.print(element.toString() + " ");

    }
}

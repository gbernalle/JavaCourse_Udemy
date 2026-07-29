package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) {
    
    Set<String> set = new HashSet<>(); // Muito rápido mas não mantém ordem
    
    set.add("TV");
    set.add("Notebook");
    set.add("Tablet");

    set.remove("Notebook");

    System.out.println(set.contains("Notebook"));

    for (String p : set) {
      System.out.println(p);
    }

    System.out.println("-------------- ---------------");

    Set<String> tSet = new TreeSet<>(); // Ordena

    tSet.add("TV");
    tSet.add("Notebook");
    tSet.add("Tablet");

    tSet.removeIf( x -> x.length() >= 3);

    System.out.println(tSet.contains("Notebook"));

    for (String p : tSet) {
      System.out.println(p);
    }

    System.out.println("-------------- ---------------");

    Set<String> lHSet = new LinkedHashSet<>(); // Mantém a ordem

    lHSet.add("TV");
    lHSet.add("Notebook");
    lHSet.add("Tablet");

    System.out.println(lHSet.contains("Notebook"));

    for (String p : lHSet) {
      System.out.println(p);
    }

    System.out.println("-------------- ---------------");
  
    Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 9, 14));
    Set<Integer> b = new TreeSet<>(Arrays.asList(12, 24, 4, 5, 40, 7));


    // Union

    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);
    System.out.println(c);
    System.out.println("-------------- ---------------");

    // Intersection
    Set<Integer> d = new TreeSet<>(a);
    d.retainAll(b);
    System.out.println(d);
    System.out.println("-------------- ---------------");
    
    // Difference
    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);
    System.out.println(e);
  }
}

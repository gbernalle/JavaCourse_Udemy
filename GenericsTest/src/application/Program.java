package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    
    List<Integer> intList = new ArrayList<>();
    intList.add(10);
    intList.add(5);

    List<? extends Number> list = intList; // qualquer tipo que seja subtipo de Number

    Number x = list.get(0);
    System.out.println(x);
    // list.add(20); // Erro, covariância
    
    //  get - ERROR
    //  put - OK
      
    List<Object> myObjs = new ArrayList<>();
    myObjs.add("Maria");
    myObjs.add("Alex");

    List<? super Number> myNums = myObjs; // qualquer tipo que seja supertipo de Number (ou seja, Object)

    myNums.add(10);
    myNums.add(4.4);

    // Number x = myNums.get(0); Contravalência, 
    //     
    // get - ERROR 
    // put - OK     

    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
    List<Double> myDoubles = Arrays.asList(3.14, 6.4);
    List<Object> myObjts = new ArrayList<>();

    copy(myInts, myObjts);
    printList(myObjts);
    copy(myDoubles, myObjts);
    printList(myObjts);

  }

  public static void copy(List<? extends Number> source, List<? super Number> end) {
    for (Number number : source) {
      end.add(number);
    }
  }

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }

}
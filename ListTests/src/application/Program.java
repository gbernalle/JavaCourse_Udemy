package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();

        list.add("Teste01");
        list.add("Teste02");
        list.add("Teste03");
        list.add("Teste04");
        list.add("Teste05");
        list.add("Teste06");
        list.add("Teste06");
        list.add("Julio");
        list.add("Andromeda");
        list.add("Charrete");

        list.add(2, "Deu Certo"); //Isso faz com que seja adicionado na posição. Se tiver dados após, são deslocados
        list.remove("Teste04");
        list.removeIf(x -> x.charAt(0) == 'T');

        for (String obj : list) {
            System.out.println(obj);
        }
        
        System.out.println(list.size());

        System.out.println("Index of Andromeda: " + list.indexOf("Andromeda"));

        System.out.println("--------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());

        for (String obj : result) {
            System.out.println(obj);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}

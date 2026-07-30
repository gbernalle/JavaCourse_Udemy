package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.entities.Product;
import model.services.ProductService;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Predicate
        // list.removeIf(p -> p.getPrice() >= 100);

        // System.out.println(list);

        // for (Product p : list) {
        //     System.out.println(p);
        // }

        // Consumer
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);

        // Function map
        // Stream recebe como parametro um objeto, modifica e retorna a modificacao
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(names);

        ProductService ps = new ProductService();


        // Função que recebe função como parâmetro
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println(sum);


        List<Integer> testes = Arrays.asList(2, 5, 7, 8, 19);
        Stream<Integer> st1 = testes.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));
        
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        int soma = testes.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + soma);

        List<Integer> newList = testes.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        
        System.out.println(Arrays.toString(newList.toArray()));


    }
}

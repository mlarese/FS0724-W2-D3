package epicode.it.stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();

        nomi.add("Mauro");
        nomi.add("Marco");
        nomi.add("Andrea");
        nomi.add("Mario");

        nomi.stream()
                .filter(nome -> !nome.equals("Mario"))
                .map(nome -> "sig. " + nome)

                .forEach(nome -> System.out.println(nome));

        ;


        Stream<String> nomiStream = nomi.stream();

        nomiStream
                .filter(nome -> !nome.equals("Mario"))
                .map(nome -> "sig. " + nome)

                .forEach(nome -> System.out.println(nome));


        System.out.println("--------------------------");
        List<String>listaFiltrata = nomi.stream()
                .filter(nome -> !nome.equals("Mario"))
                .collect(Collectors.toList());

        listaFiltrata.forEach(System.out::println);
    }

}

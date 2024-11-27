package epicode.it.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            Product p = new Product( "Telefono", "Eletronics", 700);
            Product p1 = new Product( "Ipod", "Eletronics", 100);
            Product p2 = new Product( "Tv 45pollici", "Eletronics", 600);
            Product p3 = new Product( "Tv 45pollici", "Eletronics", 100);
            Product p4 = new Product( "Bambola", "Toys", 100);

        List<Product> prodotti = new ArrayList<>();
        prodotti.add(p);
        prodotti.add(p1);
        prodotti.add(p2);
        prodotti.add(p3);
        prodotti.add(p4);


        List<Product> prodottiEletronics = prodotti.stream()
                .filter( pr-> pr.getCategory().equals("Eletronics") && pr.getPrice() > 500   )
                .toList();

        prodottiEletronics.forEach(System.out::println);
        // prodottiEletronics.forEach(  prodotto-> System.out.println(prodotto.toString()) );

        List<Product> prodottiToys = prodotti.stream()
                .filter(pr->pr.getCategory().equals("Toys"))
                .toList();

        System.out.println("--------------------------");
        prodottiToys.forEach(System.out::println);


    }
}

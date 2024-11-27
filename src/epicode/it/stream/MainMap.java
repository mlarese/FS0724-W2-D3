package epicode.it.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        List<Dipendenti> dipendenti = new ArrayList<>();

        dipendenti.add(  new Dipendenti("Mauro", 10000.0));
        dipendenti.add(  new Dipendenti("Carlo", 20000.0));
        dipendenti.add(  new Dipendenti("Andrea", 30000.0));
        dipendenti.add(  new Dipendenti("Mario", 40000.0));


        Double risultato = dipendenti.stream()
                .map(dipendente->dipendente.getStipendio())
                .reduce(0.0, (parziale, stipendio)-> parziale + stipendio);


        System.out.println("Stipendio totale " + risultato);

    }
}

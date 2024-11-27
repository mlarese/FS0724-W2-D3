package epicode.it.map;

// Importazione delle classi necessarie per lavorare con le mappe
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creazione di una mappa per memorizzare i nominativi e le loro età
        Map<String, Integer> nominativi = new HashMap<>();

        // Aggiunta di coppie chiave-valore alla mappa 'nominativi'
        nominativi.put("Aldo", 24); // Chiave: "Aldo", Valore: 24
        nominativi.put("Giovanni", 30); // Chiave: "Giovanni", Valore: 30
        nominativi.put("Giacomo", 40); // Chiave: "Giacomo", Valore: 40

        // Iterazione della mappa 'nominativi' e stampa di ogni elemento
        // Utilizza una lambda che accetta la chiave (nome) e il valore (età)
        nominativi.forEach((nome, eta) ->
                System.out.println("nome: " + nome + " età: " + eta)
        );
        // Output previsto:
        // nome: Aldo età: 24
        // nome: Giovanni età: 30
        // nome: Giacomo età: 40

        // Creazione di una nuova mappa per memorizzare i nominativi e i loro stipendi
        Map<String, Integer> stipendi = new HashMap<>();

        // Aggiunta di coppie chiave-valore alla mappa 'stipendi'
        stipendi.put("Aldo", 24000); // Chiave: "Aldo", Valore: 24000
        stipendi.put("Giovanni", 300000); // Chiave: "Giovanni", Valore: 300000
        stipendi.put("Giacomo", 400000); // Chiave: "Giacomo", Valore: 400000

        // Modifica degli stipendi utilizzando il metodo replaceAll
        // Per ogni coppia (nome, salario):
        // - Se il nome è "Aldo", il salario rimane invariato
        // - Altrimenti, viene aggiunto un bonus di 1000 al salario
        stipendi.replaceAll((nome, salario) ->
                nome.equals("Aldo") ? salario : salario + 1000
        );

        // Iterazione della mappa 'stipendi' e stampa di ogni elemento aggiornato
        stipendi.forEach((nome, stipendio) ->
                System.out.println("nome: " + nome + " stipendio: " + stipendio)
        );
        // Output previsto:
        // nome: Aldo stipendio: 24000
        // nome: Giovanni stipendio: 301000
        // nome: Giacomo stipendio: 401000
    }
}

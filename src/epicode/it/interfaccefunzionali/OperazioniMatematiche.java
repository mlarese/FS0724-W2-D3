package epicode.it.interfaccefunzionali;

@FunctionalInterface // Indica che questa è un'interfaccia funzionale
public interface OperazioniMatematiche {
    /**
     * Metodo astratto che accetta due numeri interi e restituisce un risultato intero.
     * Questo metodo rappresenta una generica operazione matematica tra due numeri.
     * Deve essere implementato tramite una lambda o una classe anonima, specificando
     * l'operazione desiderata (ad esempio somma, moltiplicazione, divisione o sottrazione).
     */
    int esegui(int a, int b);
    // somma è fatta tra due numeri
    // moltiplicazione è fatta tra due numeri
    // divisione è fatta tra due numeri
    // sottrazione è fatta tra due numeri

    // Nota:
    // Un'interfaccia funzionale può contenere un solo metodo astratto.
    // Questo è necessario perché le espressioni lambda (che vengono utilizzate per implementare
    // le interfacce funzionali) devono sapere quale metodo implementare.
    // Tuttavia, un'interfaccia funzionale può avere:
    // - Metodi statici (con implementazioni definite).
    // - Metodi di default (con implementazioni di default, introdotti in Java 8).
    //
    // Questo è ciò che distingue un'interfaccia funzionale da un'interfaccia tradizionale.
    //
    // Qui, il metodo astratto `esegui` viene inserito perché rappresenta
    // il contratto minimo che qualsiasi implementazione deve soddisfare,
    // rendendo l'interfaccia adatta a qualsiasi operazione matematica tra due numeri.
}

package epicode.it.interfaccefunzionali;

/**
 * Classe principale per testare l'interfaccia funzionale `OperazioniMatematiche`.
 * Dimostra come utilizzare espressioni lambda per implementare un'interfaccia funzionale
 * e richiamare le sue implementazioni in modo semplice ed efficace.
 */
public class Main {
    public static void main(String[] args) {
        // Creazione e implementazione delle funzioni matematiche con espressioni lambda.
        // Nota: Non è necessario specificare i tipi dei parametri (a e b),
        // perché sono già definiti come interi (int) nell'interfaccia funzionale `OperazioniMatematiche`.

        // 1. Definizione della somma:
        // L'espressione lambda implementa il metodo `esegui` dell'interfaccia funzionale.
        // Rappresenta l'operazione `a + b`.
        OperazioniMatematiche somma = (a, b) -> a + b;

        // 2. Definizione della moltiplicazione:
        // Anche qui, la lambda implementa il metodo `esegui` dell'interfaccia,
        // in questo caso rappresentando l'operazione `a * b`.
        OperazioniMatematiche moltiplica = (a, b) -> a * b;

        // 3. Definizione della divisione:
        // La lambda implementa l'operazione `a / b`,
        // che restituisce il quoziente dei due numeri.
        OperazioniMatematiche divisione = (a, b) -> a / b;

        // 4. Definizione della sottrazione:
        // Questa lambda rappresenta la sottrazione `a - b`.
        OperazioniMatematiche sottrazione = (a, b) -> a - b;

        // Spiegazione dell'uso delle lambdas e dell'interfaccia funzionale:
        // - Ogni espressione lambda qui definita è un'implementazione del metodo astratto `esegui`.
        // - L'interfaccia `OperazioniMatematiche` è progettata per accettare due numeri interi e restituire un risultato intero.
        // - La semplicità del codice è garantita perché non dobbiamo creare classi anonime o concrete per ogni operazione.
        // - Non serve dichiarare i tipi dei parametri `a` e `b` nelle lambdas, poiché sono dedotti dalla firma del metodo `esegui` nell'interfaccia.

        // Utilizzo delle lambdas per eseguire le operazioni matematiche e stampare i risultati:
        System.out.println("Somma tra 6 e 2: " + somma.esegui(6, 2));
        // Spiega il comportamento: `somma.esegui(6, 2)` richiama l'implementazione `a + b`, restituendo 8.

        System.out.println("Moltiplicazione tra 6 e 2: " + moltiplica.esegui(6, 2));
        // Comportamento: `moltiplica.esegui(6, 2)` richiama l'implementazione `a * b`, restituendo 12.

        System.out.println("Divisione tra 6 e 2: " + divisione.esegui(6, 2));
        // Comportamento: `divisione.esegui(6, 2)` richiama l'implementazione `a / b`, restituendo 3.

        System.out.println("Sottrazione tra 6 e 2: " + sottrazione.esegui(6, 2));
        // Comportamento: `sottrazione.esegui(6, 2)` richiama l'implementazione `a - b`, restituendo 4.
    }
}

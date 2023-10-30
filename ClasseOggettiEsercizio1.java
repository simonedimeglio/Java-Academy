/*
Crea una classe chiamata Studente
con attributi come nome, cognome, età e voto. 
Poi crea oggetti studente e visualizza 
le informazioni su di essi.
*/

class Studente {
    String nome;
    String cognome;
    int eta;
    double voto;

    public Studente(String nome, String cognome, int eta, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.voto = voto;
    }

    public void visualizzaInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Voto: " + voto);
    }
}

public class ClasseOggettiEsercizio1 {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Mario", "Rossi", 20, 85.5);
        Studente studente2 = new Studente("Laura", "Bianchi", 22, 92.0);

        studente1.visualizzaInfo();
        System.out.println();
        studente2.visualizzaInfo();
    }
}

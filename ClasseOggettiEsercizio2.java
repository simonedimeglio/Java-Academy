/*
Crea una classe chiamata Libro 
con attributi come titolo, autore e anno di pubblicazione. 
Poi crea oggetti libro e 
visualizza le informazioni su di essi.
*/


class Libro {
    String titolo;
    String autore;
    int annoPubblicazione;

    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }

    public void visualizzaInfo() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno di pubblicazione: " + annoPubblicazione);
    }
}

public class ClasseOggettiEsercizio2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);

        libro1.visualizzaInfo();
        System.out.println();
        libro2.visualizzaInfo();
    }
}

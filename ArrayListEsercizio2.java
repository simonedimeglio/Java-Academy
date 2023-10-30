// Utilizza ArrayList per memorizzare una lista di nomi e stampa ciascun nome.

import java.util.ArrayList;

public class ArrayListEsercizio2 {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Marco");
        nomi.add("Giulia");
        nomi.add("Davide");

        for (String nome : nomi) {
            System.out.println(nome);
        }
    }
}

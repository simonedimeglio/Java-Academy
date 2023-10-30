// Scrivi un programma Java che trovi il valore massimo in un array di numeri interi.

public class ArrayEsercizio6 {
    public static void main(String[] args) {
        int[] numeri = {12, 45, 78, 23, 56, 89, 34, 65, 20, 43};
        int massimo = numeri[0];

        for (int numero : numeri) {
            if (numero > massimo) {
                massimo = numero;
            }
        }

        System.out.println("Il valore massimo nell'array è: " + massimo);
    }
}

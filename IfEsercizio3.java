// Scrivi un programma che chieda all'utente di inserire un numero e 
// stampi se è positivo, negativo o zero.

import java.util.Scanner;

public class IfEsercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("Il numero è positivo.");
        } else if (numero < 0) {
            System.out.println("Il numero è negativo.");
        } else {
            System.out.println("Il numero è zero.");
        }
    }
}

/*
 * Scrivi un programma Java che accetti una stringa 
 * dall'utente e stampi la sua lunghezza, 
 * il primo carattere e l'ultimo carattere.
 */

import java.util.Scanner;

public class StringheEsercizio4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Inserisci una stringa: ");
    String str = input.nextLine();

    System.out.println("Lunghezza: " + str.length());
    System.out.println("Primo carattere: " + str.charAt(0));
    System.out.println("Ultimo carattere: " + str.charAt(str.length() - 1));
  }
}

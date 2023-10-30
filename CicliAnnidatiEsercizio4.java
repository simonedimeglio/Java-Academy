// Scrivi un programma che stampi un modello di piramide di asterischi. 
// L'utente dovrebbe inserire il numero di righe della piramide.



import java.util.Scanner;

public class CicliAnnidatiEsercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

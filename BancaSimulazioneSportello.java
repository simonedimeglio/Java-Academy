import java.util.Scanner;

public class BancaSimulazioneSportello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numClienti = 5;
        double[] saldi = new double[numClienti];

        // Inizializza i saldi dei clienti con valori casuali
        for (int i = 0; i < numClienti; i++) {
            saldi[i] = 1000 + Math.random() * 4000;
        }

        while (true) {
            System.out.println("Benvenuto nella simulazione dello sportello bancario!");
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Visualizza saldo");
            System.out.println("2. Deposita denaro");
            System.out.println("3. Preleva denaro");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            int scelta = input.nextInt();

            if (scelta == 1) {
                // Visualizza saldo
                System.out.print("Inserisci il numero del tuo conto (da 1 a " + numClienti + "): ");
                int numConto = input.nextInt();
                if (numConto >= 1 && numConto <= numClienti) {
                    System.out.println("Saldo attuale: $" + saldi[numConto - 1]);
                } else {
                    System.out.println("Numero di conto non valido.");
                }
            } else if (scelta == 2) {
                // Deposita denaro
                System.out.print("Inserisci il numero del tuo conto (da 1 a " + numClienti + "): ");
                int numConto = input.nextInt();
                if (numConto >= 1 && numConto <= numClienti) {
                    System.out.print("Inserisci l'importo da depositare: $");
                    double importo = input.nextDouble();
                    if (importo > 0) {
                        saldi[numConto - 1] += importo;
                        System.out.println("Operazione completata. Il nuovo saldo è: $" + saldi[numConto - 1]);
                    } else {
                        System.out.println("Importo non valido.");
                    }
                } else {
                    System.out.println("Numero di conto non valido.");
                }
            } else if (scelta == 3) {
                // Preleva denaro
                System.out.print("Inserisci il numero del tuo conto (da 1 a " + numClienti + "): ");
                int numConto = input.nextInt();
                if (numConto >= 1 && numConto <= numClienti) {
                    System.out.print("Inserisci l'importo da prelevare: $");
                    double importo = input.nextDouble();
                    if (importo > 0 && importo <= saldi[numConto - 1]) {
                        saldi[numConto - 1] -= importo;
                        System.out.println("Operazione completata. Il nuovo saldo è: $" + saldi[numConto - 1]);
                    } else {
                        System.out.println("Importo non valido o saldo insufficiente.");
                    }
                } else {
                    System.out.println("Numero di conto non valido.");
                }
            } else if (scelta == 4) {
                System.out.println("Grazie per aver utilizzato il servizio!");
                break;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}

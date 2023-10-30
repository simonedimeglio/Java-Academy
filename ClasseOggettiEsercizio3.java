/*
Crea una classe chiamata Veicolo 
con attributi come marca, modello, anno di fabbricazione e velocità attuale. 
Aggiungi metodi per accelerare e rallentare il veicolo. 
Quindi crea oggetti veicolo e simula l'accelerazione e il rallentamento.
*/

class Veicolo {
    String marca;
    String modello;
    int annoFabbricazione;
    int velocitaAttuale;

    public Veicolo(String marca, String modello, int annoFabbricazione) {
        this.marca = marca;
        this.modello = modello;
        this.annoFabbricazione = annoFabbricazione;
        this.velocitaAttuale = 0;
    }

    public void accelera(int incremento) {
        velocitaAttuale += incremento;
    }

    public void rallenta(int decremento) {
        if (velocitaAttuale >= decremento) {
            velocitaAttuale -= decremento;
        } else {
            velocitaAttuale = 0;
        }
    }

    public void visualizzaInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno di fabbricazione: " + annoFabbricazione);
        System.out.println("Velocità attuale: " + velocitaAttuale + " km/h");
    }
}

public class ClasseOggettiEsercizio3 {
    public static void main(String[] args) {
        Veicolo auto = new Veicolo("Toyota", "Corolla", 2020);
        Veicolo moto = new Veicolo("Honda", "CBR600RR", 2022);

        auto.accelera(50);
        moto.accelera(80);
        auto.rallenta(10);

        auto.visualizzaInfo();
        System.out.println();
        moto.visualizzaInfo();
    }
}

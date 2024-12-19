import java.util.LinkedList;

public class Bus implements Runnable {
    private LinkedList<Turista> turisti;
    Traghetto t;
    private String nazionalita;

    public Bus(LinkedList<Turista> buses, Traghetto t, String nazionalita) {
        this.turisti = buses;
        this.t = t;
        this.nazionalita = nazionalita;
    }

    @Override
    public void run() {
        System.out.println("Biglietto pagato");
        t.imbarca(nazionalita);
        t.sbarca(nazionalita);
    }
}

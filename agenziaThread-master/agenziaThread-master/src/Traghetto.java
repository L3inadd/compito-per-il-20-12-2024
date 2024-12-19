import java.util.Random;

import static java.lang.Thread.sleep;

public class Traghetto {
    private boolean imbarcato = false;
    private Random rand = new Random();

    public synchronized void imbarca(String nazionalita) {
        if (imbarcato) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Imbarcati " + nazionalita);
        imbarcato = true;
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sbarca(String nazionalita) {
        System.out.println("Sbarcati " + nazionalita);
        imbarcato = false;
        notifyAll();
    }
}

import java.util.LinkedList;

public class AgenziaViaggi {
    private LinkedList<Turista> francesi;
    private LinkedList<Turista> tedeschi;
    private LinkedList<Turista> spagnoli;
    private Bus b1;
    private Bus b2;
    private Bus b3;
    private Thread busFrancesi;
    private Thread busTedeschi;
    private Thread busSpagnoli;
    private Traghetto t;

    public AgenziaViaggi() {
        t = new Traghetto();
        francesi = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            francesi.add(new Turista("francese"));
        }

        tedeschi = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            tedeschi.add(new Turista("tedeschi"));
        }

        spagnoli = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            spagnoli.add(new Turista("spagnoli"));
        }

        b1 = new Bus(francesi,t , "francesi");
        b2 = new Bus(tedeschi,t , "tedeschi");
        b3 = new Bus(spagnoli,t , "spagnoli");

        busFrancesi = new Thread(b1);
        busTedeschi = new Thread(b2);
        busSpagnoli = new Thread(b3);
    }

    public void inizia() {
        busFrancesi.start();
        busTedeschi.start();
        busSpagnoli.start();
    }
}

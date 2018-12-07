package backEnd;

import java.util.Random;

public class Participante {

    public static Random r = new Random();
    public int key, pont;
    public String nome;
    public boolean premium;

    public Participante(String nome, boolean premium) {
        if (premium) {
            this.key = r.nextInt(99) + 50;
        } else {
            this.key = r.nextInt(99);
        }

        this.nome = nome;
        this.premium = premium;
        this.pont = 100;
    }
}

import java.util.*;

public class Prodotto implements Comparable<Prodotto> {
    private String nome;
    private Importo prezzo;

    public Prodotto(String nome,int prezzoInCentesimi) {
        this.nome=nome;
        prezzo=new Importo(prezzoInCentesimi);
    }

    public int compareTo(Prodotto altro) {
        return prezzo.compareTo(altro.getPrezzo());
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();

        sb.append(getClass().getName());
        sb.append("-");
        sb.append(nome);
        sb.append("-");
        sb.append(prezzo);

        return sb.toString();
    }

    public Importo getPrezzo() {
        return prezzo;
    }

    public int inCentesimi() {
        return prezzo.inCentesimi();
    }
}

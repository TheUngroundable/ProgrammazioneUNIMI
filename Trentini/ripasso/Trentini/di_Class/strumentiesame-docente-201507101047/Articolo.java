import java.io.*;

/**
 * il file contiene il titolo nella prima riga, l'autore (nome spazio cognome) nella seconda, il testo nelle righe seguenti
 */

public class Articolo {
    private String file;

    private StringBuffer testo;
    private String titolo;
    private Autore autore;

    private Revisore revisore;

    public void setRevisore(Revisore rev) {
        revisore=rev;
    }
    public Revisore getRevisore() {
        return revisore;
    }


    /** legge il file ed estrae le info (prima e seconda riga)
     */
    public Articolo(String filename) {
        file=filename;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            titolo=br.readLine();
            autore=new Autore(br.readLine());

            testo = new StringBuffer();
            String line;
            while ((line=br.readLine()) != null) {
                testo.append(line);
                //System.err.println(line);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public int righe(int caratteriPerRiga) {
        return (int) Math.ceil((testo.length()*1.0)/caratteriPerRiga);
    }

    public int pagine(int righePerPagina,int caratteriPerRiga) {
        return (int) Math.ceil((righe(caratteriPerRiga)*1.0)/righePerPagina);
    }

    public Autore getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }


    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(tit: ");
        sb.append(titolo);
        sb.append(", aut: ");
        sb.append(autore);
        sb.append(", rev: ");
        sb.append(revisore);
        sb.append(", file: ");
        sb.append(file);
        sb.append(")");
        return sb.toString();
    }
}

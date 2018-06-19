/**
Leggere LINEE da un file, il cui nome è dato sulla linea di comando
Per ogni linea stampare:
- la linea stessa
- il numero di parole di LUNGHEZZA PARI presenti sulla linea
- il rapporto fra il numero di parole di LUNGHEZZA PARI e quelle totali sulla linea

Stampare poi l'andamento del numero di parole di LUNGHEZZA PARI:
'/' se il numero cresce
'-' se è uguale
'\' se decresce
 */

import java.util.*;
import java.io.*;

public class FiltroA {
    public final static boolean PARI=true;
    public final static boolean DISPARI=false;

    public static void main(String[] arg)
    throws Exception {
        Scanner sorgente=new Scanner(new File(arg[0]));

        // mi tengo le linee del file?
        ArrayList<String> linee=new ArrayList<String>();
        ArrayList<Integer> nrParole=new ArrayList<Integer>();
        ArrayList<Integer> totParole=new ArrayList<Integer>();
        while(sorgente.hasNextLine()) {
            String cur=sorgente.nextLine();
            linee.add(cur);

            int nr=paroleInLinea(cur,PARI);
            nrParole.add(nr);

            totParole.add(paroleInLinea(cur,DISPARI)+nr); // diverso da sopra!!!
        }

        // solo stats
        for(int l=0; l<linee.size(); l++) {
            String current=linee.get(l);

            System.out.print("Riga: ");
            System.out.println(current);

            System.out.print("Pari: ");
            System.out.println(nrParole.get(l));

            // check
            //System.out.print("================== Tot: ");
            //System.out.println(totParole.get(l));

            System.out.print("Rapporto: ");
            System.out.println((1.0*nrParole.get(l))/totParole.get(l));
        }

        // "grafico"
        for(int l=0; l<linee.size(); l++) {
            if(l!=0) {
                if(nrParole.get(l)>nrParole.get(l-1))
                    System.out.print("/");
                if(nrParole.get(l)==nrParole.get(l-1))
                    System.out.print("-");
                if(nrParole.get(l)<nrParole.get(l-1))
                    System.out.print("\\");
            }
        }
        System.out.println();
    }

    public static int paroleInLinea(String linea, boolean pari) {
        Scanner sc=new Scanner(linea);
        int count=0;
        while(sc.hasNext()) {
            String parola=sc.next();
            if(pari) {
                if(parola.length()%2==0) count++;
            } else if(parola.length()%2!=0) count++;
        }
        return count;
    }

    /*
    public static double mediaParolePerLineaInFile(ArrayList<String> file, boolean pari) {
        int count=0;
        for(String s: file) {
            count+=paroleInLinea(s,pari);
        }
        return (1.0*count)/file.size();
    }
    */
}

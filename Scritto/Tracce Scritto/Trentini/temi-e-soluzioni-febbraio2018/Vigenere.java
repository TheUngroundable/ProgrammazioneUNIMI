/**
 * - primo parametro è verme/chiave
 * - stdin testo da crittare
 * - critta solo ciò che è "letter", lascia intatto il resto
 * - trasforma verme e testo (letter) in MAIUSCOLO prima di crittare
 *
 * >>> forma OUTPUT da decidere <<<
 */
import java.util.*;
import java.io.*;

public class Vigenere {
    private static String verme=null;

    public static void main(String[] arg) throws Exception {
        if(arg.length!=1) {
            System.out.println("Chiave non fornita.");
            System.exit(1);
        }

        /* tests
        System.out.println(ordinale('a'));
        System.out.println(carattere(2));
        for(int i=0; i<50; i++)
            System.out.println(carattere(i));
        */

        verme=arg[0].toUpperCase();

        //////////////////////////////////////////////////////////////////////////////
        /* così non riporta il whitespace in output,
         * alternativa (persin più facile): farlo a singolo carattere su tutto il file
         * (vedi sotto)
         */
        /*
        Scanner sorgente=new Scanner(System.in);
        while(sorgente.hasNext()) {
            String chiaro=sorgente.next().toUpperCase();

            System.out.print(chiaro);
            System.out.print(" -> ");
            for(char c: chiaro.toCharArray()) {
                if(Character.isLetter(c))
                    System.out.print(cifra(c));
                else
                    System.out.print(c);
            }
            System.out.println();
        }
        */

        ///////////////////////////////
        // versione a singolo carattere
        InputStream in=System.in;
        while(in.available()>0) {
            char car=(char)in.read();
            if(Character.isLetter(car))
                System.out.print(cifra(car));
            else
                System.out.print(car);
        }
    }

    private static int cur=0;
    public static char cifra(char chiaro) {
        char cifrato=carattere(ordinale(chiaro)+ordinale(verme.charAt(cur)));
        cur++;
        if(cur>=verme.length()) cur=0;
        return cifrato;
    }

    public static int ordinale(char carattere) {
        return Character.toUpperCase(carattere)-'A';
    }

    public static char carattere(int ord) {
        return (char)(ord%(ordinale('Z')+1)+'A');
    }
}

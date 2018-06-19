/**
 * Scrivete un programma (una classe Triangoli) che,
 * dati 6 parametri sulla linea di comando,
 * determina se sia i primi tre che i secondi tre corrispondono
 * alle dimensioni di un triangolo.
 * Se sì, il programma determina se i due triangoli
 * sono uguali (hanno le stesse dimensioni).
 *
 * Esempi
 *
 * $ java Triangoli  3 4 5 4 5 3
 * [3, 4, 5] e` un triangolo
 * [4, 5, 3] e` un triangolo
 * sono uguali
 *
 * $ java Triangoli  4 3 5 6 5 4
 * [4, 3, 5] e` un triangolo
 * [6, 5, 4] e` un triangolo
 * non sono uguali
 *
 * $ java Triangoli  3 4 5 15  4 7
 * [3, 4, 5] e` un triangolo
 * [15, 4, 7] non e` un triangolo
 *
 */
import java.util.*;

public class Triangoli {

    public static void main(String[] arg) {
        if(arg.length!=6) {
            System.out.println("Dati non validi");
            System.exit(1);
        }

        int[] tmp=new int[6];
        try {
            for(int c=0; c<6; c++) {
                tmp[c]=Integer.parseInt(arg[c]);
                if(tmp[c]<=0) {
                    System.out.println("Dati non validi");
                    System.exit(2);
                }
            }

            int[] tri1=new int[3];
            tri1[0]=tmp[0];
            tri1[1]=tmp[1];
            tri1[2]=tmp[2];

            int[] tri2=new int[3];
            tri2[0]=tmp[3];
            tri2[1]=tmp[4];
            tri2[2]=tmp[5];


            boolean tri1ok=isTriangolo(tri1);
            boolean tri2ok=isTriangolo(tri2);

            System.out.print(Arrays.toString(tri1));
            System.out.println(tri1ok ? " è un triangolo" : " non è un triangolo");

            System.out.print(Arrays.toString(tri2));
            System.out.println(tri2ok ? " è un triangolo" : " non è un triangolo");

            if(tri1ok && tri2ok)
                System.out.println(areEquals(tri1,tri2) ? "Sono uguali" : "Non sono uguali");

        } catch(NumberFormatException ex) {
            System.out.println("Dati non validi");
            System.exit(4);
        }
    }

    // array deve essere di 3 elementi, lo copio per non modificare originale (ma mi sa che passa per copia anche se è ref?!? VERIFICARE)
    // nb: diversa firma rispetto a tema
    public static boolean isTriangolo(int[] tri) {
        int[] tmp=Arrays.copyOf(tri,3);
        Arrays.sort(tmp);
        return (tmp[0]+tmp[1]>tmp[2]);
    }

    // array deve essere di 3 elementi, lo copio per non modificare originale (ma mi sa che passa per copia anche se è ref?!? VERIFICARE)
    public static boolean areEquals(int[] triA, int[] triB) {
        int[] tmpA=Arrays.copyOf(triA,3);
        Arrays.sort(tmpA);

        int[] tmpB=Arrays.copyOf(triB,3);
        Arrays.sort(tmpB);

        return (Arrays.equals(tmpA,tmpB));
    }
}

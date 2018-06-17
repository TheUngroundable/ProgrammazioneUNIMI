import java.util.*;
public class Statistiche {
    public static int[] frequenze (int data[]) {
        int[] f=new int[max(data)+1];
        //System.err.println(max(data));
        for(int d:data) {
            f[d]++;
        }
        return f;
    }
    private static int max(int[] data) {
        int m=Integer.MIN_VALUE;
        for(int v:data) {
            if(v>m) m=v;
        }   
        return m;
    }

    public static double mediana (int data[]) {
        Arrays.sort(data);

        if(data.length%2==0) {
            return
                (
                    data[(data.length/2)-1]
                    +
                    data[(data.length/2)]
                )/2.0;

        } else {
            return data[(data.length/2)];
        }
    }
}

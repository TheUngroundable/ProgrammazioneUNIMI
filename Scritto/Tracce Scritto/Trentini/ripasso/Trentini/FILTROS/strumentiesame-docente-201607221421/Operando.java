public class Operando implements Comparable<Operando> {
    private double valore;

    public int compareTo(Operando altro) {
        return (int)Math.round(getValore()-altro.getValore());
    }

    public Operando() {
        this(0);
    }
    public Operando(double val) {
        valore=val;
    }

    public double getValore() {
        return valore;
    }

    /** per il contains
     */
    public boolean equals(Object o) {
        //System.err.println(o);
        if(o instanceof Operando) {
            return valore==((Operando)o).getValore();
        }
        return false;
    }

    public String toString() {
        return String.valueOf(valore);
    }
}

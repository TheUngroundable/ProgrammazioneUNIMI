public class Camion extends Veicolo {
    public Camion(String targa, float potenza) {
        super(targa,5,potenza); // fissa gli assi
    }
    public Camion(String targa, float potenza, int assi) {
        super(targa,assi,potenza);
    }
}

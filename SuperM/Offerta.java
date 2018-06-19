public class Offerta{

  private String nomeOfferta;
  private Prodotto p;
  private double percSconto;
  private int numeroMinimo;
  private boolean soloCartaFedelta;

  public Offerta(String nomeOfferta, Prodotto p, double percSconto, int numeroMinimo, boolean soloCartaFedelta){
    this.nomeOfferta = nomeOfferta;
    this.p = p;
    this.percSconto = percSconto;
    this.numeroMinimo = numeroMinimo;
    this.soloCartaFedelta = soloCartaFedelta;
  }

  public double prezzo(int qta, boolean carta){
    if(carta && qta>=this.numeroMinimo) return this.p.prezzo()*qta-( (this.p.prezzo()*this.percSconto) /100 )*qta;
    else return this.p.prezzo()*qta;
  }

  //public static double totale(Offerta off[], Prodotto p[], int qta[], boolean carta){
  //}


}

public class Prodotto{

  private String nome;
  private Reparto reparto;
  private static String id;
  private double quantita;
  private double prezzo;
  private UnitaDiMisura mis;

  public Prodotto(String nome, Reparto reparto, String id, double quantita, double prezzo, UnitaDiMisura mis){
    this.nome = nome;
    this.reparto = reparto;
    this.id = id;
    this.quantita = quantita;
    this.prezzo = prezzo;
    this.mis = mis;
  }

  public double prezzo(){
    return this.prezzo;
  }

  public double prezzoUnitario(){//no se que meirda es esto
    return (this.mis.getQta()*this.prezzo)/this.quantita;
  }

  @Override
  public String toString(){
    return this.nome + "--- $ " + this.prezzo();
  }

}

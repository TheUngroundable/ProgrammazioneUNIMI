public class Supermercato{

  private ArrayList<Reparto> reparti;
  private ArrayList<Prodotto> prodotti;
  private ArrayList<Offerta> offerte;

  public Supermercato(){
    this.reparti = new ArrayList<Reparto>();
    this.prodotti = new ArrayList<Prodotto>();
  }

  public void aggiungiReparto(Reparto r){
    this.reparti.add(r);
  }
  public void aggiungiProdotto(Prodotto p){
    this.prodotti.add(p);
  }

  public boolean cancellaProdotto(Prodotto p){
    if(this.prodotti.contains(p)){
      this.prodotti.remove(p);
      return true;
    }
    return false;
  }

  public void aggiungiOfferta(Offerta o){
    this.offerte.add(o);
  }

  public boolean cancellaOfferta(Offerta o){
    if(this.offerti.contains(p)){
      this.offerti.remove(p);
      return true;
    }
    return false;
  }
//  public double prezzo(Prodotto[] p, boolean carta){

  //} //: restituisce il prezzo della spesa costituita dalla lista di prodotti p (assumendo che il cliente a



}

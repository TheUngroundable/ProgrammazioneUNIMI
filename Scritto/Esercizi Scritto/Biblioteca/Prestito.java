public class Prestito{

  private Libro book;
  private Utente usr;
  private Data da;
  private Data a;

  public Prestito(Libro x, Utente u, Data da, Data a){
    this.book = x;
    this.usr = u;
    this.da = da;
    this.a = a;
  }

  public Prestito(Libro x, Utente u, Data da){
    this.book = x;
    //this.book.setPrestito();
    this.usr = u;
    this.da = da;
    this.a = da.successiva();

  }

  public boolean riguardaUtente(Utente u){
    return this.usr.equals(u);
  }

  public boolean riguardaLibro(Libro t){
    return this.book.equals(t);
  }

  public boolean riguardaData(Data d){
    if(this.a.equals(d)) return true;
    else return d.vienePrimaDi(a) && da.giorniDa(d)>=0;
  }

  public Utente getUtente(){
    return this.usr;
  }

  public String toString(){
      return "Utente: " + "("+usr.getId()+") " + usr.getNome() + "\n" + "Libro: " + this.book.getTitolo() + "\n" + "Prenotazione: inizio: " + this.da + "\tfine: " + this.a;
  }

}

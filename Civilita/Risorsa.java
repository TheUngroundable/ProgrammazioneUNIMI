public class Risorsa{

  private String nome;
  private int prezzo;

  public Risorsa(String n, int p){
    this.nome = n;
    this.prezzo = p;
  }

  public void setPrezzo(int nuovoPrezzo){
    this.prezzo = nuovoPrezzo;
  }

  public int getPrezzo(){
    return this.prezzo;
  }

  @Override
  public String toString(){
    return this.nome + ": " + "$ " + this.prezzo;
  }

  @Override
  public int hashCode(){
    return this.nome.length()+this.prezzo;
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof Risorsa)) return false;
    else{
      Risorsa r = (Risorsa)x;
      return this.nome.equals(r.nome);
    }
  }


}

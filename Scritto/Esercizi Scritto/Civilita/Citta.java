public class Citta{

  private String nome;
  private Risorsa r;

  public Citta(String nome, Risorsa r){
    this.nome = nome;
    this.r = r;
  }

  public Risorsa produci(){
    return this.r;
  }

  public Risorsa getRisorsa(){
    return this.r;
  }

  public String getNome(){
    return this.nome;
  }

  @Override
  public String toString(){
    return this.nome + ": " + this.r;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof Citta)) return false;
    else {
      Citta c=(Citta)x;
      return this.nome.equals(c.nome) && this.r.equals(c.r);
    }
  }

  @Override
	public int hashCode() {
		return this.r.getPrezzo();
	}

}

public class UnitaDiMisura{

  private String nome;
  private String sigla;
  private UnitaDiMisura riferimento;
  private double qta;

  public UnitaDiMisura(String nome, String sigla){
    this.nome = nome;
    this.sigla = sigla;
    this.riferimento = this;
    this.qta = 1;
  }

  public UnitaDiMisura(String nome, String sigla, UnitaDiMisura riferimento, double qta){
    this.nome = nome;
    this.sigla = sigla;
    this.riferimento = riferimento;
    this.qta = qta;
  }

  public UnitaDiMisura riferimento(){
    return this.riferimento;
  }

  public double qta(){
    return this.riferimento().getQta() / this.getQta();
  }

  public double getQta(){
    return this.qta;
  }

  public String getSigla(){
    return this.sigla;
  }

  @Override
  public String toString(){
    return this.nome + " " + this.sigla + " " + this.qta;
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof UnitaDiMisura)) return false;
    else{
      UnitaDiMisura generica = (UnitaDiMisura)x;
      return this.nome.equals(generica.nome) && this.sigla.equals(generica.sigla) && this.qta==generica.qta;
    }
  }

}

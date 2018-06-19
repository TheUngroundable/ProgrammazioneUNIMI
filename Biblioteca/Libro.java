
public class Libro{

  private String titolo;
  private String autori[];
  private boolean prestabile;
  private int identificativo = 0;
  private static int contatore = 0;

  public Libro(String titolo, String autori[], boolean prestabile){
    this.titolo = titolo;
    this.autori = new String[autori.length];
    for(int i = 0; i<autori.length; i++) this.autori[i]=autori[i];
    this.prestabile = prestabile;
    this.identificativo = ++contatore;
  }

  public Libro(String titolo, String autore, boolean prestabile){
    this.titolo = titolo;
    this.autori= new String[1];
    this.autori[0] = autore;
    this.prestabile = prestabile;
    this.identificativo = ++contatore;
  }

  public Libro(String titolo, String autori[]){
    this.titolo = titolo;
    this.autori= new String [autori.length];
    for(int k = 0; k<this.autori.length; k++) this.autori[k] = autori[k];
    this.prestabile = true;
    this.identificativo = ++contatore;
  }

  public Libro(String titolo, String autore){
    this.titolo = titolo;
    this.autori= new String [1];
    this.autori[0] = autore;
    this.prestabile = true;
    this.identificativo = ++contatore;
  }

  public String getTitolo(){
    return this.titolo;
  }

  public boolean getDispo(){
    return this.prestabile;
  }

  public void setPrestito(boolean b){
    this.prestabile = b;
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof Libro)) return false;
    else{
      Libro l = (Libro)x;
      return this.identificativo==l.identificativo;
    }
  }

  @Override
  public String toString(){
    String autores = "";
    for(int i = 0; i<this.autori.length; i++){
      autores+= autori[i];
      if(i<this.autori.length-1) autores+= ", ";
    }
    return "id: " + this.identificativo + "\n" + "titolo: " + this.titolo + "\n" + "from: " + autores + "\n" + "prestabile: " + this.prestabile;
  }

}

import java.util.*;

public class Civilta{

  private String nome;
  private ArrayList<Citta> citta;
  private int tesoro;
  private ArrayList<Risorsa> stock;

  public Civilta(String nombre){
    this.nome = nombre;
    this.citta = new ArrayList<Citta>();
    this.stock = new ArrayList<Risorsa>();
    this.tesoro = 0;
  }

  public Citta fondaCitta(String n, Risorsa r){
    Citta c = new Citta(n, r);
    this.citta.add(c);
    return c;
  }

  public void aggiungiRisorsa(Risorsa r){
    this.stock.add(r);
  }

  public void aggiungiDenaro(int d){
    this.tesoro += d;
  }

  public int getTesoro(){
    return this.tesoro;
  }

  public void faiProdurre(){
      for(int i = 0; i<this.citta.size(); i++){
        this.stock.add(this.citta.get(i).produci());
      }
  }

  public boolean possiede(Risorsa r){
    for(int k = 0; k<this.stock.size(); k++){
      if(this.stock.get(k).equals(r)) return true;
    }
    return false;
  }

  public boolean vendiRisorseA(Civilta altra){
    boolean flag = false;
    for(int i = 0; i<this.stock.size(); i++){
      if(!altra.possiede(this.stock.get(i))) {
        flag = true;
        altra.aggiungiRisorsa(this.stock.get(i));
        altra.aggiungiDenaro(-(this.stock.get(i).getPrezzo()));
        this.aggiungiDenaro(this.stock.get(i).getPrezzo());
        this.stock.remove(i);
      }
    }
    return flag;
  }

  public Citta piuPovera(){
		Citta povera= citta.get(0);
		for (int i=0; i<citta.size(); i++)
			if(povera.getRisorsa().getPrezzo() > this.citta.get(i).getRisorsa().getPrezzo())
				povera=citta.get(i);
		return povera;
	}

  @Override
  public String toString(){
    String str1 = "";
    if(this.citta.size()>0) for(int i = 0; i<this.citta.size(); i++) str1+= "\t" + this.citta.get(i).getNome() + "\n";
    else str1 = "nessuna\n";
    String str2 = "";
    if(this.stock.size()>0) for(int e = 0; e<this.stock.size(); e++) str2+= "\t" + this.stock.get(e) + "\n";
    else str2 = "\tniente\n";
    return "\t" + this.nome + "\n\n" + "-Tesoro: $ " + this.tesoro + "\n" + "-Citta:\n" + str1 + "-Risorse:\n"+ str2;
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof Civilta)) return false;
    else{
      boolean flag=false;
			Civilta c= (Civilta)x;
			if (this.nome.equals(c.nome) && this.citta.size()==c.citta.size()) {
				flag=true;
				for (int i=0; i<this.citta.size(); i++)
					if (!(this.citta.get(i).equals(c.citta.get(i))))
						flag= false;
			}
			return flag;
    }
  }

  @Override
	public int hashCode() {
		return this.tesoro;
	}


}

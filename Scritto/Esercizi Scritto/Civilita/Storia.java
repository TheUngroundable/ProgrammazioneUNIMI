import java.util.*;

public class Storia{

  private ArrayList<Civilta> c;

  public Storia (ArrayList<Civilta> civilta) {
		this.c=civilta;
	}

  public Storia(){
    this.c = new ArrayList<Civilta>();
  }

  public void addCivilta(Civilta x){
    c.add(x);
  }

  public void commercia(){ //modificar por que no me gusta
    if(this.c.size()>0)
      for(int i = 0; i<this.c.size(); i++){
        for(int k = 0; k<this.c.size(); k++){
          if(!this.c.get(i).equals(this.c.get(k)) && c.get(i).vendiRisorseA(c.get(k))){
            if (i<this.c.size()-1) {
  						i++;
  						k=0;
					  }else break;
          }
        }
      }
  }

  public Civilta piuRicca(){
    Civilta piuRicca = this.c.get(0);
    for (int i=1; i<this.c.size(); i++){
      if (piuRicca.getTesoro() < this.c.get(i).getTesoro()){
        piuRicca = this.c.get(i);
      }
    }
    return piuRicca;
  }

  public Civilta piuPovera() {
    Civilta piuPovera = this.c.get(0);
    for (int i=1; i<this.c.size(); i++){
      if (piuPovera.getTesoro() > this.c.get(i).getTesoro()){
        piuPovera = this.c.get(i);
      }
    }
    return piuPovera;
  }

  public Civilta evolvi(int n){
    for(int i = 0; i<n; i++){
      for(int e = 0; e<this.c.size(); e++){
        this.c.get(e).faiProdurre();
      }
      this.commercia();
    }
    return this.piuRicca();
  }

  public void conquista(){
    Civilta ricca = this.piuRicca();
		Civilta povera = this.piuPovera();
    if (ricca.getTesoro() != povera.getTesoro()) {
			ricca.aggiungiCitta(povera.piuPovera());
			povera.rimuoviCitta(povera.piuPovera());
		}
  }


}


/*Civilita piuRicca;
int tesori[] = new int[this.c.size()];
if(this.c.size()>0){
  for(int p = 0; p<this.c.size(); p++){
    tesori[p] = this.c.get(p).getTesoro();
  }
  int max = Integer.MIN_VALUE;
  int piuRicco = Integer.MIN_VALUE;
  for(int i = 0; i<tesori.length; i++){
    if(tesori[i]>max){
      max=tesori[i];
      piuRicco = i;
    }
  }
  return this.c.get(piuRicco);
}else return this.c.get(0);*/

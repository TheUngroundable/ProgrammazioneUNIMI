import java.util.*;
public class Biblioteca{

  private String nome;
  private ArrayList<Libro> libri;
  private ArrayList<Utente> utenti;
  private ArrayList<Prestito> prestiti;

  public Biblioteca(String nome){
    this.nome = nome;
    libri = new ArrayList<Libro>();
    utenti = new ArrayList<Utente>();
    prestiti = new ArrayList<Prestito>();
  }

  public void nuovoUtente(Utente x){
    utenti.add(x);
  }

  public void nuovoLibro(Libro x){
    libri.add(x);
  }

  public int numeroUtenti(){
    return utenti.size();
  }

  public int numeroLibri(){
    return libri.size();
  }

  public Libro[] cercaLibro(String x){
    ArrayList<Libro> libriT = new ArrayList<Libro>();
    for(int i = 0; i<this.libri.size(); i++){
      if(libri.get(i).getTitolo().contains(x)) libriT.add(this.libri.get(i) );
    }
    Libro libriTrovati[] = new Libro[libriT.size()];
    for(int e = 0; e<libriT.size(); e++){
      libriTrovati[e] = libriT.get(e);


    }

    return libriTrovati;
    //  System.out.println(libriT.get(e));
    // Problema con el ritorno de este array String,
  }

  public boolean disponibile(Libro x){
    for(int j = 0; j<this.prestiti.size(); j++){
      if(this.prestiti.get(j).riguardaLibro(x) && x.getDispo()){
        if(this.prestiti.get(j).riguardaData(new Data())) return true;
				else return false;
      }
    }
    return false;
  }

  public int quantiPrestiti(Utente x){
    int count = 0;
    for(int y = 0; y<this.prestiti.size(); y++){
      if(this.prestiti.get(y).riguardaUtente(x) && this.prestiti.get(y).riguardaData(new Data())) count++;
    }
    return count;
  }

  public boolean daiInPrestito(Libro x, Utente u, Data finoA){
    if(x.getDispo() && this.quantiPrestiti(u)<4){
      Data oggi = new Data();
      prestiti.add( new Prestito(x, u, oggi, finoA) );
      return true;
    }else return false;
  }

  public boolean daiInPrestito(Libro x, Utente u){
    if(x.getDispo() && this.quantiPrestiti(u)<4){
      Data oggi = new Data();
      prestiti.add( new Prestito(x, u, oggi, oggi.successiva()) );
      return true;
    }else return false;
  }

  public Utente chiHaInPrestito(Libro x){
    for(int h = 0; h<this.prestiti.size(); h++){
      if(prestiti.get(h).riguardaLibro(x)) return prestiti.get(h).getUtente();
    }
    return null;
  }

  public String toString(){
    return this.nome;
  }

}

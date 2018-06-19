import java.util.*;

public class Utente{

  private String nome;
  private String cognome;
  private Data dataDiNascita;
  private int identificativo = 0;
  private static int contatore = 0;

  public Utente(String nome, String cognome, Data nato){
    this.nome = nome;
    this.cognome = cognome;
    this.dataDiNascita = nato;
    this.identificativo = ++contatore;
  }

  public String getNome(){ //inn
    return this.nome;
  }

  public int getId(){
    return this.identificativo;
  }
  @Override
  public String toString(){
    return "id: " + this.identificativo + "\n" + this.nome + " " + this.cognome + "\n" + this.dataDiNascita;
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof Utente)) return false;
    Utente u = (Utente)x;
    return this.identificativo==u.identificativo;
  }

}

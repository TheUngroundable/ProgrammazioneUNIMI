public class Reparto{

    private String nomeReparto;
    private String nominativoResponsabile;

    public Reparto(String nomeReparto, String nominativoResponsabile){
      this.nomeReparto = nomeReparto;
      this.nominativoResponsabile = nominativoResponsabile;
    }

    @Override
    public String toString(){
      return this.nomeReparto;
    }

}

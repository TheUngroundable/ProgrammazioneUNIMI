public class Autore extends Persona {
    private String ente;

    public Autore(String nome,String cognome,String mail,String ente) {
        super(nome,cognome,mail);
        if(ente==null || ente.length()==0) throw new RuntimeException("manca ente!");
        this.ente=ente;
    }

    public Autore(String riga) {
        super(riga);
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(super.toString());
        sb.append(",");
        sb.append(ente);
        sb.append(")");
        return sb.toString();
    }
}

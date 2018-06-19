public class Revisore extends Persona {
    private String competenze;

    public Revisore(String nome,String cognome,String mail,String competenze) {
        super(nome,cognome,mail);
        this.competenze=competenze;
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(super.toString());
        sb.append(",");
        sb.append(competenze);
        sb.append(")");
        return sb.toString();
    }
}

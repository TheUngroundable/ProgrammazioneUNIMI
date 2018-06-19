public abstract class Persona {
    private String nome,cognome,mail;

    protected void setCampi(String riga) {
        //System.err.println(riga);
        String[] campi=riga.split(" ");
        nome=campi[0];
        cognome=campi[1];
        mail=campi[2];
        if(mail.indexOf('@')==-1) throw new RuntimeException("mail non valida!");

    }

    public Persona(String riga) {
        setCampi(riga);
    }
    public Persona(String nome,String cognome,String mail) {
        this.nome=nome;
        this.cognome=cognome;
        this.mail=mail;
        if(mail.indexOf('@')==-1) throw new RuntimeException("mail non valida!");
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(nome);
        sb.append(",");
        sb.append(cognome);
        sb.append(",");
        sb.append(mail);
        sb.append(")");
        return sb.toString();
    }
}

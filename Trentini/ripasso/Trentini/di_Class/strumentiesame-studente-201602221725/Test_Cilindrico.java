public class Test_Cilindrico extends AbstractTest {

    public void go() {
        setNrTestDaFare(7); // IMPORTANTE!!!

        Cilindrico c1=new Cilindrico(30,30);
        giusto();

        if(!c1.isSpedibile()) giusto();

        float v=(float)(30.0*Math.PI*(30*30));
        if(c1.getVolume()==v) giusto();
        else System.err.println("volume "+c1.getVolume()+" contro "+v);

        if(c1.toString().contains("30")) giusto();

        if(c1.getPeso()>0) giusto();

        try {
            new Cilindrico(-1,5);
        }
        catch(Exception e) {
            giusto();
        }

        Indirizzo i1=new Indirizzo("bussi","via bianchi",5,"20100","Milano");
        Indirizzo i2=new Indirizzo("bossi","via bianchi",7,"20100","Milano");
        c1.setMittente(i1);
        c1.setDestinatario(i2);
        if(c1.isSpedibile()) giusto();

    }
}

public class Test_Parallelepipedo extends AbstractTest {

    public void go() {
        setNrTestDaFare(7); // IMPORTANTE!!!

        Parallelepipedo p1=new Parallelepipedo(30,30,30);
        giusto();

        if(!p1.isSpedibile()) giusto();

        if(p1.getVolume()==30*30*30) giusto();

        if(p1.toString().contains("30")) giusto();
        //System.out.print(this);

        if(p1.getPeso()>0) giusto();

        try {
            new Parallelepipedo(-1,5,7);
        }
        catch(Exception e) {
            giusto();
        }

        Indirizzo i1=new Indirizzo("bussi","via bianchi",5,"20100","Milano");
        Indirizzo i2=new Indirizzo("bossi","via bianchi",7,"20100","Milano");
        p1.setMittente(i1);
        p1.setDestinatario(i2);
        if(p1.isSpedibile()) giusto();

    }
}

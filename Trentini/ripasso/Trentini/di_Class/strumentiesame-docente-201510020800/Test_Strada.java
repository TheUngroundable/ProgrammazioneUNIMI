public class Test_Strada extends AbstractTest {
    @Override
    public void go() throws Exception {
        int quantiTest=3;
        incVal(1); // per non fare 99
        setEsito("(calcola percorrenza, velocita' media e un test sul limite)");

        Strada s=new Strada(50,100);  // 50km, 100km/h

        incVal(
            s.orePercorrenzaVelocitaCodice()==.5 ? 100/quantiTest : 0
        );

        incVal(
            s.velocitaMediaDatoTempoPercorrenzaInSec(1800)==100 ? 100/quantiTest : 0
        );
        //System.out.println(s.velocitaMediaDatoTempoPercorrenzaInSec(1800));

        incVal(
            s.superatoLimiteDatoTempoPercorrenzaInSec(1700)==true ? 100/quantiTest : 0
        );
    }
}

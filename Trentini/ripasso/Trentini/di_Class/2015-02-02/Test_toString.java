public class Test_toString extends AbstractTest
{
    public void go() throws Exception {
        if(
            checkToString(new Banconota(5))
            &&
            checkToString(new Cassa())
            &&
            checkToString(new Importo(545))
            &&
            checkToString(new Moneta(5))
            &&
            checkToString(new Prodotto("prova",5))
        ) {
            setBoth(100,"ok toString");
        }
        else {
            setBoth(30,"alcuni toString non fatti");
        }
    }
    private boolean checkToString(Object o) {
        //System.out.println(o);
        return ! o.toString().equals(o.getClass().getName() + '@' + Integer.toHexString(o.hashCode()));
    }
}

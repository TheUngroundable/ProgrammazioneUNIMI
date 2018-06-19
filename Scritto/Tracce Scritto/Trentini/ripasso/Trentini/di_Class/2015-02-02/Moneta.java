public class Moneta extends Denaro {
    /** deve essere valido (5,10,20,50,1,2)
     */
    public Moneta(int val) throws Exception{
        if(val==5 ||
			val==10 ||
			val==20 ||
			val==50 ||
			val==1 ||
			val==2)
        setValoreInCentesimi(val);
        else throw new Exception("FALSA!!!");
    }
}

public class Banconota extends Denaro {
    /** deve essere valido (5,10,20,50,100,200,500)
     */
    public Banconota(int val) throws Exception{
        if(val==5 ||
			val==10 ||
			val==20 ||
			val==50 ||
			val==100 ||
			val==200 ||
			val==500)
        setValoreInCentesimi(val*100);
        else throw new Exception("FALSA!!!");
    }
    public String toString() {
        StringBuffer sb=new StringBuffer();

        sb.append(getClass().getName());
        sb.append("(");
        sb.append(getValoreInCentesimi()/100);
        sb.append(" euro)");

        return sb.toString();
    }
}

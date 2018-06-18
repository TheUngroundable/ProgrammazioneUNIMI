import java.util.*;

public class Reparto{

	String nomereparto;
	String nominativoResponsabile;

	public Reparto(){

		nomereparto = null;
		nominativoResponsabile = null;

	}

	public Reparto(String nomereparto, String nominativoResponsabile){

		this.nomereparto = nomereparto;
		this.nominativoResponsabile = nominativoResponsabile;

	}

	@Override
	public String toString(){

		return "["+nomereparto+", "+nominativoResponsabile+"]"; 

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Reparto)){

			return false;

		}

		Reparto reparto = (Reparto) obj;

		return (nomereparto.equals(reparto.nomereparto)) && (nominativoResponsabile.equals(reparto.nominativoResponsabile));

	}

	@Override
	public int hashCode(){

		int hash = 7;
		return hash * 31 + nomereparto.hashCode() + nominativoResponsabile.hashCode();

	}

}
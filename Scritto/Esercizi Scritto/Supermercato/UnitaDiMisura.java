import java.util.*;

public class UnitaDiMisura{

	private String nome;
	private String sigla;
	private UnitaDiMisura riferimento;
	private double qta;

	public UnitaDiMisura(String nome, String sigla){

		this.nome = nome;
		this.sigla = sigla;
		riferimento = this;
		qta = 1.0;

	}

	public UnitaDiMisura(String nome, String sigla, UnitaDiMisura riferimento, double qta){

		this.nome = nome;
		this.sigla = sigla;
		this.riferimento = riferimento;
		this.qta = qta;

	}

	public UnitaDiMisura riferimento(){

		return riferimento;

	}

	public double qta(){

		return qta;

	}


	@Override
	public String toString(){

		return "["+nome+", "+sigla+", "+riferimento+", "+qta+"]";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(obj == this){

			return true;

		}

		if(!(obj instanceof UnitaDiMisura)){

			return false;

		}

		UnitaDiMisura unita = (UnitaDiMisura) obj;

		return (nome.equals(unita.nome))&&(sigla.equals(unita.sigla))&&(qta == unita.qta)&&(riferimento.equals(unita.riferimento));

	}

	@Override
	public int hashCode(){

		int hash = 7;

		return hash * 31 + (nome.hashCode() + sigla.hashCode() + riferimento.hashCode() + (int) qta);

	}

}
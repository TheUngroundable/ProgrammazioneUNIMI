import java.util.*;

public class Euro{

	private int valore;

	public Euro(int valore){

		this.valore = valore;

	}

	public void setValore(int valore){

		this.valore = valore;

	}

	public int getValore(){

		return valore;

	}

	@Override
	public String toString(){

		return "["+valore+"]";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Euro)){

			return false;

		}

		Euro altro = (Euro) obj;

		return this.valore == altro.valore;
		
	}


}
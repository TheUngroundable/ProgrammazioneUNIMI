import java.util.*;

public class Spettatore{

	private String nickname;
	private String email;
	private Biglietto biglietto;

	public Spettatore(String nickname, String email){

		this.nickname = nickname;
		this.email = email;

	}

	//Setters and Getters

	public void setNickname(String nickname){

		this.nickname = nickname;
		
	}

	public String getNickname(){

		return nickname;

	}

	public void setEmail(String email){

		this.email = email;
		
	}

	public String getEmail(){

		return email;

	}

	public void setBiglietto(Biglietto biglietto){

		this.biglietto = biglietto;
		
	}

	public Biglietto getBiglietto(){

		return biglietto;

	}
	
	//Metodi
	public void compraBiglietto(Biglietto b){

		if(biglietto != null){

			return;

		} else {

			this.biglietto = b;

		}

	}

	public void siede(Posto p){

		/*
			 lo spettatore si siede in un
			posto, se e’ libero e se il biglietto corrisponde al
			film (attenzione: non e’ banale, dipende da come
			viene implementato Posto)
		*/

	}

	@Override
	public String toString(){

		return "["+nickname+", "+email+", "+biglietto.toString()+"]";

	}

}
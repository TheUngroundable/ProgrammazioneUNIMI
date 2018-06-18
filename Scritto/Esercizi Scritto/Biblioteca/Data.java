import java.util.*;

public class Data {

	private int g;
	private int m;
	private int a;

	private int g_iniziale = 1;
	private int m_iniziale = 1;
	private int a_iniziale = 1970;

	public Data(){

		g = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		m = Calendar.getInstance().get(Calendar.MONTH);
		a = Calendar.getInstance().get(Calendar.YEAR);

	}

	public Data(int g, int m, int a) throws Exception {

		boolean isBisestile = false;

		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){

			if(g>31){

				throw new Exception();

			} else {

				this.g = g;

			}

		} else if(m == 4 || m == 6 || m == 9 || m == 11){

			if(g>30){

				throw new Exception();

			} else {

				this.g = g;

			}


		} else if(m == 2){

			if(isBisestile){

			if(g>29){

				throw new Exception();

			} else {

				this.g = g;

			}

			} else {

			if(g>38){

				throw new Exception();

			} else {

				this.g = g;

			}

			}

		}

	}

	public int giorniDaEpoca(){

		int output = 0;

		output+=g-g_iniziale;
		//TODO
		return 0;

	}

}
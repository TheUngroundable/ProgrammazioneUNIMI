import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class righecolonnetuttezero{

	public static void main(String[] args) {
	
		int countrighe = 0;
		
		try { 

	        Scanner s = new Scanner(new FileReader("./matrix.txt"));  // Line 9
	    	
	    	String riga;

	        while(s.hasNextLine()){

	        	riga = s.nextLine();

	        	countrighe++;

	        }

	        s.close();


	        System.out.println("Numero di Righe tutte zero: "+countrighe);


	    } catch (FileNotFoundException e) {
	    
	        System.out.println("File not found");
	    
	    }

	    try { 

	        Scanner s = new Scanner(new FileReader("./matrix.txt"));  // Line 9

	        //Traspose file to matrix
	    	
	        String[] matrix = new String[countrighe];

	        int counter = 0;

	        while(s.hasNextLine()){

	        	matrix[counter] = s.nextLine();
	        	System.out.println(matrix[counter]);
	        	counter++;

	        }

	        //check tutterighe0

	        int tutterighe0 = 0;

	        for(int r = 0; r < matrix.length; r++){

	        	boolean tuttezero = true;

	        	for(int c = 0; c < matrix[r].length(); c++){

	        		if(matrix[r].charAt(c) != '0'){

	        			tuttezero = false;
	        			break;
	        		}


	        	}

	        	if(tuttezero){

	        		tutterighe0++;

	        	}

	        }

	        System.out.println("tutterighe0: "+tutterighe0);


	        //check if tuttecolonne 0


	        int tuttecolonne0 = 0;

	        

	        for(int c = 0; c < matrix[0].length(); c++){
	        	boolean tuttezero = true;

	        	for(int r = 0; r < matrix.length; r++){

	        		if(matrix[r].charAt(c) != '0'){

	        			tuttezero = false;
	        			break;
	        		}


	        	}

	        	if(tuttezero){

	        		tuttecolonne0++;

	        	}

	        }


	        System.out.println("tuttecolonne0: "+tuttecolonne0);


	    } catch (FileNotFoundException e) {
	    
	        System.out.println("File not found");
	    
	    }

	}

}

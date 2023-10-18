import java.io.*;

public class RicercaSequenziale {



	public static void main(String[] args) throws IOException{

		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));

		char [] c;
		char c2;

		int n;
		int j = 1;

		System.out.println("Quanti caratteri inserire:");

		n = Integer.parseInt(stdin.readLine());

		c = new char [n];

		for (int i=0; i<n; i++) {

			System.out.println("Inserisci un carattere:");

			c[i] = stdin.readLine().charAt(0);
			
		}

		

		System.out.println("Quale carattere vuoi verificare:");

		c2 = stdin.readLine().charAt(0);

		

		for (int i=0; i<n; i++) {

			if (c[i] == c2) {

				System.out.println("Il carattere si trova nello spazio "+i);
				j = 0;
				break;
				
			} 
		}

		if (j!=0) {
			System.out.println("Il carattere non è presente");
		}

	}
}



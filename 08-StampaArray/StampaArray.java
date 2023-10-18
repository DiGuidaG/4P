import java.io.*;
public class StampaArray {

	public static void main(String[] args) throws IOException{
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		
		
		String v[];
		int n;
		
					
		System.out.println("Inserire il numero di stringhe: ");
		n=Integer.parseInt(stdin.readLine());
		
		v=new String [n];	
				
				for (int i=0; i<n; i++) {
					System.out.println("Inserire il contenuto della "+i+" stringa: ");
					v[i]=(stdin.readLine());
				}
				
		
		
		System.out.print("[");
		for (int i=0; i<n; i++) {
			System.out.print(v[i]);
			if (i<n-1) 
				System.out.print(", ");
		}
		System.out.print("]");
	}

}

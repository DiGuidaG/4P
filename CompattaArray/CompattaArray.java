import java.io.*;
public class CompattaArray {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		int [] v;
		int n, k, n2;
		
		System.out.println("Quanti numeri vuoi inserire:");
		n = Integer.parseInt(stdin.readLine());
		
		v = new int [n];
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Inserisci un valore nell'array:");
			v[i] = Integer.parseInt(stdin.readLine());
	
		}
		
		System.out.println("Inserisci il numero da compattare nell'array:");
		n2 = Integer.parseInt(stdin.readLine());
		
		k = v.length - 1;
		
		for (int i=0; i<k; i++) {
			
			if (v[i] == n2) {
				
				for (int j=i; j<k; j++) {
					
					v[j] = v[j+1];
					
				}
				
				v[k] = n2;
				i--;
				k--;
				
			}
		}
		System.out.print("[");
		for (int i=0; i<v.length; i++) {
			System.out.print(v[i]);
			if (i<v.length-1)
				System.out.print(", ");
		}
		
		System.out.print("]");
	}

}

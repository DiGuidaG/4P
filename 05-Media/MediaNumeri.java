import java.io.*;
public class MediaNumeri {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		int n, n1, t=0, s=0, m;
		
		System.out.print("Quanti numeri vuoi inserire?");
		n=Integer.parseInt(stdin.readLine());
		
		for (int i=0; i<n; i++) {
			n1=Integer.parseInt(stdin.readLine());
			if (n1>0) {
				t=s;
				s=n1+t;
			} else
				System.out.print("Il numero non e'positivo!");
		}
		
		m=s/n;
		System.out.print("La media e':"+m);
		
	}
}

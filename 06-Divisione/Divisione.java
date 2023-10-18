import java.io.*;
	public class Divisione { public static void main(String[] args) throws IOException {
	BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	
	int n1, n2, q=0, r=0;
	
	System.out.print("Inserisci il numeratore: ");
	n1=Integer.parseInt(stdin.readLine());
	
	while(n1<0) {
		System.out.println("Inserire un numero positivo o nullo.");
		System.out.print("Inserisci il numeratore: ");
		n1=Integer.parseInt(stdin.readLine());
	}
	
	System.out.print("Inserisci il denominatore: ");
	n2=Integer.parseInt(stdin.readLine());
	
	
	while(n2<1) {
		System.out.println("Inserire un numero positivo.");
		System.out.print("Inserisci il denominatore: ");
		n2=Integer.parseInt(stdin.readLine());
	}
	
	while (n1!=0) {
	if (n1>n2) {
		n1=n1-n2;
		q++;
	} else if (n1<n2) {
		r=n1;
		n1=0;
	} else {
		r=0;
		q++;
		n1=0;
	}
	}
	
	System.out.println("Il quoziente è "+ q +" e il resto è "+ r);
	
}
}

import java.io.*;
public class Input {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		int altezza=0, peso=0;
		System.out.print("Inserisci un'altezza in cm:");
		altezza=Integer.parseInt(stdin.readLine());
		System.out.print("Inserisci un peso in grammi:");
		peso=Integer.parseInt(stdin.readLine());
		double altezzaInMetri=(double)altezza/100;
		double pesoInKg=(double)peso/100;
		
		double BMI;
		BMI=pesoInKg/(altezzaInMetri*altezzaInMetri);
		
		System.out.print("Il tuo BMI è':"+Math.round(BMI)+" ");
		
		if (BMI<18.5) 
			System.out.print("Sei sottopeso.");
		else if (BMI>25)
			System.out.print("Sei sovrappeso");
		else 
			System.out.print("Sei normopeso");
	}

}

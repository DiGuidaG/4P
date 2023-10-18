
public class BMI {
	public static void main(String[] args) {
		int altezza=172;
		int peso=57000;
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

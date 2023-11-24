
public class Frazione {

		private int num, den;
		
		//costruttore della frazione
		public Frazione(int num, int den) {
			this.num=num;
			this.den=den;
		}
		
		//costruttore passando solo il numeratore mentre il denominatore è 1
		
		public Frazione (int num) {
			this.num=num;
			this.den=1;
		}
		
		public int getNumeratore() { return num;}
		
		public int getDenominatore() { return den;}
		
		public void setNumeratore(int num) {
			this.num=num;
		}
		
		public void setDenominatore (int den) {
			this.den=den;
		}
		
		public String toString() {
			
			return num+"/"+den;
		}
	
}



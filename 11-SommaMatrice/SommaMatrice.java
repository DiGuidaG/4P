import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class SommaMatrice {

	public static void main(String[] args) throws IOException{
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		int [][]m = new int [3][3];
		int a, s = 0;
		
for (int i=0; i<3;i++) {
			
			for(int j=0;j<3;j++) {
				m[i][j]= Integer.parseInt(stdin.readLine());
				
			}
			
		}
		
		for (int i=0; i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if (i==j) {
					a = m[i][j];
					s = a + s;
				}
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("La somma e': "+s);
		
		
	}
	
}



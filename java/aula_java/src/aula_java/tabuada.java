package aula_java;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
			for(int y=1;y<=10;y++) {
			
				System.out.printf("Tabula %d",y);
				System.out.println();
				System.out.println();
			for(int x=1;x<=10;x++) {
				
				System.out.printf("%d x %d = %d",y,x, (y*x));
				System.out.println();
		    }
				System.out.println();
		}
		
	}
}

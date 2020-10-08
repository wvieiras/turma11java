/*
1 - Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
*/

package listas_java;

import java.util.Scanner;

public class Lista02_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
	
		int x;
		double pass;
		
		for(x=1000;x<2000;x++)
			
			if(x%11==5) {
				System.out.println(x);
			}
	
		leia.close();

	}

}

/*
2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

 */

package listas_java;

import java.util.Scanner;

public class Lista02_Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x, num, par = 0, impar = 0;
		
		for(x=1;x<=10;x++) {
			
			System.out.printf("Digite o %d° número: ", x);
			num = leia.nextInt();
			
			if(num%2==0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
			
			
		}
		
		System.out.printf("A soma de números pares é %d ", par);
		System.out.println();
		System.out.printf("A soma de números impares é %d ", impar);
		leia.close();
	}

}

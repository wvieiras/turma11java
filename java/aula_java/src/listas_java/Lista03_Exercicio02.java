/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package listas_java;

import java.util.Scanner;

public class Lista03_Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int[] numeros = new int[6];
		int[] pares = new int[6];
		int[] impares = new int[6];
		int par = 0,impar = 0;
		
		for(int i=0;i<numeros.length;i++) {
			System.out.printf("Digite o %d° numero: ",i+1);
			numeros[i] = leia.nextInt();
			
			if(numeros[i]%2==0) {
				pares[i] = numeros[i];
				par = par + numeros[i];
				
			}else {
				impares[i] = numeros[i];
				impar++;
			}
		}
		
		for(int i=0;i<pares.length;i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println(par);
		
		for(int i=0;i<impares.length;i++) {
			System.out.println(impares[i]);
		}
		
		System.out.println(impar);

		leia.close();

	}

}

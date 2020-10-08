/*
 * 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package listas_java;

import java.util.Scanner;

public class Lista01_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, max = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		if(num1 > max) {
			max = num1;
		}
		
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num2 > max) {
			max = num2;
		}
		
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num3 > max) {
			max = num3;
		}
		
		System.out.print("O maior número entre os três digitados é: "+max);
		
		leia.close();

	}

}

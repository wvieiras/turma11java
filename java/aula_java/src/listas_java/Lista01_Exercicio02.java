/*
 * 2 - Faça um programa que entre com três números e coloque em ordem crescente.
*/

package listas_java;

import java.util.Scanner;

public class Lista01_Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite três números abaixo: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if((num1>=num2) && (num1>=num3) && (num2>=num3)) {
			System.out.printf("%d, %d, %d", num3, num2, num1);
		}else if((num1<=num2) && (num1>=num3) && (num2>=num3)) {
			System.out.printf("%d, %d, %d", num3, num1, num2);
		}else if((num1<=num2) && (num1<=num3) && (num2>=num3)) {
			System.out.printf("%d, %d, %d", num1, num3, num2);
		}else if((num1<=num2) && (num1<=num3) && (num2<=num3)) {
			System.out.printf("%d, %d, %d", num1, num2, num3);
		}else {
			System.out.printf("%d, %d, %d", num2, num1, num3);
		}
		
		
		leia.close();

	}

}

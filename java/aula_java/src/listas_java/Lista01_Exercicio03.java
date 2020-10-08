/*
3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 . 10-14 infantil
 . 15-17 juvenil
 . 18-25 adulto
*/

package listas_java;

import java.util.Scanner;

public class Lista01_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia =  new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("10-14 infantil");
		}else if(idade>=15 && idade<=17) {
			System.out.println("15-17 Juvenil");
		}else if(idade>=18 && idade<=25) {
			System.out.println("18-25 adulto");
		}else {
			System.out.println("Digite uma idade válida");
		}
		
		leia.close();

	}

}

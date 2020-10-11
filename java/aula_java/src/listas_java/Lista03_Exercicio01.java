/*
1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package listas_java;

import java.util.Scanner;

public class Lista03_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int soma;
		int[] A = new int[6];
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = (A[0] + A[1] + A[5]);
		
		System.out.println("a)");
		
		for(int i=0;i<A.length;i++) {
			System.out.println("O vetor na posição "+i+"° é = "+A[i]);
		}
		
		System.out.println();
		
		
		
		
		System.out.println("b)");
		System.out.println("A soma dos vetores é: "+soma);
		
		System.out.println();
		
		System.out.println("c)");
		A[4] = 100;
		System.out.println("Vetor na posição 4 é "+A[4]);
		
		System.out.println();
		
		System.out.println("d)");
		for(int i=0;i<A.length;i++) {
			System.out.println("O vetor na posição "+i+"° é = "+A[i]);
		}
			
		
		
		leia.close();

	}

}

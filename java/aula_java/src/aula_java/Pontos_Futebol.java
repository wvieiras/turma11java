/*
VETOR COM OS 4 TIMES DE SÃO PAULO 
CORINTHIANS 
PALMEIRAS 
SPFC 
SANTOS 
GANHA - 3 PONTOS 
EMPATA - 1 PONTO 
PERDE - 0 PONTO 
PRIMEIRA RODADA 
CADA TIME SE GANHOU, PERDEU OU EMPATOU 
MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA 
SEGUNDA RODADA 
RESULTADOS JÁ COM A SEGUNDA RODADA 
TERCEIRA RODADA - MESMA COISA 
*/

package aula_java;

import java.util.Scanner;

public class Pontos_Futebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String[] times = new String [4];
		int[] pontosTimes = new int [4];
		char resposta;
		char continua;
		int contador = 1;
		
		times[0] = "Corinthians";
		times[1] = "Palmeiras";
		times[2] = "SPFC";
		times[3] = "Santos";
		
		do {
			System.out.println("Rodada "+contador);
			for (int x =0;x<times.length;x++) {
				System.out.println("O time "+times[x]+" ganhou, perdeu ou empatou?");
				resposta = leia.next().toUpperCase().charAt(0);
				if (resposta == 'G') {
					pontosTimes[x] = pontosTimes[x] + 3;
				}
				else if (resposta == 'P') {
					pontosTimes[x] = pontosTimes[x] + 0;
				}
				else if (resposta =='E') {
					pontosTimes[x] = pontosTimes[x] + 1;
				}
			}
		
			for (int x = 0;x<4;x++) {
				System.out.println(times[x]+" tem "+pontosTimes[x]+" pontos.");
			}
			System.out.println("Continua ou não?");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
		
		} while(continua == 'S');
		
	}

}

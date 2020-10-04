/*
Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: 
[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
*/

programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, int1 = 0, int2 = 0, int3 = 0, int4 = 0
		cadeia pergunta = "S"
	
	escreva("Deseja incluir um número [S] - sim ou [N] não: ")
	leia(pergunta)
	
	enquanto (pergunta=="S"){

				
				escreva("Digite um número entre 0 e 100: ")
				leia (numero)
		
				se(numero>=0 e numero<=25){
					
					int1 = int1 + 1
					
				}senao se(numero>=26 e numero<=50){
					
					int2 = int2 + 1
					
				}senao se(numero>=51 e numero<=75){
					
					int3 = int3 + 1
				}senao se(numero>=76 e numero<=100){
					
					int4 = int4 + 1
				}
				escreva("Deseja incluir um número [S] - sim ou [N] não: ")
				leia(pergunta)
		}

		escreva("Quantida de números no intervalo [0-25]: ", int1)
		escreva("\nQuantida de números no intervalo [26-50]: ", int2)
		escreva("\nQuantida de números no intervalo [51-75]: ", int3)
		escreva("\nQuantida de números no intervalo [76-100]: ", int4)

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 897; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
Encontre após a maior pontuação e a apresente.
*/

programa
{
	funcao inicio()
	{
		inteiro numero[5],x,maior_numero = 0

		para(x=0;x<4;x++){
		
			escreva("Entre com um número: ")
			leia(numero[x])

			se(numero[x] > maior_numero){

			maior_numero = numero[x]
			
			}
		
		} para(x=0;x<4;x++) {
			escreva("O Valor da ", x+1, "° posição é: ",numero[x], "\n")		
		
		}

		escreva("O maior número do vetor é: ", maior_numero)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
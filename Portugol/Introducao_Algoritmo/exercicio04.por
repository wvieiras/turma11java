//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão...
programa
{
	
	funcao inicio()
	{
		real A = 0.0
		real B = 0.0
		real C = 0.0
		real R = 0.0
		real S = 0.0
		real D = 0.0
		
		escreva("Digite um número inteiro positivo A = ")
		leia(A)		
		escreva("Digite um número inteiro positivo B = ")
		leia(B)
		escreva("Digite um número inteiro positivo C = ")
		leia(C)

		R = (A+B)*(A+B)

		S = (B+C)*(B+C)

		D = (R + S) / 2

		escreva("Resultado da expressão é igual a = ", D)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
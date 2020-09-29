/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo.
*/
programa
{
	
	funcao inicio()
	{
		real base = 0.0
		real altura = 0.0
		real triangulo = 0.0

		
		escreva("Digite o valor da base do triângulo: ")
		leia(base)
		escreva("Digite o valor da altura do triângulo: ")
		leia(altura)

		se (base > 0 e altura > 0) {
			
		triangulo = (base*altura) / 2

		escreva("O cálculo da área do triângulo é: ", triangulo)
		
		} senao {

		escreva("Digite números positivos maiores que zero")
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
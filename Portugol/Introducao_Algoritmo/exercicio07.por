programa
{
	
	funcao inicio()
	{

		real A = 0.0
		real B = 0.0
		real C = 0.0
		real D = 0.0
		real E = 0.0
		real F = 0.0
		real X = 0.0
		real Y = 0.0
		
		
		escreva("Digite o coeficiente A = ")
		leia(A)
		escreva("Digite o coeficiente B = ")
		leia(B)
		escreva("Digite o coeficiente C = ")
		leia(C)
		escreva("Digite o coeficiente D = ")
		leia(D)
		escreva("Digite o coeficiente E = ")
		leia(E)
		escreva("Digite o coeficiente F = ")
		leia(F)

		X = (((C*E)-(B*F)) / ((A*E)-(B*D)))
		Y = (((A*F)-(C*D)) / ((A*E)-(B*D)))

		escreva("O cálculo para equação com os valores propostos é: ", X, "e ", Y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
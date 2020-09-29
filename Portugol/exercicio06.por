/* Construa um programa em c que, 
tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
*/
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real Px1 = 0.0
		real Py1 = 0.0
		real Px2 = 0.0
		real Py2 = 0.0
		real D = 0.0

		
		escreva("Digite o ponto P(x1): ")
		leia(Px1)
		escreva("Digite o ponto P(y1): ")
		leia(Py1)
		escreva("Digite o ponto P(x2): ")
		leia(Px2)
		escreva("Digite o ponto P(y2): ")
		leia(Py2)

		D = mat.raiz(((Px2 - Px1)*(Px2 - Px1)) + ((Py2 - Py1)*(Py2 - Py1)),2.0)

		escreva("O resultado da equação é ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
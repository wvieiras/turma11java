/*
8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

programa
{
	
	funcao inicio()
	{

		real custoFabrica = 0.0
		real distribuidor = 1.28
		real custoTotal = 0.0
		
		escreva("Digite o custo de fábrica do automóvel: ")
		leia(custoFabrica)

		custoTotal = (custoFabrica * 1.45) + (custoFabrica * 1.28)

		escreva("O Custo total do consumidor é ", custoTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
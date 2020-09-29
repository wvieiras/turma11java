
/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
Caso contrário mostrar tais variáveis com o conteúdo ZERO. 
*/ 
programa
{
	
	funcao inicio()
	{
		//Se peso do tomate > 50 paga multa de 4 reais por quilo
		// P -> peso do tomate
		// E -> se houver excesso gravar na variável
		// M -> valor da multa

		real P = 0.0
		real E = 0.0
		real M = 0.0

		escreva("Digite o peso do tomate: ")
		leia(P)
		se (P > 50)
		{
			E = P - 50
			M = E*4
			escreva("O peso total de tomate é: ", P)
			escreva("\nO excesso é: ", E)
			escreva("\nA multa a ser paga é: ", M)
		} senao {
			
			escreva("O peso total de tomate é: ", P)
			escreva("\nO excesso é: ", E)
			escreva("\nA multa a ser paga é: ", M)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
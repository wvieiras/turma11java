/*
1. Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real preco_normal = 0.0, preco_produto = 0.0
		inteiro valor

		escreva("Digite o valor do produto: ")
		leia(preco_normal)
		limpa()
		escreva("Código de condição de pagamento: \n")
		escreva("1 - À vista em dinheiro ou cheque, recebe 20% de desconto\n")
		escreva("2 - À vista no cartão de crédito, recebe 15% de desconto\n")
		escreva("3 - Em duas vezes, preço normal de etiqueta sem juros\n")
		escreva("4 - Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		escreva("Digite o código para pagamento: ")
		leia(valor)
		limpa()
		escolha(valor){

			pare caso 1:

			escreva("O preço final do produto é: ", preco_normal*0.8)

			pare caso 2:

			escreva("O preço final do produto é: ", preco_normal*0.85)

			pare caso 3:

			escreva("O preço final do produto é: ", preco_normal)
			
			pare caso 4:

			escreva("O preço final do produto é: ", mat.arredondar((preco_normal*1.1),2))
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
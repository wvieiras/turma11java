/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
e se é positivo ou negativo.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N = 0

		escreva("Digite um número inteiro: ")
		leia(N)
		
		se (N%2 != 0 e N > 0) {
			
		escreva("O número ", N, " é impar e positivo" )
			
		} senao se (N%2 != 0 e N < 0){

		escreva("O número ", N, " é impar e negativo")
		
		} senao se (N > 0){

		escreva("O número ", N, " é par e positivo")
		
		} senao se (N == 0){
		
		escreva("zero é número neutro")
		
		} senao {

		escreva("O número ", N, " é par e negativo")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
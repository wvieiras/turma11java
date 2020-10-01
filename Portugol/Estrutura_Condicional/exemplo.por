programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario

		escreva("Digite um número inteiro positivo: ")
		leia(valorUsuario)

		parImpar(valorUsuario)
		
	}

	funcao parImpar (inteiro valorUsuario) {

		se ((valorUsuario % 2) > 0) {
		
		escreva("O número ", valorUsuario, " é impar")
		
		} senao se (valorUsuario == 0) {
		
		escreva("O número ", valorUsuario, " neutro")
		
		} senao se (valorUsuario < 0) {

		escreva("Você digitou um número negativo")
		
		} senao {

		escreva("O número ", valorUsuario, " é par")

		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
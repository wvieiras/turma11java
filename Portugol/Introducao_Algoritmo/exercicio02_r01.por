//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

programa
{
	
	funcao inicio()
	{
		inteiro diasIdade = 0
		inteiro anos = 0
		inteiro mes = 0
		inteiro dias = 0

		escreva("Digite sua idade em dias: ")
		leia(diasIdade)

		anos = diasIdade / 365
		mes = (diasIdade % 365) / 30
		dias = (diasIdade % 365) % 30
		escreva("Quantidade de anos = ", anos, "\n")
		escreva("Quantidade de meses = ", mes, "\n")
		escreva("Quantidade de dias = ", dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
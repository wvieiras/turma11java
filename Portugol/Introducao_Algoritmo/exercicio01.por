
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

programa
{
	
	funcao inicio()
	{
		inteiro anoIdade
		inteiro mesIdade
		inteiro diasIdade
		inteiro numDias = 0
		
		escreva("Digite sua idade em anos: ")
		leia(anoIdade)
		escreva("Digite sua idade em meses: ")
		leia(mesIdade)
		escreva("Digite sua idade em dias: ")
		leia(diasIdade)

		numDias = (anoIdade * 365) + (mesIdade * 30) + (diasIdade)

		escreva("O total da sua idade em dias é ", numDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 526; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
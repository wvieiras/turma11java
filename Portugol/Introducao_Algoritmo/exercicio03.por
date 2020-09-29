//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

programa
{
	
	funcao inicio()
	{
		inteiro segundos = 0
		inteiro horas = 0
		inteiro minutos = 0
		inteiro seg = 0

		escreva("Digite o tempo em segundos = ")
		leia(segundos)
		horas = (segundos / 3600)
		minutos = ((segundos / 60) - (horas * 60))
		seg = segundos - ((horas * 3600) + (minutos * 60))

		escreva("\n horas = ", horas)
		escreva("\n minutos = ", minutos)
		escreva("\n segundos = ", seg)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/*
5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
*/

programa
{
	
	funcao inicio()
	{
		real nota1 = 0.0
		real nota2 = 0.0
		real nota3 = 0.0

		escreva("Digite a primeira nota: ")
		leia(nota1)
		escreva("Digite a primeira nota: ")
		leia(nota2)
		escreva("Digite a primeira nota: ")
		leia(nota3)
		escreva("A média do aluno é = ", ((nota1*2) + (nota2*3) + (nota3*5)) / 10)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
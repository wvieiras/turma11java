programa
{
	
	funcao inicio()
	{
		inteiro idade = 0
		
		escreva("Digite a idade do nadador: ")
		leia(idade)

		se (idade >= 0 e idade <= 7) {
		
		escreva("Infantil A = 5 a 7 anos")
		
		} senao se (idade >= 8 e idade <= 11) {
		
		escreva("Infantil B = 8 a 11 anos")
		
		} senao se (idade >= 12 e idade <= 13) {
		
		escreva("Juvenil A = 12 a 13 anos")
		
		} senao se (idade >= 14 e idade <= 17) {
		
		escreva("Juvenil B = 14 a 17 anos")
		
		} senao se (idade >= 18) {
			
		escreva("Adultos = Maiores de 18 anos")
		
		} senao {
		
		escreva("Digita um número válido de idade")
		
		}	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
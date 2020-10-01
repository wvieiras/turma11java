/*
4.Crie um programa que receba valores do usuário
para preencher uma matriz 3X3, e em seguida, exiba a
soma dos valores dela e a soma dos valores da primeira diagonal
ou seja, diagonal principal.
*/

programa
{
	inclua biblioteca Util --> ut
	funcao pula(){
		escreva("\n")
	}
	funcao edlinha(){
		para (inteiro x = 1; x<40; x++){
			escreva("═")	
		}
		
	}
	
	funcao inicio()
	{
		 //constante
		 const inteiro LIMITELINHA=3,LIMITECOLUNA=3
		 //matriz
		 inteiro valores[LIMITELINHA][LIMITECOLUNA]
		 //variaveis
		 inteiro linha=0, coluna=0, totalDiagonal = 0, totalMatriz = 0
		
		 //usuario vai cadastrar os valores
		 para (linha = 0; linha<LIMITELINHA; linha++) //laço da linha
		 {
		 	para (coluna = 0; coluna <LIMITECOLUNA; coluna++)
		 	{
		 		escreva("Digite o valor da linha ",linha," e coluna ", coluna," :")
		 		valores[linha][coluna] = ut.sorteia(1, 10) //use o sortei pra simular a digitação
		 		escreva(" ",valores[linha][coluna])
		 		pula()
		 		se(linha==coluna)
		 		{
		 			totalDiagonal = totalDiagonal + valores[linha][coluna]	 			
		 		}
				totalMatriz = totalMatriz + valores[linha][coluna]
		 		
		 	}
		  }
		  escreva("A soma da diagonal principal é:",totalDiagonal)
		  pula()
		  edlinha()
		  pula()
		  escreva("O total dos valores digitados é : ", totalMatriz)
		  pula()
		  edlinha()
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
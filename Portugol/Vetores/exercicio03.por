/*
3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

//////////////////////////////////////////EXERCICIO NÃO COMPLETO//////////////////////////////////////////////
programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO_LINHA = 2
		const inteiro TAMANHO_COL = 3

		inteiro N1[TAMANHO_LINHA][TAMANHO_COL], N2[TAMANHO_LINHA][TAMANHO_COL], M1[TAMANHO_LINHA][TAMANHO_COL],M2[TAMANHO_LINHA][TAMANHO_COL],linha, coluna

		para(linha=0;linha<TAMANHO_LINHA;linha++){

			para(coluna=0;coluna<TAMANHO_COL;coluna++){
			
			escreva("Escreva o valor índice [",linha,"][",coluna, "] para matriz N1: ")
			leia(N1[linha][coluna])

			escreva("Escreva valor índice [",linha,"][",coluna, "] para matriz N2: ")
			leia(N2[linha][coluna])
			
			}

		
		}

//			M1[TAMANHO_LINHA][TAMANHO_COL] = N1[TAMANHO_LINHA][TAMANHO_COL] + N2[TAMANHO_LINHA][TAMANHO_COL]
//			M2[TAMANHO_LINHA][TAMANHO_COL] = N1[TAMANHO_LINHA][TAMANHO_COL] - N2[TAMANHO_LINHA][TAMANHO_COL]
		
		
		para(linha=0;linha<TAMANHO_LINHA;linha++){
		
			para(coluna=0;coluna<TAMANHO_COL;coluna++){
			
			escreva("[", N1[linha][coluna],"]")
			
			}

			escreva("\n")
		
		}

		escreva("\n---------------------------------------------\n")
		
		para(linha=0;linha<TAMANHO_LINHA;linha++){
		
			para(coluna=0;coluna<TAMANHO_COL;coluna++){
			
			escreva("[", N2[linha][coluna],"]")
			
			}

			escreva("\n")
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
A prefeitura deseja saber:   
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
 */

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		const inteiro habitantes = 3
		inteiro x
		real salario = 0.0
		real filhos = 0.0
		real mediaSalario = 0.0
		real mediaFilhos = 0.0
		real somas = 0.0
		real somaf = 0.0
		real maiorSalario = 0.0
		real percentual = 0.0
		
		para (x=1;x<=(habitantes);x++)
		{
		escreva(x,"° Habitante - Digite o seu salário: ")
		leia(salario)
		escreva(x,"° Habitante - Digite o número de filhos: ")
		leia(filhos)

		somas = somas + salario
		somaf = somaf + filhos
		//escreva("\n------------------------------\n")
		//escreva(somas,"\n")
		//escreva(somaf)
		//escreva("\n------------------------------\n")

		se (salario > maiorSalario) {
		maiorSalario = salario
		}

		se (salario < 100) {
			percentual = percentual++
		}
		
		}

		mediaSalario = (somas / habitantes)
		mediaFilhos = (somaf / habitantes)

		escreva("A média do salário dos habitantes é: ",mediaSalario)
		escreva("\nA média dos filhos dos habitantes é: ", mediaFilhos)
		escreva("\nO maior salário é: ", maiorSalario)
		escreva("\nPercentual de pessoas com salário até 100 reais: ",(percentual/habitantes)*100,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
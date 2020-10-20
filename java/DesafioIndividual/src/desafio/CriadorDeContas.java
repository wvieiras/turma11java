package desafio;

import java.util.Scanner;

public class CriadorDeContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1000;
		char escolha = ' ';
		char emprestimo = ' ';
		int tipo = 0;
		int operacao = 0;
		int ano = 2020;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Deseja abrir uma conta S-Sim / N-Não: ");
		escolha = leia.next().toUpperCase().charAt(0);
		
		if(escolha=='S') {
			System.out.print("Digite seu nome: ");
			nome = leia.next();
			System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.println("Que tipo de conta deseja abrir?");
			System.out.println("Opção 0 - Para conta Poupança.");
			System.out.println("Opção 1 - Para conta Corrente");
			System.out.println("Opção 2 - Para conta Empresa");
			System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			
			System.out.println("Digite a opção desejada");
			tipo = leia.nextInt();
			
			if(tipo==0) {
					
					
					System.out.print("Digita o mês do seu aniversario: ");
					int mes = leia.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(contador,mes);
					System.out.println();
					System.out.println("###Olá "+nome+" você é um novo cliente do Banco Gen###");
					System.out.println("tSua conta é a nº "+contador+" seu mês de aniversário é "+poupanca.getMesAniversario());
					System.out.println("O Saldo atual da sua conta é "+poupanca.getSaldo());
					System.out.println("---------------------------------------------------------------------");
				
					do{
						System.out.println("▓▓▓▓▓▓▓▓▓▓-Conta Poupança-▓▓▓▓▓▓▓▓▓▓");
						System.out.println("Qual operação deseja fazer?");
						System.out.println("Opção 0 - Para fazer um depósito");
						System.out.println("Opção 1 - Para sacar dinheiro");
						System.out.println("Opção 2 - Sair");
						System.out.println("Opção 3 - Consultar saldo Poupança(Correção Monetária)");
						operacao = leia.nextInt();
						if(operacao==0) {
							System.out.println("Digite o valor que deseja depositar");
							double deposito = leia.nextDouble();
							poupanca.credite(deposito);
						}else if(operacao==1) {
							if(poupanca.getSaldo()<=0) {
								System.out.println("sua conta está sem saldo");
							}else {
								System.out.println("O Saldo disponível para saque é: "+poupanca.getSaldo());
								System.out.println("Digite o valor para saque: ");
								poupanca.debite(leia.nextDouble());
							}
						}else if(operacao==2) {
							System.out.println("▓▓▓▓▓▓▓▓▓▓Infomações atuais da Conta▓▓▓▓▓▓▓▓▓▓");
							System.out.println("Nome do cliente "+nome);
							System.out.println("Número da Conta "+contador);
							System.out.println("O Saldo atual da sua conta é "+poupanca.getSaldo());
						}else if(operacao==3) {
							System.out.print("Digite o ano atual: ");
							int anoAtual = leia.nextInt();
							int cor = anoAtual - ano;
							
						}
					}while(operacao!=2);
			}else if(tipo==1) {
				ContaCorrente corrente = new ContaCorrente(contador);
				System.out.println("Olá "+nome+" você é um novo cliente do Banco Gen");
				System.out.println("Sua conta é a nº "+contador+" e você já pode começar a desfrutar dos nossos serviços");
				System.out.println("O Saldo atual da sua conta é "+corrente.getSaldo());
				System.out.println("---------------------------------------------------------------------");
				
					do{
						System.out.println("▓▓▓▓▓▓▓▓▓▓-Conta Corrente-▓▓▓▓▓▓▓▓▓▓");
						System.out.println("Qual operação deseja fazer?");
						System.out.println("Opção 0 - Para fazer um depósito");
						System.out.println("Opção 1 - Para sacar dinheiro");
						System.out.println("Opção 2 - Sair");
						operacao = leia.nextInt();
						if(operacao==0) {
							System.out.println("Digite o valor que deseja depositar");
							double deposito = leia.nextDouble();
							corrente.credite(deposito);
						}else if(operacao==1) {
							if(corrente.getSaldo()<=0) {
								System.out.println("sua conta está sem saldo");
							}else {
								System.out.println("O Saldo disponível para saque é: "+corrente.getSaldo());
								System.out.println("Digite o valor para saque: ");
								corrente.debite(leia.nextDouble());
							}
						}else if(operacao==2) {
							System.out.println("▓▓▓▓▓▓▓▓▓▓Infomações atuais da Conta▓▓▓▓▓▓▓▓▓▓");
							System.out.println("Nome do cliente "+nome);
							System.out.println("Número da Conta "+contador);
							System.out.println("O Saldo atual da sua conta é "+corrente.getSaldo());
						}
					}while(operacao!=2);	
			}else if(operacao==2) {
				}else if(tipo==2) {
					System.out.print("Digita o limite disponivel a empresa: ");
					double limite = leia.nextDouble();
					ContaEmpresa empresa = new ContaEmpresa(contador,limite);
					System.out.println("Olá "+nome+" sua empresa agora é nossa cliente");
					System.out.println("O seu limite para empréstimo é "+empresa.getLimiteEmpresa());
					System.out.println("O Saldo atual da sua conta é "+empresa.getSaldo());
					System.out.println("---------------------------------------------------------------------");

					do{
						System.out.println("▓▓▓▓▓▓▓▓▓▓-Conta Empresa-▓▓▓▓▓▓▓▓▓▓");
						System.out.println("Qual operação deseja fazer?");
						System.out.println("Opção 0 - Para fazer um depósito");
						System.out.println("Opção 1 - Para sacar dinheiro");
						System.out.println("Opção 2 - Sair");
						System.out.println("Opção 3 - Empréstimo");
						operacao = leia.nextInt();
						if(operacao==0) {
							System.out.println("Digite o valor que deseja depositar");
							double deposito = leia.nextDouble();
							empresa.credite(deposito);
						}else if(operacao==1) {
							if(empresa.getSaldo()<=0) {
								System.out.println("sua conta está sem saldo");
							}else {
								System.out.println("O Saldo disponível para saque é: "+empresa.getSaldo());
								System.out.println("Digite o valor para saque: ");
								empresa.debite(leia.nextDouble());
							}
						}else if(operacao==2) {
							System.out.println("▓▓▓▓▓▓▓▓▓▓Infomações atuais da Conta▓▓▓▓▓▓▓▓▓▓");
							System.out.println("Nome do cliente "+nome);
							System.out.println("Número da Conta "+contador);
							System.out.println("O Saldo atual da sua conta é "+empresa.getSaldo());
						}else if(operacao==3) {
							System.out.println("O seu limite para empréstimo é: "+empresa.emprestimoEmpresarial());
							System.out.print("Deseja executar o empréstimo: S-Sim / N-Não: ");
							emprestimo = leia.next().toUpperCase().charAt(0);
							if(emprestimo=='S') {
								double cEmprestimo = empresa.emprestimoEmpresarial();
								empresa.credite(cEmprestimo);
							}
							
						}
					}while(operacao!=2);
				}
		}
		contador = contador+1;
		leia.close();
	}
	/*public static double operacoesPoupanca(double saldoAtual) {
		Scanner leia = new Scanner(System.in);
			System.out.println("Qual Operação deseja fazer em sua conta?");
			System.out.println("Opção 0 - Para fazer um depósito");
			System.out.println("Opção 1 - Para sacar dinheiro");
			System.out.println("Opção 2 - Para sair");
			int operacao = leia.nextInt();
			if(operacao==0) {
				System.out.println("Digite o valor que deseja depositar");
				double deposito = leia.nextDouble();
				saldoAtual = deposito;
			}else if(operacao==1) {
				if(saldoAtual<=0) {
					System.out.println("sua conta está sem saldo");
				}else {
					System.out.println("O Saldo disponível para saque é: "+saldoAtual);
					System.out.println("Digite o valor para saque: ");
				}
			}
		
		leia.close();
		return saldoAtual;
	
	}*/

}

package desafio;

import java.util.Scanner;

public class CriadorDeContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1000;
		char escolha = ' ';
		char transacao = ' ';
		int tipo = 0;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Deseja abrir uma conta: ");
		escolha = leia.next().toUpperCase().charAt(0);
		
		if(escolha=='S') {
			System.out.println("Digite seu nome: ");
			nome = leia.next();
			System.out.println("Que tipo de conta deseja abrir?");
			System.out.println("Opção 0 - Para conta Poupança.");
			System.out.println("Opção 1 - Para conta Corrente");
			System.out.println("Opção 2 - Para conta Empresa");
			tipo = leia.nextInt();
		
			if(tipo==0) {
				System.out.print("Digita o mês do seu aniversario: ");
				int mes = leia.nextInt();
				ContaPoupanca poupanca = new ContaPoupanca(contador,mes);
				System.out.println("###Olá "+nome+" você é um novo cliente do Banco AfroUbuntu###");
				System.out.println("tSua conta é a nº "+contador+" seu mês de aniversário é "+poupanca.getMesAniversario());
				System.out.println("O Saldo atual da sua conta é "+poupanca.getSaldo());
				System.out.println("---------------------------------------------------------------------");
				System.out.print("Deseja fazer alguma transação? S-Sim / N-Não");
				transacao = leia.next().toUpperCase().charAt(0);
				do{	System.out.println();
					System.out.println();
					double variavel = operacoesPoupanca(poupanca.getSaldo());
					poupanca.credite(variavel);
					System.out.print("Deseja fazer alguma transação? S-Sim / N-Não");
					transacao = leia.next().toUpperCase().charAt(0);
				 }while(transacao=='S'); 
			}
			if(tipo==1) {
				ContaCorrente corrente = new ContaCorrente(contador);
				System.out.println("Olá "+nome+" você é um novo cliente do Banco AfroUbuntu");
				System.out.println("Sua conta é a nº"+contador+" e você já pode começar a desfrutar dos nossos serviços");
			}
			if(tipo==2) {
				System.out.print("Digita o limite disponivel a empresa: ");
				double limite = leia.nextDouble();
				ContaEmpresa empresa = new ContaEmpresa(contador,limite);
				System.out.println("Olá "+nome+" sua empresa agora é nossa cliente");
				System.out.println("O seu limite para empréstimo é "+empresa.getLimiteEmpresa());
			}
			contador = contador+1;

		}
		
		leia.close();
		
	}
	
	public static double operacoesPoupanca(double saldoAtual) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Deseja fazer alguma operação em sua conta?");
		System.out.println("Opção 0 - Para fazer um depósito");
		System.out.println("Opção 1 - Para sacar dinheiro");
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
				double saque = leia.nextDouble();
			}
		}
		
	leia.close();
	return saldoAtual;
	
	}

}

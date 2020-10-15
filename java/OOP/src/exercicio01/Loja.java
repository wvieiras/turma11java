package exercicio01;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o nome do usuário: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Digite o sexo: ");
		cliente.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite ano de nascimento: ");
		cliente.anoNascimento = leia.nextInt();
		
		System.out.println(cliente.nome);
		System.out.println(cliente.sexo);
		System.out.println(cliente.calcIdade());
		
		leia.close();
		

	}

}

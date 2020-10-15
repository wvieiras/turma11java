package ecommerce;	

import java.util.Scanner;

public class lista_produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		// vetores
		String[] produtos = {"Camisa", "Pijama", "Calça", "Vestido", "Saia", "Blusa","Bermuda","Tênis","Sapato", "Casaco"};
		double precos[] = {30.00, 40.00, 80.00, 50.00, 30.00, 25.00,40.00,50.00,60.00,60.00};
		int codigo[] = {1, 2, 3, 4, 5,6,7,8,9,10};
		int qtdeEstoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int codigoDigitado, dias = 30;
		double subtotal = 0.0, totalCompra = 0.0;
		double total = 0, parcela = 0, imposto = 0; //Para cálculo Imposto
		byte opcaoPagamento = 1; //Para opção de pagamento
		
		// variaveis
		String nomeCliente;
		char genero = ' ', continua = ' ';
		System.out.print("***===== Bem vinde ao Brechó! ======***\n");
		System.out.print("\nAqui você encontra vestimentas super preservadas, baratas e estilosas!\n");
		System.out.print("\nPor favor, nos informe seu nome: ");
		nomeCliente = tec.next();
		System.out.print(
				nomeCliente + ", qual gênero você se identifica? Digite F - feminino / M - masculino / O - outros: ");
		genero = tec.next().toUpperCase().charAt(0);
		
		if (genero == 'F') {
			System.out.print(
					"\nBom dia, Sra " + nomeCliente + "! Seja bem vinda em nossa loja! \nSegue nosso catálogo: \n");
		} else if (genero == 'M') {
			System.out.print(
					"\nBom dia, Sr " + nomeCliente + "! Seja bem vindo em nossa loja! \nSegue nosso catálogo: \n");
		} else {
			System.out.println(
					"\nBom dia, " + nomeCliente + "! Seja bem vinde em nossa loja! \nSegue nosso catálogo: \n");
		}
		
		for (int listar = 0; listar < produtos.length; listar++) {
			System.out.println(produtos[listar] + "\t R$ " + precos[listar] + "\tCódigo: " + codigo[listar]
					+ "\tQuantidade em estoque: " + qtdeEstoque[listar]);
		}
		
		int estoque1 = qtdeEstoque[0];
		
		do {
			System.out.println("\nO que deseja comprar? Digite o código do produto.");
			System.out.print("Caso deseja encerrar compras e ir ao caixa, digite 0: ");
			
			codigoDigitado = tec.nextInt();
			
			
			if (codigoDigitado == 1) {
				System.out.println("Produto: "+produtos[0]+" Preço: "+precos[0]+" Estoque: "+qtdeEstoque[0]);
				qtdeEstoque[0] = qtdeEstoque[0] - 1;
				subtotal = subtotal + precos[0];
				System.out.println("Subtotal: "+subtotal);
				
			}else if(codigoDigitado == 2) {
				System.out.println("Produto: "+produtos[1]+" Preço: "+precos[1]+" Estoque: "+qtdeEstoque[1]);
				qtdeEstoque[1] = qtdeEstoque[1] - 1;
				subtotal = subtotal + precos[1];
				System.out.println("Subtotal: "+subtotal);
				
			}else if(codigoDigitado == 3) {
				System.out.println("Produto: "+produtos[2]+" Preço: "+precos[2]+" Estoque: "+qtdeEstoque[2]);
				qtdeEstoque[2] = qtdeEstoque[2] - 1;
				subtotal = subtotal + precos[2];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 4) {
				System.out.println("Produto: "+produtos[3]+" Preço: "+precos[3]+" Estoque: "+qtdeEstoque[3]);
				qtdeEstoque[3] = qtdeEstoque[3] - 1;
				subtotal = subtotal + precos[3];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 5) {
				System.out.println("Produto: "+produtos[4]+" Preço: "+precos[4]+" Estoque: "+qtdeEstoque[4]);
				qtdeEstoque[4] = qtdeEstoque[4] - 1;
				subtotal = subtotal + precos[4];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 6) {
				System.out.println("Produto: "+produtos[5]+" Preço: "+precos[5]+" Estoque: "+qtdeEstoque[5]);
				qtdeEstoque[5] = qtdeEstoque[5] - 1;
				subtotal = subtotal + precos[5];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 7) {
				System.out.println("Produto: "+produtos[6]+" Preço: "+precos[6]+" Estoque: "+qtdeEstoque[6]);
				qtdeEstoque[6] = qtdeEstoque[6] - 1;
				subtotal = subtotal + precos[6];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 8) {
				System.out.println("Produto: "+produtos[7]+" Preço: "+precos[7]+" Estoque: "+qtdeEstoque[7]);
				qtdeEstoque[7] = qtdeEstoque[7] - 1;
				subtotal = subtotal + precos[7];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 9) {
				System.out.println("Produto: "+produtos[8]+" Preço: "+precos[8]+" Estoque: "+qtdeEstoque[8]);
				qtdeEstoque[8] = qtdeEstoque[8] - 1;
				subtotal = subtotal + precos[8];
				System.out.println("Subtotal: "+subtotal);
			}else if(codigoDigitado == 10) {
				System.out.println("Produto: "+produtos[9]+" Preço: "+precos[9]+" Estoque: "+qtdeEstoque[9]);
				qtdeEstoque[9] = qtdeEstoque[9] - 1;
				subtotal = subtotal + precos[9];
				System.out.println("Subtotal: "+subtotal);
			}else {
				System.out.println("Você digitou um código inválido, tente novamente");
			}
		}while(codigoDigitado != 0);
			System.out.println();
			System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓-Sua compra foi finalizada-▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n");
			System.out.println("O valor total da compra é: R$ "+subtotal);
			System.out.println();
			System.out.println("\nQual será sua opção de pagamento? ");
			System.out.println("\nOpção 1 - Dinheiro ou cartão de débito à vista com 10% de desconto.");
			System.out.println("\nOpção 2 - Cartão de crédito em 1x sem juros.");
			System.out.println("\nOpção 3 - Cartão de crédito em 2x sem juros.");
			System.out.println("\nOpção 4 - Cartão de crédito em 3x sem juros.");
			System.out.println("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓-Digita a opção de pagamento-▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.print("\nDigite apenas o número da sua opção ====> ");
			opcaoPagamento = tec.nextByte();
			
			total = subtotal;
			imposto = (total/1.09)*0.09;
			
			if (opcaoPagamento == 1) {
				total = (subtotal*0.9);
				System.out.print("\nO valor total da compra é R$"+ total);
			}
			else if (opcaoPagamento == 2) {
				//total = total + (total/1.09*0.09);
				System.out.print("\nO valor total da compra é R$"+ total);	
			}
			else if (opcaoPagamento == 3) {
				//parcela = ((total + (total/1.09*0.09))/2);
				parcela = total / 2;
				for(int x=1;x<=2;x++) {
					System.out.printf("\n %dº paracela para %d dias",x,(x*dias));
				}
				System.out.println("\nO valor total da compra é R$ "+total+" e será pago em duas parcelas de R$ "+parcela);
			} else if (opcaoPagamento == 4) {
				//parcela = ((total + (total/1.09*0.09))/3);
				parcela = total / 3;
				for(int x=1;x<=3;x++) {
					System.out.printf("\n %dº paracela para %d dias",x,(x*dias));
				}
				System.out.println();
				System.out.println("\nO valor total da compra é R$ "+total+" e será pago em duas parcelas de R$ "+parcela);
			} else {
				System.out.println("\nVocê digitou opção de pagamento inválida. Tente novamente");
			}
			
			System.out.println("Agradeçemos por comprar no Brechó Store. Segue sua nota fiscal.");
			
			System.out.println("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓-NOTA FISCAL-▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.printf("\nO valor total da compra é: %.2f e o iCMS representa %.2f ",total,imposto);
			//System.out.println("\nO valor total da compra é: "+total+" e o iCMS representa "+imposto);

			
	}
}

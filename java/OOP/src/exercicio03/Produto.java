package exercicio03;

import exercicio03.Eletronico;

public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar
		Eletronico resistor  = new Eletronico("Resistor", 19.95, 20);
		Eletronico placaMae = new Eletronico("Placa Asus a450m", 750.50, 10);
		
		System.out.println("PRODUTOS DISPONIVEIS");
		System.out.println(resistor.nomeProduto+" - "+resistor.preco+" - "+resistor.quantidade);
		System.out.println(placaMae.nomeProduto+" - "+placaMae.preco+" - "+placaMae.quantidade);
	}

}

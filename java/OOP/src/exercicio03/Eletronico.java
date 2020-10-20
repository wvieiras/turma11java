/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto produto eletrônico, defina as instâncias deste objeto e apresente as 
informações deste objeto no console.
*/

package exercicio03;

public class Eletronico {
	//Atributos
	public String nomeProduto;
	public int numeroSerie;
	public double preco;
	public int quantidade;
	
	//Construtor
	public Eletronico() {
		
	}
	//Sobrecarregar Construtor
	public Eletronico(String nomeProduto, double preco, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//Métodos
	public double precoVenda() {
		return quantidade * preco;
	}
}

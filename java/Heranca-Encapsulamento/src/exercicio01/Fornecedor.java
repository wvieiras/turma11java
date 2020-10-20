/*
2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. 
Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a 
classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e 
valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, 
para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve a 
diferença entre os valores dos atributos valorCredito e valorDivida. 
Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe 
permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da 
classe Pessoa.
*/
package exercicio01;

public class Fornecedor extends Pessoa{
	//Atributos
	private double valorCredito;
	private double valorDivida;
	
	//Construtor
	public Fornecedor(String name) {
		super();
	}
	
	//Sobrecarga construtor
	public Fornecedor(String name, String adress, String phone, double valorCredito, double valorDivida) {
		super(name,adress,phone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//Encapsulamento
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//Método
	public double obterSaldo() { 
		return (this.valorCredito - this.valorDivida);
	}
	
}

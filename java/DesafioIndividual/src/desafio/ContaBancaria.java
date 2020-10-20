package desafio;

public class ContaBancaria {
	//Atributos
	private int numero;
	private double saldo;
	private String transacoes[];
	
	//Construtor
	public ContaBancaria() {
		
	}
	//Sobrecarga
	public ContaBancaria(int numero) {
		this.numero = numero;
	}
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//Encapsulamento
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String[] getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(String[] transacoes) {
		this.transacoes = transacoes;
	}
	
	//Métodos
	public double credite(double valor) {
		this.saldo = this.saldo + valor;
		return this.saldo;
	}
	
	public double debite(double valor) {
		this.saldo = this.saldo - valor;
		return this.saldo;
	}
}

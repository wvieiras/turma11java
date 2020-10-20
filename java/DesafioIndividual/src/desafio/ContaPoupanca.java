package desafio;

public class ContaPoupanca extends ContaBancaria{
	//Atributos
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	//Construtor
	public ContaPoupanca(int numero) {
		super();
	}
	
	//Sobrecarga Construtor
	public ContaPoupanca(int numero, int mesAniversario) {
		super(numero);
		this.mesAniversario = mesAniversario;
	}
	
	public ContaPoupanca(int numero, double juros, double corrMonetaria, int mesAniversario) {
		super(numero);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	
	//Encapsulamento
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrMonetaria() {
		return corrMonetaria;
	}

	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	//Métodos
	public double aniversarioMes(int mesAniversario) {
		return this.corrMonetaria * super.getSaldo();
	}
		
}

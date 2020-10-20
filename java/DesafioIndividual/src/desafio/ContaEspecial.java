package desafio;

public class ContaEspecial extends ContaCorrente {
	private double limite;

	public ContaEspecial(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}
	
	//Encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	double calculaJuros(double selic){
		return super.getSaldo() * selic;  
	}

}

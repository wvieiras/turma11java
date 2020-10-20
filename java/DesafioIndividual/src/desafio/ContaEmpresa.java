package desafio;

public class ContaEmpresa extends ContaBancaria{
	private double limiteEmpresa;
	
	public ContaEmpresa(int numero){
		super(numero);
	}
	
	public ContaEmpresa(int numero, double limiteEmpresa){
		super(numero);
		this.limiteEmpresa = limiteEmpresa;
	}
	
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}

	public double emprestimoEmpresarial() {
		return ((this.limiteEmpresa * 2 - (this.limiteEmpresa / 2)));
	}
}

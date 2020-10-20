package desafio;

public class ContaCorrente extends ContaBancaria{
	//Atributo
	private int talonario;
	
	//Construtor
	public ContaCorrente(int numero){
		super();
	}
	
	public ContaCorrente(int numero, int talonario) {
		super(numero);
		this.talonario = talonario;
	}

	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
	
	public int emiteTalonario() {
		return this.talonario + 1;
	}
}

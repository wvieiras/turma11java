/*
2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto avião, defina as instâncias deste objeto e apresente as informações deste 
objeto no console.
*/

package exercicio02;

public class Aviao {
	//Atributos
	public String modelo;
	public int numeroAssentos;
	public int anoFabricacao;
	
	//Construtor
	public Aviao() {
		
	}
	
	//Sobrecarga do construtor
	public Aviao(String modelo, int numeroAssentos) {
		this.modelo = modelo;
		this.numeroAssentos = numeroAssentos;
	}
	
	//Metodos
	public int anosUso() {
		return 2020 - anoFabricacao;
	}
}

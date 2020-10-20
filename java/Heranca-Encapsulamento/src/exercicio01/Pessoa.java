/*
1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) 
e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores 
conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
*/
package exercicio01;

public class Pessoa {
	//Atributo
	private String name;
	private String adress;
	private String phone;
	
	//Contrutor
	public Pessoa() {
		
	}
	
	//Sobrecarga Construtor
	public Pessoa(String name) {
		this.name = name;
	}
	
	public Pessoa(String name, String adress, String phone) {
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}
	
	//Encapsulamento - (seletores setters e getters)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

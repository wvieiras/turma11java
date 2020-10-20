package exercicio01;

public class TesteEx01e02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor fornecedor01 = new Fornecedor("Wellington", "Rua morada nova 390", "95138-8603", 5000, 3000);
		
		System.out.println(fornecedor01.getName());
		System.out.println(fornecedor01.obterSaldo());
	}

}

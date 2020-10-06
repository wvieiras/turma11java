package aula_java;

import java.util.Scanner;

public class Lista01_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, minutos, seg;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = leia.nextInt();

		horas = (segundos / 3600);
		minutos = ((segundos / 60) - (horas * 60));
		seg = segundos - ((horas * 3600) + (minutos * 60));
		
		System.out.println("horas : "+horas);
		System.out.println("minutos : "+minutos);
		System.out.println("segundos : "+seg);
		
		
		
		leia.close();

	}

}

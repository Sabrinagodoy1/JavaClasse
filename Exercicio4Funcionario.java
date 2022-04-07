package classe;

import java.util.Scanner;

public class Exercicio4Funcionario {

	public static void main(String[] args) {
		Exercicio4Modelo funcionario1=new Exercicio4Modelo();
		Scanner ler= new Scanner(System.in);
		System.out.println("diga seu nome: ");
		funcionario1.nome=ler.next();
				
		System.out.println("quantas horas você trabalhou: ");
		funcionario1.horasTrabalhadas=ler.nextInt();
				
			funcionario1.estado();

	}

}

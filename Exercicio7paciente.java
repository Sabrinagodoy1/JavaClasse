package classe;

import java.util.Scanner;

public class Exercicio7paciente {

	//OI
	public static void main(String[] args) {
		Exercicio7Modelo paciente1=new Exercicio7Modelo();
		Scanner ler=new Scanner(System.in);
		System.out.println("digite seu nome: ");
		paciente1.nome=ler.next();
		System.out.println("digite seu peso: ");
		paciente1.peso=ler.nextInt();
		System.out.println("digite sua altura: ");
		paciente1.altura=ler.nextInt();
		System.out.println("digite sua idade: ");
		paciente1.idade=ler.nextInt();
		System.out.println("Voc� tem alguma alergia: ");
        paciente1.alergia=ler.next();
        System.out.println("voc� tem alguma doen�a? ");
        paciente1.doen�a=ler.next();
        paciente1.paciente();
        
	}

}

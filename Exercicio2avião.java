package classe;

import java.util.Scanner;

public class Exercicio2avi�o {
	
	public static void main(String[] args) {
		
		Exercicio2Modelo aviao1= new Exercicio2Modelo();
		Scanner ler=new Scanner(System.in);
		
		System.out.println("digite o modelo do avi�o: ");
		aviao1.modelo=ler.next();
		
		System.out.println("digite a quantidade de pessoa: ");
		aviao1.quantidadePessoa=ler.nextInt();
		
		aviao1.estado();
				
	}

}

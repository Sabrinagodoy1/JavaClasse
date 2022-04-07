package classe;

import java.util.Scanner;

public class Exercicio6banco {
	public static void main(String[] args) {
		Exercicio6Modelo pessoa1 =new Exercicio6Modelo();
		Scanner ler= new Scanner(System.in);
		
		System.out.println("digite o quanto você tem na sua conta bancaria: ");
		pessoa1.dinheiro=ler.nextInt();
		
	
		pessoa1.conta();
	}

}

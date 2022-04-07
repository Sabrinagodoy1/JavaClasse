package classe;

import java.util.Scanner;

public class Exercicio3eletronico {

	public static void main(String[] args) {
	Exercicio3Modelo eletronico1=new Exercicio3Modelo();
	Scanner ler=new Scanner(System.in);
	
	System.out.println("digite o aparelho desejado, celular, notebook ou computador: " );
	eletronico1.aparelho=ler.next();
	
	eletronico1.estado();
	}

}

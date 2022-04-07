package classe;

import java.util.Scanner;

public class Exercicio1cliente {

	public static void main(String[] args) {
		Exercicio1Modelo cliente1= new Exercicio1Modelo();
		Scanner ler=new Scanner(System.in);
		System.out.println("digite seu nome: ");
		cliente1.nome=ler.next();
		
		System.out.println("digite sua idade: ");
		cliente1.idade=ler.nextInt();
		
		System.out.println("valor da sua compra: ");
		cliente1.valor=ler.nextDouble();
		
		System.out.println("quantas coisas você comprou: ");
		cliente1.quantidadeCompra=ler.nextInt();
	
		cliente1.estado();

	}

}

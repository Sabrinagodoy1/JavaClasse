package classe;

import java.util.Scanner;

public class Exercicio5patins {
	public static void main(String[] args) {
		
		Exercicio5Modelo patins1=new Exercicio5Modelo();
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		patins1.idade=leia.nextInt();
		System.out.println("Digite a cor do patins que você deseja: ");
		patins1.cor=leia.next();
				
		patins1.patins();
	}

}

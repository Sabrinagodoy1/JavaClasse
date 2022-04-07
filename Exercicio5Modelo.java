package classe;

public class Exercicio5Modelo {
	String cor;
	int preco=250;
	String modelo;
	String rosa,azul;
	int idade;
	int quantidadeEstoque=200;
	String I1,I2,J;
	
	public void Exercicio5ModeloPatins () {
		this.preco=250; 
	 }
	public void patins()
	{
		if (idade<8) {
			modelo=I1;
			System.out.println("o moedelo melhor para você é o infantil 1");}
		else if(idade<12) {
			modelo=I2;
		System.out.println("modelo melhor para você é o infantil 2");}
		else if (idade>12) {
			modelo=J;
			System.out.println("modelo melhor para você é o juvenil");}
		
		System.out.println("o preço do patins é: "+this.preco);
		System.out.println("a cor do patins é:"+this.cor);
		System.out.println("ainda temos: "+this.quantidadeEstoque+"patins");

	}

}

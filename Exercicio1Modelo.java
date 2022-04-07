package classe;

public class Exercicio1Modelo {
   //atributoss
	
	String nome;
	int idade;
	int quantidadeCompra;
	double valor;
	boolean comprou;
	
	//metodo construtor
	public void ModeloCliente() {
		
	}
		public void comprar() {
			}
			
		
		public void estado() {
			System.out.println("seja bem vindo cliente");
			System.out.println();
			if(idade<18) {
				System.out.println("você não pode comprar, chame seu responsavel");
				}
			
			if(valor>200.0) 
				System.out.println("você ganhou um desconto de 20%, por ter comprado mais de 200 reais");
			
			
			if(quantidadeCompra>=5)
				System.out.println("você tem um desconto de 10%, por ter comprado mais de 4 coisas");
			
			
			System.out.println("nome do cliente: "+this.nome);
			System.out.println();
			System.out.println("idade do cliente: "+this.idade);
			System.out.println();
			System.out.println("quantas coisas você comprou:"+this.quantidadeCompra);
			System.out.println();
			System.out.println("valor da sua compra: "+this.valor);
		
}}


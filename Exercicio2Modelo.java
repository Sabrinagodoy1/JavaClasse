package classe;

public class Exercicio2Modelo {
//atributos
	String modelo;
	double velocidade;
	int quantidadePessoa;
	int combustivel;
	//construtor
	public Exercicio2Modelo() {
	
		this.velocidade=100;
		this.combustivel=1000;
		
		}
	public void quantidadeDeCombustivel() {
		if(combustivel<1000)
			System.out.println("o avião não pode decolar");
		else
			System.out.println("perfeito para decolar ;)");
	}
	
		
	
	public void estado() {
		
		System.out.println("modelo do avião: "+this.modelo);
		System.out.println();
		System.out.println("velocidade do avião: "+this.velocidade);
		System.out.println();
		System.out.println("a quantidade de pessoas é "+this.quantidadePessoa);
		if(quantidadePessoa>200)
			System.out.println("TEM MAIS PESSOAS DO QUE O AVIÃO SUPORTA");
	
		System.out.println();
		System.out.println("a quantidade de combustivel: "+this.combustivel);
	}
	
}
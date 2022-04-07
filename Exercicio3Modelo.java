package classe;

public class Exercicio3Modelo {
	//ATRIBUTOS
	String aparelho;
	String celular, notebook,computador;
	int bateria;
	int memoria;
	boolean camera;
	int valor;
	
	
	//CONSTRUTOR
	public Exercicio3Modelo() {
		this.bateria=100;
	

		if(aparelho==celular) {
			memoria=64;
			camera=true;
			valor=1000;
		}
		else if(aparelho==notebook) {
			memoria=120;
			camera=true;
			valor=3000;
		}
		else if(aparelho==computador) {
			memoria=280;
			camera=false;
			valor=5500;
			System.out.println("compre uma webcam :)");
		}}
	public void estado() {
		System.out.println("o tipo do aparelho é:"+this.aparelho);
		
		System.out.println("a memoria desse aparelho é: "+this.memoria);
		System.out.println("a bateria esta:"+this.bateria+"%");
		System.out.println("tem camera:"+this.camera);
		System.out.println("o valor desse aparelho é: "+this.valor);
		
	}

}

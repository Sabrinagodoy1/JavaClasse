package classe;

public class Exercicio4Modelo {
	String nome;
	int salario=1200;
	int horasTrabalhadas;
	boolean VT=true,VA=true;
	boolean ferias;
	
	
	public void Exercicio4Modelofuncionario() {
		this.VA=true;
		this.salario=1200;
		this.VT=true;
			
	}
	public void estado() {
		System.out.println("funcionario(a): "+this.nome);
		System.out.println("seu salario �: "+this.salario);
		if(horasTrabalhadas>80) {
			System.out.println("voc� recebe um bonus esse m�s :)");
			this.ferias=true;
		}
	
		System.out.println("suas horas trabalhadas �: "+this.horasTrabalhadas);
		System.out.println("voc� possui VR: "+this.VA+"e voce possui VT: "+this.VT);
		System.out.println("vai ter ferias daqui um tempo: "+this.ferias);
	}

}


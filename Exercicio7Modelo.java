package classe;

public class Exercicio7Modelo {
String nome;
int idade;
int peso;
int altura;
String alergia;
String doen�a;
int peso1;
 public void Exercicio7Modelo() {
	 peso1=peso/altura;
		if(peso1<18.5)
	 		System.out.println("Abaixo do peso");
	 	if(peso1>18.5||peso1<24.9)
	 	System.out.println("peso normal");
	 	if(peso1>25.0 ||peso1<29.9)
	 		System.out.println("sobrepeso");
	 	if(peso1>30.0||peso1<39.9)
	 		System.out.println("obsidade");
	 	if(peso1>40.0) {

 			System.out.println("obsidade grave");
	 	}
 }


 public void paciente()
 {
	 System.out.println("nome paciente: "+this.nome);
	 System.out.println("idade do paciente: "+this.idade);
	 if(idade<18) 
		System.out.println(" ser� atendido(a) pela PEDIATRA");
	
	  else  {
		System.out.println("ser� atendido(a) pelo CLINICO GERAL");
	}
	 if(idade>60) {
		 System.out.println("voc� ter� prioridade");
	 }
	 	System.out.println("seu peso � "+this.peso);
	    System.out.println("voc� esta: "+this.peso1);
	 	System.out.println("alergia �: "+this.alergia);
	 	System.out.println("o paciente tem: "+this.doen�a);
		System.out.println("ESPERE E VOC� SERA ATENDIDO");
	
 }

}

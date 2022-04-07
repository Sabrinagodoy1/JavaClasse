package classe;

public class Exercicio6Modelo {
	
int dinheiro;
boolean cartao=true;
int divida;
int juros;

 
	public void conta() {
		this.juros=-0;
		if(dinheiro<0) {
			juros=30;
		}
	
		    System.out.println("sua quantidade de dinheiro no banco é: "+this.dinheiro);
			System.out.println("você tem cartão: "+this.cartao);
			System.out.println("você tem um juros de:  "+juros);
			System.out.println("seu bonus é:"+this.dinheiro*2);
			
		}
		
	}



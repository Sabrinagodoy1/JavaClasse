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
	
		    System.out.println("sua quantidade de dinheiro no banco �: "+this.dinheiro);
			System.out.println("voc� tem cart�o: "+this.cartao);
			System.out.println("voc� tem um juros de:  "+juros);
			System.out.println("seu bonus �:"+this.dinheiro*2);
			
		}
		
	}



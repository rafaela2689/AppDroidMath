package math.equacoes;

//herda as caracte�sticas da classe Equacoes e usa polimorfismo no m�todo calcula
public class Logaritmo extends Equacoes {
	
	public double calcula(double n){
		
		return Math.log10(n);
	}

}

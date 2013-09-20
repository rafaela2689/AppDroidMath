package math.equacoes;

//herda as caracteísticas da classe Equacoes e usa polimorfismo no método calcula
public class Logaritmo extends Equacoes {
	
	public double calcula(double n){
		
		return Math.log10(n);
	}

}

package math.equacoes;

//classe pai
public class Equacoes {
	
	 protected int numeroInt;
	 protected double numeroDouble;
	 
	 
	protected int getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(int numeroInt) {
		this.numeroInt = numeroInt;
	}

	public double getNumeroDouble() {
		return numeroDouble;
	}

	public void setNumeroDouble(double numeroDouble) {
		this.numeroDouble = numeroDouble;
	}
	
	public int calcula(int n){
				
		return n == 0 ? 1 : n * calcula(n-1);
		
	}	

}

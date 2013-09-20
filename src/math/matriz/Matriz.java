package math.matriz;

public class Matriz {

private double[][] valor = new double[3][3];
	
	
	public double[][] getValor() {
		return valor;
	}

	//Construtor da Classe
	public Matriz(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33){
		this.valor[0][0]=m11;
		this.valor[0][1]=m12;
		this.valor[0][2]=m13;
		this.valor[1][0]=m21;
		this.valor[1][1]=m22;
		this.valor[1][2]=m23;
		this.valor[2][0]=m31;
		this.valor[2][1]=m32;
		this.valor[2][2]=m33;
			}

	//Construtor padrão
	public Matriz(){
		
	}
	
	public void setValor(int i, int j, double v){
		valor[i][j]=v;
	}

	public double getValor(int i, int j) {
		
		return valor[i][j];
	}

}

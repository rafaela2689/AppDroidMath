package math.matriz;

//herança da classe determinante
public class Inversa extends Determinante{

	//método construtor
	public Inversa(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33){
		super(m11,m12,m13,m21,m22,m23,m31,m32,m33);
	}
	
	//método para calcular a matriz inversa
	public void calcInversa(){
		double det=calcDeterminante();
		if( det!=0){
			this.setValor(0, 0, ((this.getValor(1, 1)*this.getValor(2, 2))-(this.getValor(1, 2)*this.getValor(2, 1)))/det);
			this.setValor(0, 1, ((this.getValor(1, 0)*this.getValor(2, 2))-(this.getValor(1, 2)*this.getValor(2, 0)))/det);
			this.setValor(0, 2, ((this.getValor(1, 0)*this.getValor(2, 1))-(this.getValor(1, 1)*this.getValor(2, 0)))/det);
			this.setValor(1, 0, ((this.getValor(0, 1)*this.getValor(2, 2))-(this.getValor(0, 2)*this.getValor(2, 1)))/det);
			this.setValor(1, 1, ((this.getValor(0, 0)*this.getValor(2, 2))-(this.getValor(0, 2)*this.getValor(2, 0)))/det);
			this.setValor(1, 2, ((this.getValor(0, 0)*this.getValor(2, 1))-(this.getValor(0, 1)*this.getValor(2, 0)))/det);
			this.setValor(2, 0, ((this.getValor(0, 1)*this.getValor(1, 2))-(this.getValor(0, 2)*this.getValor(1, 1)))/det);
			this.setValor(2, 1, ((this.getValor(0, 0)*this.getValor(1, 2))-(this.getValor(0, 2)*this.getValor(1, 0)))/det);
			this.setValor(2, 2, ((this.getValor(0, 0)*this.getValor(1, 1))-(this.getValor(0, 1)*this.getValor(1, 0)))/det);
			

		}
	}
}

package math.trigonometria;

public class Trigonometria implements Conversao {
	
	//atributos
	private double cateto1, cateto2;
	private double angulo;
	private double grau, rad;
	private double res;
	
	//método para calcular a hipotenusa
	public void calcularHipotenusa(double a, double b){
		this.setCateto1(a);
		this.setCateto2(b);
		this.setRes(Math.sqrt((a*a)+(b*b)));
	}
	
	//herda a interface Conversao e implementa o método grauToRadiano
	@Override
	public void grauToRadiano(double grau) {
		// TODO Auto-generated method stub
		this.setGrau(grau);
		this.setRes(Math.toRadians(grau));
	}

	//herda a interface Conversao e implementa o método radianoToGrau
	@Override
	public void radianoToGrau(double rad) {
		// TODO Auto-generated method stub
		this.setRad(rad);
		this.setRes(Math.toDegrees(rad));
	}
	
	//método para calcular o seno de um ângulo
	public void anguloSeno(double angulo){
		this.setAngulo(angulo);
		this.setRes(Math.sin(angulo));
	}
	
	//método para calcular o cosseno de um ângulo
	public void anguloCosseno(double angulo){
		this.setAngulo(angulo);
		this.setRes(Math.cos(angulo));
	}
	
	//método para calcular a tangente de um ângulo
	public void anguloTangente(double angulo){
		this.setAngulo(angulo);
		this.setRes(Math.tan(angulo));
	}

	//encapsulamento dos atributos
	public double getCateto1() {
		return cateto1;
	}

	public void setCateto1(double cateto1) {
		this.cateto1 = cateto1;
	}

	public double getCateto2() {
		return cateto2;
	}

	public void setCateto2(double cateto2) {
		this.cateto2 = cateto2;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public double getGrau() {
		return grau;
	}

	public void setGrau(double grau) {
		this.grau = grau;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}


}

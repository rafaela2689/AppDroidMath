package math.fisica;

//classe pai
public class Velocidade {
	
	protected double v;
	protected double s;
	protected double t;
		
	//encapsulamento
	
	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public double getS() {
		return s;
	}
	
	public void setS(double s) {
		this.s = s;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}	
	
	public double calculavel(double s, double t){
		double result ;
		
		result = s/t;
		
		return result;
		
	}


}

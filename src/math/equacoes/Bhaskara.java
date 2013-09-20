package math.equacoes;

public class Bhaskara {

	private double a;
    private double b;
    private double c;
    private double bQuadrado;
    private double menosB;
     
		// TODO Auto-generated constructor stub
	//encapsulamento
	public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getBQuadrado() {
        return bQuadrado;
    }
    public void setBQuadrado(double bQuadrado) {
        this.bQuadrado = bQuadrado;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getMenosB() {
        return menosB;
    }
    public void setMenosB(double menosB) {
        this.menosB = menosB;
    }
    
    // resolver primeiro raiz quadrada
    
    public double getDelta(){
    	//double raiz = 0;
        double multiplicacao = 0;
        double subtracao = 0;
        /*
         * então como diz a formula
         * b² - 4 a.c
         *
         *resolve a primeira parte, a parte da potencia.
         */
        setBQuadrado(Math.pow(getB(), 2));
        /*
         * Agora vamos a segunda parte a parte da multiplicação
         *  4.a.c
         */
        multiplicacao = 4 * getA() * getC();
        /*
         * Pronto agora vamos fazer a parte da subtração
         */
        subtracao = getBQuadrado() - multiplicacao;
        
        return subtracao;
    }
  
    public double getRaiz(){
        /*
         * Abaixo as variáveis que vamos usar
         * cada uma para guardar seu respectivo valor
         *
         */
        double raiz = 0;
        /*
         * então como diz a formula
         * b² - 4 a.c
         *
         *resolve a primeira parte, a parte da potencia.
         */
        /*
         * Agora vamos a segunda parte a parte da multiplicação
         *  4.a.c
         */
        /*
         * Pronto agora vamos fazer a parte da subtração
         */
        raiz = Math.sqrt(getDelta());
        return raiz;
    }
    public double getX1(){
        /*
         * Abaixo as variáveis que vamos usar
         * cada uma para guardar seu respectivo valor
         *
         */
        double x1 = 0;
        double soma = 0;
        /*
         * vamos trasnformar o B em menos B
         */
        menosB = -getB();
        /*
         * Agora vamos fazer a Soma
         * -b + raiz
         */
        soma = menosB + getRaiz();
        /*
         * Agora a divisão que resulta o X1
         */
        x1 = soma / (2 * getA());
        return x1;
    }
   public double getX2(){
       /*
        * Abaixo as variáveis que vamos usar
        * cada uma para guardar seu respectivo valor
        *
        */
        double x2 = 0;
        double subtracao = 0;
        /*
         * vamos trasnformar o B em menos B
         */
        menosB = -getB();
        /*
         * Agora vamos fazer a Subtração
         * -b - raiz
         */
        subtracao = menosB - getRaiz();
        /*
         * Agora a divisão que resulta o X2
         */
        x2 = subtracao / (2 * getA());
        return x2;
    }
}

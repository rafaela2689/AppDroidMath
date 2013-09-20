package math.matriz;

//import math.trigonometria.GrauToRadiano;
import java.text.DecimalFormat;
//import java.text.NumberFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainMatriz extends Activity implements View.OnClickListener {
	
	EditText eda11, eda12, eda13, eda21, eda22, eda23, eda31, eda32, eda33;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matriz);
		
		eda11 = (EditText) findViewById(R.id.EditText_l1c1);
        eda12 = (EditText) findViewById(R.id.EditText_l1c2);
        eda13 = (EditText) findViewById(R.id.EditText_l1c3);
        eda21 = (EditText) findViewById(R.id.EditText_l2c1);
        eda22 = (EditText) findViewById(R.id.EditText_l2c2);
        eda23 = (EditText) findViewById(R.id.EditText_l2c3);
        eda31 = (EditText) findViewById(R.id.EditText_l3c1);
        eda32 = (EditText) findViewById(R.id.EditText_l3c2);
        eda33 = (EditText) findViewById(R.id.EditText_l3c3);
        
        Button btnTransposta = (Button) findViewById(R.id.btn_transposta);
        Button btnDeterminante = (Button) findViewById(R.id.btn_determinante);
        Button btnInversa = (Button) findViewById(R.id.btn_inversa);
        Button btnCofatores = (Button) findViewById(R.id.btn_cofatores);
        //Button btnProdutos = (Button) findViewById(R.id.btn_produto);
        
        btnTransposta.setOnClickListener(this);
        btnDeterminante.setOnClickListener(this);
        btnInversa.setOnClickListener(this);
        btnCofatores.setOnClickListener(this);   
        
       
	}
	
	public void onClick(View v){
		
		double a11 = Double.parseDouble(eda11.getText().toString());
        double a12 = Double.parseDouble(eda12.getText().toString());
        double a13 = Double.parseDouble(eda13.getText().toString());
        double a21 = Double.parseDouble(eda21.getText().toString());
        double a22 = Double.parseDouble(eda22.getText().toString());
        double a23 = Double.parseDouble(eda23.getText().toString());
        double a31 = Double.parseDouble(eda31.getText().toString());
        double a32 = Double.parseDouble(eda32.getText().toString());
        double a33 = Double.parseDouble(eda33.getText().toString());
        
        DecimalFormat dc = new DecimalFormat("0.##");
        
        //NumberFormat nf = NumberFormat.getNumberInstance();
        
		switch (v.getId()){
		
			case R.id.btn_determinante:
				
				 Determinante d = new Determinante(a11,a12,a13,a21,a22,a23,a31,a32,a33);
			     d.calcDeterminante();
			     
			     AlertDialog.Builder dialogo = new AlertDialog.Builder(MainMatriz.this);
	             dialogo.setTitle("Resultado");//Defino o título
	             dialogo.setMessage("O determinante é: "+dc.format(d.calcDeterminante()));//Colocando a mensagem que vai ter dentro do Dialog
	             dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
	             dialogo.show();//mostrando o Dialog				
				break;
				
			case R.id.btn_cofatores:
				
				 CoFatores cf = new CoFatores(a11,a12,a13,a21,a22,a23,a31,a32,a33);
			     cf.calcCofatores();
			     
			     AlertDialog.Builder dialogo2 = new AlertDialog.Builder(MainMatriz.this);
	             dialogo2.setTitle("Resultado");//Defino o título
	             dialogo2.setMessage("Cofatores:\n"+"\t"+dc.format(cf.getValor(0, 0))+"  "+dc.format(cf.getValor(0, 1))+"  "+dc.format(cf.getValor(0, 2))+"\n"
	            		 +"\t"+dc.format(cf.getValor(1, 0))+"  "+dc.format(cf.getValor(1, 1))+"  "+dc.format(cf.getValor(1, 2))+"\n"
	            		 +"\t"+dc.format(cf.getValor(2, 0))+"  "+dc.format(cf.getValor(2, 1))+"  "+dc.format(cf.getValor(2, 2)));//Colocando a mensagem que vai ter dentro do Dialog
	             dialogo2.setNeutralButton("OK", null);//adicionando o botão de OK
	             dialogo2.show();//mostrando o Dialog

				break;
				
			case R.id.btn_inversa:
				
				Inversa i = new Inversa(a11,a12,a13,a21,a22,a23,a31,a32,a33);
		        
		        if(i.calcDeterminante()==0){
		        	AlertDialog.Builder dialogo3 = new AlertDialog.Builder(MainMatriz.this);
		        	dialogo3.setTitle("Resultado");//Defino o título
		        	dialogo3.setMessage("Determinante = 0!");//Colocando a mensagem que vai ter dentro do Dialog
		        	dialogo3.setNeutralButton("OK", null);//adicionando o botão de OK
		        	dialogo3.show();//mostrando o Dialog
		        }
		        else{
		        	i.calcInversa();
		        	AlertDialog.Builder dialogo3 = new AlertDialog.Builder(MainMatriz.this);
		        	dialogo3.setTitle("Resultado");//Defino o título
		        	dialogo3.setMessage("Matriz Inversa:\n"+dc.format(i.getValor(0, 0))+"  "+dc.format(i.getValor(0, 1))+"  "+dc.format(i.getValor(0, 2))+"\n"
		            		 +dc.format(i.getValor(1, 0))+"  "+dc.format(i.getValor(1, 1))+"  "+dc.format(i.getValor(1, 2))+"\n"
		            		 +dc.format(i.getValor(2, 0))+"  "+dc.format(i.getValor(2, 1))+"  "+dc.format(i.getValor(2, 2)));//Colocando a mensagem que vai ter dentro do Dialog
		        	dialogo3.setNeutralButton("OK", null);//adicionando o botão de OK
		        	dialogo3.show();//mostrando o Dialog
		        }
		        
				break;
				
			case R.id.btn_transposta:
				
				Transposta t = new Transposta(a11,a12,a13,a21,a22,a23,a31,a32,a33);
		        t.calcTransposta();
		        
		        AlertDialog.Builder dialogo4 = new AlertDialog.Builder(MainMatriz.this);
                dialogo4.setTitle("Resultado");//Defino o título
                dialogo4.setMessage("Matriz Transposta:\n"+dc.format(t.getValor(0, 0))+"  "+dc.format(t.getValor(0, 1))+"  "+dc.format(t.getValor(0, 2))+"\n"
	            		 +dc.format(t.getValor(1, 0))+"  "+dc.format(t.getValor(1, 1))+"  "+dc.format(t.getValor(1, 2))+"\n"
	            		 +dc.format(t.getValor(2, 0))+"  "+dc.format(t.getValor(2, 1))+"  "+dc.format(t.getValor(2, 2)));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo4.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo4.show();//mostrando o Dialog
		        
		        
				break;
		}
	}

}

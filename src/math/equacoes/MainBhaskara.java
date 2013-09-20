package math.equacoes;

//import java.

import java.text.DecimalFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainBhaskara extends Activity {
	
	EditText eda, edb, edc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bhaskara);
		
		eda = (EditText) findViewById (R.id.ed_bask_a);
		edb = (EditText) findViewById (R.id.ed_bask_b);
		edc = (EditText) findViewById (R.id.ed_bask_c);
		
		Button btcalcular = (Button) findViewById (R.id.bt_baskara);
		
		btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				DecimalFormat dec = new DecimalFormat("0.##");
				
				Bhaskara ba = new Bhaskara();
				double a = Double.parseDouble(eda.getText().toString());
				double b = Double.parseDouble(edb.getText().toString());
				double c = Double.parseDouble(edc.getText().toString());
				
				ba.setA(a);
				ba.setB(b);
				ba.setC(c);
				
				if(ba.getA()==0){
					AlertDialog.Builder dialogo = new AlertDialog.Builder(MainBhaskara.this);
                	dialogo.setTitle("Aviso");//Defino o título
                	dialogo.setMessage("O valor de 'a'\n não pode ser 0! ");//Colocando a mensagem que vai ter dentro do Dialog
                	dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                	dialogo.show();//mostrando o Dialog
				}
				
				else if(ba.getDelta()<0){
					AlertDialog.Builder dialogo = new AlertDialog.Builder(MainBhaskara.this);
                	dialogo.setTitle("Resultado");//Defino o título
                	dialogo.setMessage("A raiz não existe!\n Delta = "+ba.getDelta());//Colocando a mensagem que vai ter dentro do Dialog
                	dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                	dialogo.show();//mostrando o Dialog
				}
				else{
					
					ba.getRaiz();
				
					AlertDialog.Builder dialogo = new AlertDialog.Builder(MainBhaskara.this);
					dialogo.setTitle("Resultado");//Defino o título
					dialogo.setMessage("1o Raiz: "+String.valueOf(dec.format(ba.getX1()))+"\n2o Raiz: "+String.valueOf(dec.format(ba.getX2())));//Colocando a mensagem que vai ter dentro do Dialog
					dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
					dialogo.show();//mostrando o Dialog
				}
			}
		});
		
	}

}

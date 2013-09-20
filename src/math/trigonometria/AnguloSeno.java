package math.trigonometria;

import java.text.DecimalFormat;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;


public class AnguloSeno extends Activity {
	
	EditText edangulo;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anguloseno);
		
		edangulo = (EditText) findViewById(R.id.edTxtSeno);
        
        Button btcalcular = (Button) findViewById(R.id.btSeno);
        
        btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Trigonometria t = new Trigonometria();
				DecimalFormat dec = new DecimalFormat("0.##");
				
				double angulo = Double.parseDouble(edangulo.getText().toString()); 
				t.anguloSeno(angulo);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(AnguloSeno.this);
                dialogo.setTitle("Resultado");//Defino o t�tulo
                dialogo.setMessage("O seno do �ngulo � : "+String.valueOf(dec.format(t.getRes())));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o bot�o de OK
                dialogo.show();//mostrando o Dialog
				
			}
		});
		
	}
}

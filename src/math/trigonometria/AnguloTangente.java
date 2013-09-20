package math.trigonometria;

import java.text.DecimalFormat;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;


public class AnguloTangente extends Activity {
	
	EditText edangulo;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.angulotangente);
		
		edangulo = (EditText) findViewById(R.id.edTxtTangente);
        
        Button btcalcular = (Button) findViewById(R.id.btTangente);
        
        btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Trigonometria t = new Trigonometria();
				DecimalFormat dec = new DecimalFormat("0.##");
				
				double angulo = Double.parseDouble(edangulo.getText().toString()); 
				t.anguloTangente(angulo);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(AnguloTangente.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("A tangente do ângulo é : "+String.valueOf(dec.format(t.getRes())));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
			}
		});
	}

}

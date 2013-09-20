package math.fisica;

import java.text.DecimalFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainEspaco extends Activity {
	
	EditText edveloc, edtempo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.espaco);
		
		edveloc = (EditText) findViewById(R.id.ed_esp_veloc);
		edtempo = (EditText) findViewById(R.id.ed_esp_tempo);
		
		Button btcalc = (Button) findViewById(R.id.bt_calc_espaco);
		
		btcalc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DecimalFormat dec = new DecimalFormat("0.##");
				Espaco e = new Espaco();
				
				double veloc = Double.parseDouble(edveloc.getText().toString());
				double tempo = Double.parseDouble(edtempo.getText().toString());
				
				//t.calculavel(espaco, veloc);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainEspaco.this);
				dialogo.setTitle("Resultado");//Defino o título
				dialogo.setMessage("O espaço é: "+String.valueOf(dec.format(e.calculavel(veloc, tempo)))+" m");//Colocando a mensagem que vai ter dentro do Dialog
				dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
				dialogo.show();//mostrando o Dialog
				
				
			}
		});
	}

}

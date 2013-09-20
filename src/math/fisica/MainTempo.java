package math.fisica;

import java.text.DecimalFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainTempo extends Activity {
	
	EditText edespaco, edveloc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tempo);
		
		edespaco = (EditText) findViewById(R.id.ed_tempo_esp);
		edveloc = (EditText) findViewById(R.id.ed_tempo_veloc);
		
		Button btcalc = (Button) findViewById(R.id.bt_calc_tempo);
		
		btcalc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DecimalFormat dec = new DecimalFormat("0.##");
				Tempo t = new Tempo();
				
				double espaco = Double.parseDouble(edespaco.getText().toString());
				double veloc = Double.parseDouble(edveloc.getText().toString());
				
				//t.calculavel(espaco, veloc);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainTempo.this);
				dialogo.setTitle("Resultado");//Defino o título
				dialogo.setMessage("O tempo é: "+String.valueOf(dec.format(t.calculavel(espaco, veloc)))+" s");//Colocando a mensagem que vai ter dentro do Dialog
				dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
				dialogo.show();//mostrando o Dialog
				
				
			}
		});
	}

}

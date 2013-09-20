package math.fisica;

import java.text.DecimalFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainVelocidadeMedia extends Activity {
	
	EditText edespaco, edtempo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.velocmedia);
		
		edespaco = (EditText) findViewById(R.id.ed_vm_espaco);
		edtempo = (EditText) findViewById(R.id.ed_vm_tempo);
		
		Button btcalc = (Button) findViewById(R.id.bt_calc_velmedia);
		
		btcalc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DecimalFormat dec = new DecimalFormat("0.##");
				VelocidadeMedia vm = new VelocidadeMedia();
				
				double espaco = Double.parseDouble(edespaco.getText().toString());
				double tempo = Double.parseDouble(edtempo.getText().toString());
				
				//t.calculavel(espaco, veloc);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainVelocidadeMedia.this);
				dialogo.setTitle("Resultado");//Defino o título
				dialogo.setMessage("Velocidade Média: "+String.valueOf(dec.format(vm.calculavel(espaco, tempo)))+" m/s");//Colocando a mensagem que vai ter dentro do Dialog
				dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
				dialogo.show();//mostrando o Dialog
				
				
			}
		});
	}

}

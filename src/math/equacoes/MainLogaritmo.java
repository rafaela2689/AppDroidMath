package math.equacoes;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainLogaritmo extends Activity {
	
	EditText ednum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logaritmo);
		
		ednum = (EditText) findViewById (R.id.ed_log);
		
		Button btcalcular = (Button) findViewById(R.id.bt_log);
		
		btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Logaritmo l = new Logaritmo();
				
				double num = Double.parseDouble(ednum.getText().toString());
				//f.calcula(num);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainLogaritmo.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("O logaritmo é : "+String.valueOf(l.calcula(num)));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
				
			}
		} );
	}

}

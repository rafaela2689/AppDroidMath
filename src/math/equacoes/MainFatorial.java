package math.equacoes;

//import android.R;
//import math.trigonometria.GrauToRadiano;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;

public class MainFatorial extends Activity {

	EditText ednum;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fatorial);
		
		ednum = (EditText) findViewById (R.id.ed_fat);
		
		Button btcalcular = (Button) findViewById(R.id.bt_fat);
		
		btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Fatorial f = new Fatorial();
				
				int num = Integer.parseInt(ednum.getText().toString());
				//f.calcula(num);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainFatorial.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("O fatorial é : "+String.valueOf(f.calcula(num)));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
				
			}
		} );
		
	}

}

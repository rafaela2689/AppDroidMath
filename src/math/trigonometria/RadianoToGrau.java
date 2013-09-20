package math.trigonometria;

import java.text.DecimalFormat;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;


public class RadianoToGrau extends Activity {
	
	EditText edrad;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiano);
        
        edrad = (EditText) findViewById(R.id.edTxtRad);
        
        Button btconverter = (Button) findViewById(R.id.btRad);
        
        btconverter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Trigonometria t = new Trigonometria();
				DecimalFormat dec = new DecimalFormat("0.00");
				
				double rad = Double.parseDouble(edrad.getText().toString()); 
				t.grauToRadiano(rad);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(RadianoToGrau.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("O radiano em grau é : "+String.valueOf(dec.format(t.getRes())));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
			}
		});
	}


}

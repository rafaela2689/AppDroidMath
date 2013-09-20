package math.trigonometria;

import java.text.DecimalFormat;




import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import app.droid.math.R;


public class GrauToRadiano extends Activity {
	
	EditText edgrau;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grau);
        
        edgrau = (EditText) findViewById(R.id.edTxtGrau);
        
        Button btconverter = (Button) findViewById(R.id.btnConverterGrau);
        
        btconverter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Trigonometria t = new Trigonometria();
				DecimalFormat dec = new DecimalFormat("0.##");
				
				double grau = Double.parseDouble(edgrau.getText().toString()); 
				t.grauToRadiano(grau);
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(GrauToRadiano.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("O grau em radiano é : "+String.valueOf(dec.format(t.getRes())));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
			}
		});
	}

}

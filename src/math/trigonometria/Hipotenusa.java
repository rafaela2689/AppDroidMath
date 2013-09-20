package math.trigonometria;

import java.text.DecimalFormat;




import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import app.droid.math.R;


public class Hipotenusa extends Activity {
	
	EditText edcateto1, edcateto2;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hipotenusa);
        
         edcateto1 = (EditText) findViewById(R.id.edTxtCateto1);
         edcateto2 = (EditText) findViewById(R.id.edTxtCateto2);
        
        Button btcalcular = (Button) findViewById(R.id.bt_calcular);
        
        btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Trigonometria tri = new Trigonometria();
				
				double cateto1 = Double.parseDouble(edcateto1.getText().toString());
				double cateto2 = Double.parseDouble(edcateto2.getText().toString());
				//double res = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
				tri.calcularHipotenusa(cateto1, cateto2);
				
				DecimalFormat dec = new DecimalFormat("0.##");
				
				
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(Hipotenusa.this);
                dialogo.setTitle("Resultado");//Defino o título
                dialogo.setMessage("A hipotenusa é : "+String.valueOf(dec.format(tri.getRes())));//Colocando a mensagem que vai ter dentro do Dialog
                dialogo.setNeutralButton("OK", null);//adicionando o botão de OK
                dialogo.show();//mostrando o Dialog
				
			}
		});
        
	}
}

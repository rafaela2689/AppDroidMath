 package app.droid.math;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.app.*;

public class MathPrincipal extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btiniciar = (Button) findViewById(R.id.bt_iniciar);
        Button btsobre = (Button) findViewById(R.id.bt_sobre);
        Button btsair = (Button) findViewById(R.id.bt_sair);
        
        btiniciar.setOnClickListener(this);
        btsobre.setOnClickListener(this);
        btsair.setOnClickListener(this);      
        
        
    }
    	public void onClick(View v){
    		
    		switch(v.getId()){
    		
    		case R.id.bt_iniciar:
    			Intent iniciar = new Intent(MathPrincipal.this, Iniciar.class);
    			startActivity(iniciar);
    			break;
    		case R.id.bt_sobre:
    			Intent sobre = new Intent(MathPrincipal.this, Sobre.class);
    			startActivity(sobre);
    			break;
    		case R.id.bt_sair:
    			AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
    			dialogo.setTitle("Sair");
    			dialogo.setMessage("Tem certeza que deseja sair?");
    			dialogo.setCancelable(false);
    			dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {   				
    						public void onClick(DialogInterface dialog, int id){
    							
    							finish();
    						}
    				});
    			dialogo.setNegativeButton("Não", new DialogInterface.OnClickListener(){ 
    				public void onClick(DialogInterface dialog, int id) {
    				dialog.cancel();
    				}
    			});
    				dialogo.show();
    				break;
    				
    		}

    			  			
    }
    		
 }

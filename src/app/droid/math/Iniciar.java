package app.droid.math;


import math.equacoes.MainEquacoes;
import math.fisica.MainFisica;
import math.matriz.MainMatriz;
import math.trigonometria.MainTrigonometria;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Iniciar extends Activity implements OnItemClickListener {
	
	private String [] vetor = new String[4];
	private ListView listView;
	private ArrayAdapter<String> adapter = null;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar);
        
        listView = (ListView) findViewById(R.id.listViewIniciar);
      
    }
	
	protected void onStart(){
		super.onStart();
		Resources res = this.getResources();
		vetor[0] = res.getString(R.string.lv_matriz);
		vetor[1] = res.getString(R.string.lv_equacao);
		vetor[2] = res.getString(R.string.lv_trigonometria);
		vetor[3] = res.getString(R.string.lv_fisica);
		listView.setTextFilterEnabled(true);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vetor);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}
	
	public void clicouTrigonometria(View view){
		Intent i = new Intent(this.getApplicationContext(), MainTrigonometria.class);
		startActivity(i);
	}
	
	public void clicouEquacao(View view){
		Intent i = new Intent(this.getApplicationContext(), MainEquacoes.class);
		startActivity(i);
	}
	public void clicouMatriz(View view){
		Intent i = new Intent(this.getApplicationContext(), MainMatriz.class);
		startActivity(i);
	}
	public void clicouFisica(View view){
		Intent i = new Intent(this.getApplicationContext(), MainFisica.class);
		startActivity(i);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch(arg2){
		case 0: 
			clicouMatriz(null);
			break;
		case 1:
			clicouEquacao(null);
			break;
		case 2:
			clicouTrigonometria(null);
			break;
		case 3:
			clicouFisica(null);
			break;
		}
		
	}
	
}

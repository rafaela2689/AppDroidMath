package math.equacoes;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import app.droid.math.R;

public class MainEquacoes extends Activity implements OnItemClickListener {
	
	private ListView listView;
	private String [] lv_arr = new String[3];
	private ArrayAdapter<String> adapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.equacao);
		listView = (ListView) findViewById(R.id.lv_equacao);
        listView.setTextFilterEnabled(true);
	}

	@Override
	protected void onStart() {
    	super.onStart();
    	Resources res = this.getResources();
    	lv_arr[0] = res.getString(R.string.baskara);
    	lv_arr[1] = res.getString(R.string.log);
    	lv_arr[2] = res.getString(R.string.fat);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lv_arr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
	}
	
	 public void clicouBaskara(View view){
		 Intent i = new Intent(this.getApplicationContext(),MainBhaskara.class);
		 startActivity(i);
	 }
	 
	 public void clicouLog(View view){
		 Intent i = new Intent(this.getApplicationContext(),MainLogaritmo.class);
		 startActivity(i);
	 }
	 
	 public void clicouFat(View view){
		 Intent i = new Intent(this.getApplicationContext(),MainFatorial.class);
		 startActivity(i);
	 }
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch(arg2){
		case 0:
			clicouBaskara(null);
			break;
		case 1:
			clicouLog(null);
			break;
		case 2:
			clicouFat(null);
			break;
			
		}
		
	}

}

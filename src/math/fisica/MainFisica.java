package math.fisica;

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

public class MainFisica extends Activity implements OnItemClickListener{
	
	private ListView listView;
	private String [] lv_arr = new String[3];
	private ArrayAdapter<String> adapter = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainfisica);
		listView = (ListView) findViewById(R.id.listView_fisica);
        listView.setTextFilterEnabled(true);
	}
	
	@Override
	protected void onStart() {
    	super.onStart();
    	Resources res = this.getResources();
    	lv_arr[0] = res.getString(R.string.lv_espaco);
    	lv_arr[1] = res.getString(R.string.lv_tempo);
    	lv_arr[2] = res.getString(R.string.lv_veloc_med);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lv_arr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
	}

	public void clicouEspaco(View view){
		Intent i = new Intent(this.getApplicationContext(),MainEspaco.class);
		startActivity(i);
		
	}
	public void clicouTempo(View view){
		Intent i = new Intent(this.getApplicationContext(),MainTempo.class);
		startActivity(i);
		
	}
	public void clicouVelocMedia(View view){
		Intent i = new Intent(this.getApplicationContext(),MainVelocidadeMedia.class);
		startActivity(i);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch(arg2){
			case 0:
				clicouEspaco(null);
				break;
			case 1:
				clicouTempo(null);
				break;
			case 2:
				clicouVelocMedia(null);
				break;
		}
	}

}

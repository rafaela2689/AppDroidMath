package math.trigonometria;

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


public class MainTrigonometria extends Activity implements OnItemClickListener{
	
	private ListView listView;
	private String [] lv_arr = new String[6];
	private ArrayAdapter<String> adapter = null;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintrigonometria);
        listView = (ListView) findViewById(R.id.listViewTrigonometria);
        listView.setTextFilterEnabled(true);
        
        
	}
	 @Override
		protected void onStart() {
	    	super.onStart();
	    	Resources res = this.getResources();
	    	lv_arr[0] = res.getString(R.string.hipotenusa);
	    	lv_arr[1] = res.getString(R.string.grau);
	    	lv_arr[2] = res.getString(R.string.radiano);
	    	lv_arr[3] = res.getString(R.string.seno);
	    	lv_arr[4] = res.getString(R.string.cosseno);
	    	lv_arr[5] = res.getString(R.string.tangente);
	        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lv_arr);
	        listView.setAdapter(adapter);
	        listView.setOnItemClickListener(this);
		}
	 
	 public void clicouHipotenusa(View view){
		 Intent i = new Intent(this.getApplicationContext(),Hipotenusa.class);
		 startActivity(i);
	 }
	 
	 public void clicouConverterGrau(View view){
		 Intent i = new Intent(this.getApplicationContext(),GrauToRadiano.class);
		 startActivity(i);
	 }
	 
	 public void clicouConverterRadiano(View view){
		 Intent i = new Intent(this.getApplicationContext(),RadianoToGrau.class);
		 startActivity(i);
	 }
	 
	 public void clicouSeno(View view){
		 Intent i = new Intent(this.getApplicationContext(),AnguloSeno.class);
		 startActivity(i);		 
	 }
	 
	 public void clicouCosseno(View view){
		 Intent i = new Intent(this.getApplicationContext(),AnguloCosseno.class);
		 startActivity(i);	 
	 }
	 
	 public void clicouTangente(View view){
		 Intent i = new Intent(this.getApplicationContext(),AnguloTangente.class);
		 startActivity(i);	
	 }
	 
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch(arg2){
		case 0:
			clicouHipotenusa(null);
			break;
		case 1:
			clicouConverterGrau(null);
			break;
		case 2:
			clicouConverterRadiano(null);
			break;
		case 3:
			clicouSeno(null);
			break;
		case 4:
			clicouCosseno(null);
			break;
		case 5:
			clicouTangente(null);
			break;
		}
		
		
	}
}

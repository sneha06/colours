package in.jaaga.colours;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	int[] col = {android.R.color.holo_green_light,
			android.R.color.holo_orange_light,android.R.color.holo_red_light,android.R.color.holo_purple};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button start = (Button) findViewById(R.id.button1);
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl1);
        
        start.setOnClickListener(new View.OnClickListener() {
        	final Handler handler = new Handler();
			@Override
			public void onClick(View v) {
				
					
					  handler.postDelayed(new Runnable() { 
					  	public void run() {
					  		start.setText(" ");
					  		rl.setBackgroundResource(android.R.color.holo_blue_light);
					        
					  		handler.postDelayed(new Runnable() { 
							  	public void run() {
							  		start.setText(" ");
							  		rl.setBackgroundResource(android.R.color.holo_green_light);
							        
							  		handler.postDelayed(new Runnable() { 
									  	public void run() {
									  		start.setText(" ");
									  		rl.setBackgroundResource(android.R.color.holo_orange_light);
									          
									  		handler.postDelayed(new Runnable() { 
											  	public void run() {
											  		start.setText(" ");
											  		rl.setBackgroundResource(android.R.color.holo_red_light);
											  
											  		handler.postDelayed(new Runnable() { 
													  	public void run() {
													  		start.setText(" ");
													  		rl.setBackgroundResource(android.R.color.holo_purple);
													  		
													  		handler.postDelayed(new Runnable() { 
															  	public void run() {
															  		start.setText(" ");
															  		rl.setBackgroundResource(android.R.color.holo_blue_light);
															        
															  		handler.postDelayed(new Runnable() { 
																	  	public void run() {
																	  		start.setText(" ");
																	  		rl.setBackgroundResource(android.R.color.holo_green_light);
																	        
																	  		handler.postDelayed(new Runnable() { 
																			  	public void run() {
																			  		start.setText(" ");
																			  		rl.setBackgroundResource(android.R.color.holo_orange_light);
																			          
																			  		handler.postDelayed(new Runnable() { 
																					  	public void run() {
																					  		start.setText(" ");
																					  		rl.setBackgroundResource(android.R.color.holo_red_light);
																					  
																					  		handler.postDelayed(new Runnable() { 
																							  	public void run() {
																							  		start.setText(" ");
																							  		rl.setBackgroundResource(android.R.color.holo_purple);
																							  
																							  	}}, 1000);  
																					  		
																					  	}}, 1000);  
																			  		
																			  	}}, 1000);  
																	  		
																	  	}}, 1000);  
															  		
															  	}}, 1000);  
															   
													  
													  	}}, 1000);  
											  		
											  	}}, 1000);  
									  		
									  	}}, 1000);  
							  		
							  	}}, 1000);  
					  		
					  	}}, 1000);  
					   
				}
			
			
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    
}

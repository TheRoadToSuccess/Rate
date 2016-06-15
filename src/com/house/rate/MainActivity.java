package com.house.rate;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button m_detail = null;
	private Button m_newh	= null;
	private Button m_secondh = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        m_detail = (Button)super.findViewById(R.id.Detail);
        m_newh = (Button)super.findViewById(R.id.NewHouse);
        m_secondh = (Button)super.findViewById(R.id.SecondHouse);
        
        
        m_detail.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "detail", Toast.LENGTH_LONG).show();
				
			}
        	
        });

        m_newh.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_LONG).show();
				
			}
        	
        });

        m_secondh.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "second", Toast.LENGTH_LONG).show();
				
			}
        	
        });
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

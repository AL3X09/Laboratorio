package com.example.alecs.laboratorio;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
//import android.view.MenuItem;
//import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    public void Boton_situ(View v){
        // Button boton = (Button)findViewById(R.id.button_situ);
        Button boton = (Button) v;
        //boton.setText("Click");
        Intent i =  new  Intent (MainActivity.this ,Activity_situ.class );
        startActivity ( i );
        //startActivity(new Intent(Main.this, Situ.class));
    }

    public void Boton_operar(View v){
        Button botonOP = (Button) v;
        Intent i =  new  Intent (MainActivity.this ,Componer.class );
        startActivity ( i );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

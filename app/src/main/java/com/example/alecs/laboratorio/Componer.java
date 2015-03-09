package com.example.alecs.laboratorio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Componer extends ActionBarActivity {
   
    public EditText caudal,componer,cauinicial,talicuotas;
    private Button BtnOperar;
    private TextView textResu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componer);

        caudal=(EditText)findViewById(R.id.editCauI);
        componer=(EditText) findViewById(R.id.editTcomp);
        cauinicial=(EditText)findViewById(R.id.editCauT);
        talicuotas=(EditText) findViewById(R.id.editNalic);
        BtnOperar=(Button)findViewById(R.id.BtnOperar);
        textResu=(TextView)findViewById(R.id.textResu);

    }

    public void OnClickOperacion (View v) {
        float cau = Float.parseFloat(caudal.getText().toString());
        float caui = Float.parseFloat(cauinicial.getText().toString());
        float comp = Float.parseFloat(componer.getText().toString());
        float talicu = Float.parseFloat(talicuotas.getText().toString());
        float res = (cau * caui) / (comp * talicu);

        textResu.setText("EL TOTAL A COMPONER ES " + res);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_componer, menu);
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

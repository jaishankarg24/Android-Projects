package com.jai.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View v){
        EditText dollar = (EditText) findViewById(R.id.numberText);
        Double dollarDouble = Double.parseDouble(dollar.getText().toString());
        Double dollarPound = dollarDouble * 0.75;

        Toast.makeText(MainActivity.this, "$" + String.format("%.2f", dollarPound), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollar.getText().toString());


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.jai.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickingFunction(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);
        Log.i("Info", editText.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Log.i("Info1", editText2.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

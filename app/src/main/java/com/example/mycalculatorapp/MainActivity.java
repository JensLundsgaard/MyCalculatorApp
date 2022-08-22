package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void outputSin(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        TextView text = (TextView) findViewById(R.id.output);
        String inputString = editText1.getText().toString();
        String accuracyString = editText2.getText().toString();
        double input = Double.parseDouble(inputString);
        int accuracy = Integer.parseInt(accuracyString);

    }
    public void outputCos(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        String input = editText1.getText().toString();
        String accuracy = editText2.getText().toString();


    }
    public void outputLn(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        String input = editText1.getText().toString();
        String accuracy = editText2.getText().toString();


    }
    public void outputExp(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        String input = editText1.getText().toString();
        String accuracy = editText2.getText().toString();


    }
}
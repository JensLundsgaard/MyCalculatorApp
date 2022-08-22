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
        double output = TaylorMath.sin(input, accuracy);
        String outputString = String.valueOf(output);
        text.setText(outputString);
    }
    public void outputCos(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        TextView text = (TextView) findViewById(R.id.output);
        String inputString = editText1.getText().toString();
        String accuracyString = editText2.getText().toString();
        double input = Double.parseDouble(inputString);
        int accuracy = Integer.parseInt(accuracyString);
        double output = TaylorMath.cos(input, accuracy);
        String outputString = String.valueOf(output);
        text.setText(outputString);
    }
    public void outputLn(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        TextView text = (TextView) findViewById(R.id.output);
        String inputString = editText1.getText().toString();
        String accuracyString = editText2.getText().toString();
        double input = Double.parseDouble(inputString);
        int accuracy = Integer.parseInt(accuracyString);
        double output = TaylorMath.ln(input, accuracy);
        String outputString = String.valueOf(output);
        text.setText(outputString);

    }
    public void outputExp(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        TextView text = (TextView) findViewById(R.id.output);
        String inputString = editText1.getText().toString();
        String accuracyString = editText2.getText().toString();
        double input = Double.parseDouble(inputString);
        int accuracy = Integer.parseInt(accuracyString);
        double output = TaylorMath.exp(input, accuracy);
        /* Source: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
        *
        */
        output = (double)Math.round(output * 100000d) / 100000d;

        String outputString = String.valueOf(output);
        text.setText(outputString);
    }
}
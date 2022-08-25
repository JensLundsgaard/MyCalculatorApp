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


    public void showOutputTaylor(View view){
        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);
        TextView text = (TextView) findViewById(R.id.output);
        String inputString = editText1.getText().toString();
        String accuracyString = editText2.getText().toString();
        if(inputString.equals("")){
            inputString = "0.0";
        }
        if(accuracyString.equals("")){
            accuracyString = "20";
        }
        double input = Double.parseDouble(inputString);
        int accuracy = Integer.parseInt(accuracyString);
        double output = 0.0;
        switch (view.getId()) {
            case R.id.button:
                output = TaylorMath.sin(input, accuracy);
                break;
            case R.id.button2:
                output = TaylorMath.cos(input, accuracy);
                break;
            case R.id.button3:
                output = TaylorMath.ln(input, accuracy);
                break;
            case R.id.button4:
                output = TaylorMath.exp(input, accuracy);
                break;
        }
        // Source: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
        // This code allows you to round a double down to a certain number of digits.
        output = (double)Math.round(output * 100000d) / 100000d;
        String outputString = String.valueOf(output);
        text.setText(outputString);
    }
    public void showOutputBasic(View view){
        EditText editText1 = (EditText) findViewById(R.id.operand1);
        EditText editText2 = (EditText) findViewById(R.id.operand2);
        TextView text = (TextView) findViewById(R.id.output);
        String operand1String = editText1.getText().toString();
        String operand2String = editText2.getText().toString();
        if(operand1String.equals("")){
            operand1String = "0.0";
        }
        if(operand2String.equals("")){
            operand2String = "1.0";
        }

        double op1 = Double.parseDouble(operand1String);
        double op2 = Double.parseDouble(operand2String);
        double output = 0.0;
        switch (view.getId()) {
            case R.id.addition:
                output = op1 + op2;
                break;
            case R.id.subtraction:
                output = op1 - op2;
                break;
            case R.id.multiplication:
                output = op1 * op2;
                break;
            case R.id.division:
                output = op1 / op2;
                break;
        }
        String outputString = String.valueOf(output);
        text.setText(outputString);
    }
}
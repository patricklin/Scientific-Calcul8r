package com.example.patrick.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    EditText disp;
    int op1;
    int op2;
    String optr;
    String computation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        //clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);

        disp = (EditText) findViewById(R.id.display);

        try{
            one.setOnClickListener(this);

            two.setOnClickListener(this);

            three.setOnClickListener(this);

            four.setOnClickListener(this);

            five.setOnClickListener(this);

            six.setOnClickListener(this);

            seven.setOnClickListener(this);

            eight.setOnClickListener(this);

            nine.setOnClickListener(this);

            zero.setOnClickListener(this);

            //clear.setOnClickListener(this);

            add.setOnClickListener(this);

            sub.setOnClickListener(this);

            mul.setOnClickListener(this);

            div.setOnClickListener(this);

            equal.setOnClickListener(this);
        }
        catch(Exception e){

        }
    }
    /*public void operation(){
        if(optr.equals("+")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 + op2;
            disp.setText("Result : " + Integer.toString(op1));

        }
        else if(optr.equals("-")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 - op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
        else if(optr.equals("*")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 * op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
        if(optr.equals("/")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 / op2;
            disp.setText("Result : " + Integer.toString(op1));
    }*/
    @Override
    public void onClick(View v) {
        Editable str =  disp.getText();
        Button b = (Button) v;
        if(v.getId() == R.id.equal) {
            //do some shit
        } else if(v.getId() == R.id.clear) {
            disp.setText("");
        }else {
            str.append(b.getText().toString());
            disp.setText(str);
        }
    }
}
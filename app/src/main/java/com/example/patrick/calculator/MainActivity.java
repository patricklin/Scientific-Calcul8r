package com.example.patrick.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.patrick.calculator.R;

public class MainActivity extends Activity implements View.OnClickListener {

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
        Editable str = disp.getText();
        Button b = (Button) v;
        int id = v.getId();

        switch (id) {
            case R.id.equal:
                //run parser
                break;
            case R.id.clear:
                //disp.setText("");
                str.clear();
                break;
            case R.id.back:
                if (str.length() != 0) {
                    String s = str.toString();
                    s = s.substring(0, s.length()-1);
                    str = Editable.Factory.getInstance().newEditable(s);
                    break;
                }
            case R.id.power:
                str.append('^');
                break;
            case R.id.ee:
                str.append('E');
                break;
            case R.id.negative:
                str.append('-');
                break;
            case R.id.root:
                str.append("sqrt(");
                break;
            case R.id.sin:
            case R.id.cos:
            case R.id.tan:
            case R.id.asin:
            case R.id.acos:
            case R.id.atan:
            case R.id.ln:
                str.append(b.getText().toString());
                str.append('(');
                break;
            default:
                str.append(b.getText().toString());
                //disp.setText(str);
        }
        disp.setText(str);
    }
}
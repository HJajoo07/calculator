package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,signed,backspace,equal,dot,multiply,add,sub,divide;
    EditText screen;
    float value1,value2;
    boolean addition,subtraction,multipliction,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.screen);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        signed=findViewById(R.id.signed);
        backspace=findViewById(R.id.backspace);
        equal=findViewById(R.id.equal);
        dot=findViewById(R.id.dot);
        multiply=findViewById(R.id.multiply);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        divide=findViewById(R.id.divide);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"1");
            }
        });
             two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    screen.setText(screen.getText()+"2");

                }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"4");

            }
        });
       five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"0");

            }
        });
       dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+".");
            }
        });
        signed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"-");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null)
                { screen.setText("");}
                else
                {value1=Float.parseFloat(screen.getText()+"");
                    addition=true;
                    screen.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null)
                { screen.setText("");}
                else
                {value1=Float.parseFloat(screen.getText()+"");
                    subtraction=true;
                    screen.setText(null);
                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null)
                { screen.setText("");}
                else
                {value1=Float.parseFloat(screen.getText()+"");
                    multipliction=true;
                    screen.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null)
                { screen.setText("");}
                else
                {value1=Float.parseFloat(screen.getText()+"");
                    division=true;
                    screen.setText(null);
                }

            }

        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addition==true)
                {
                    value2=Float.parseFloat(screen.getText()+"");
                    screen.setText(value1+value2+"");
                    addition=false;
                }
                if (subtraction==true)
                {
                    value2=Float.parseFloat(screen.getText()+"");
                    screen.setText(value1-value2+"");
                    subtraction=false;
                }
                if (multipliction==true)
                {
                    value2=Float.parseFloat(screen.getText()+"");
                    screen.setText(value1*value2+"");
                    multipliction=false;
                }
                if (division==true)
                {
                    value2=Float.parseFloat(screen.getText()+"");
                    screen.setText(value1/value2+"");
                    division=false;
                }


            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(null);
            }
        });

    }

}
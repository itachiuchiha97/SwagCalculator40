package com.maineybnaya.swagcalculator40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i;

    Double var1;
    Double var2;
    Double mul; //1
    Double add; //2
    Double sub; //3
    Double div; //4

    String MPlus;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Button btnDel;
    Button btnDot;

    Button btnMC;
    Button btnMPlus;
    Button btnMR;
    Button btnClear;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;

    Button btnEqual;

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnDot = findViewById(R.id.btnDot);
        btnDel = findViewById(R.id.btnDel);

        btnMC = findViewById(R.id.btnMC);
        btnMPlus = findViewById(R.id.btnMPlus);
        btnMR = findViewById(R.id.btnMR);

        btnClear = findViewById(R.id.btnClear);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnEqual = findViewById(R.id.btnEqual);


        tv1 = findViewById(R.id.tv1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "9");
            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tv1.setText(tv1.getText() + ".");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.valueOf(tv1.getText().toString());
                tv1.setText("");
                i = 1;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.valueOf(tv1.getText().toString());
                tv1.setText("");
                i = 2; //ADD
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.valueOf(tv1.getText().toString());
                tv1.setText("");
                i = 3;
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.valueOf(tv1.getText().toString());
                tv1.setText("");
                i = 4;
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                MPlus = "";
            }
        });

        btnMPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MPlus = (String) tv1.getText();
                tv1.setText("");
            }
        });

        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(MPlus);
            }
        });

        btnMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MPlus = "";
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var2 = Double.valueOf(tv1.getText().toString());

                if (i == 1) {
                    mul = var1 * var2;
                    tv1.setText(mul.toString());
                }

                if (i == 2) {
                    add = var1 + var2;
                    tv1.setText(add.toString());
                }

                if (i == 3) {
                    sub = var1 - var2;
                    tv1.setText(sub.toString());
                }

                if (i == 4) {
                    div = var1 / var2;
                    if (var2 == 0) {
                        tv1.setText("Chutiyaaa :|");
                    } else {
                        tv1.setText(div.toString());
                    }
                }

                if (i == 0) {
                    tv1.setText("Invalid Expression!");
                }


            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().subSequence(0, tv1.getText().length() - 1));
            }
        });


    }
}

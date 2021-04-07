package com.whatevervalue.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Definim variabilele
     TextView txtRezult;


    //Definim Butoanele
        //Prima linie
     Button btnClear,btnParanteze,btnProcent,btnImpartit;
        //A doua linie
     Button btn7,btn8,btn9,btnInmultit;
        //A trei linie
     Button btn4,btn5,btn6,btnScadere;
        //A patra linie
     Button btn1,btn2,btn3,btnAdunare;
        //A cinci a linie
     Button btnSemn,btn0,btnPunct,btnEgal;

     boolean procent,impartire,inmultire,scadere,adunare;

    float val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtRezult= findViewById(R.id.txtResultat);


        //Butoane numerice

        btn0= findViewById(R.id.btn0);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);

        //Butoane Operatii

        btnClear= findViewById(R.id.btnClear);
        btnParanteze= findViewById(R.id.btnParanteze);
        btnProcent= findViewById(R.id.btnProcent);
        btnImpartit= findViewById(R.id.btnImpartit);
        btnInmultit= findViewById(R.id.btnInmultit);
        btnScadere= findViewById(R.id.btnScadere);
        btnAdunare= findViewById(R.id.btnAdunare);
        btnSemn= findViewById(R.id.btnSemn);
        btnEgal= findViewById(R.id.btnEgal);
        btnPunct= findViewById(R.id.btnPunct);


        //Crearea de actiuni pentru fiecare buton
                //Apesi butonul si iti arata valoarea

        btn0.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                txtRezult.setText(txtRezult.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"9");
            }
        });



        //Crearea Actiunii pentru Butoanele fara operatii

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtRezult.setText("");
            }
        });
        btnParanteze.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtRezult.setText(txtRezult.getText()+"()");
            }
        });
        btnPunct.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                txtRezult.setText(txtRezult.getText()+".");
            }
        });
        btnSemn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                txtRezult.setText(txtRezult.getText()+"-");
            }
        });

        //Creare Actiuni pentru Operatii

        btnAdunare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtRezult==null)
                {
                    txtRezult.setText("");
                }else {
                    val1=Float.parseFloat(txtRezult.getText()+"");

                        adunare=true;
                        txtRezult.setText(null);
                }
            }
        });
        btnScadere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(txtRezult.getText()+"");
                scadere=true;
                txtRezult.setText(null);

            }
        });
        btnInmultit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(txtRezult.getText()+"");
                inmultire=true;
                txtRezult.setText(null);
            }
        });
        btnImpartit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(txtRezult.getText()+"");
                impartire=true;
                txtRezult.setText(null);
            }
        });
        btnProcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(txtRezult.getText()+"");
                procent=true;
                txtRezult.setText(null);
            }
        });

        btnEgal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(txtRezult.getText()+"");
                if(adunare)
                {
                    txtRezult.setText(val1+val2+"");
                    adunare=false;
                }
                if(scadere)
                {
                    txtRezult.setText(val1-val2+"");
                    scadere=false;
                }
                if(inmultire)
                {
                    txtRezult.setText(val1*val2+"");
                    inmultire=false;
                }
                if(impartire)
                {
                    txtRezult.setText(val1/val2+"");
                    impartire=false;
                }
                if(procent)
                {
                    float c=val2/100;
                    txtRezult.setText(val1*c+"");
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
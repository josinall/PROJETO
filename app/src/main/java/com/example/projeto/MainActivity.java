package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView va1;      // declaro AS variáeis
    TextView va2;
    TextView A1;
    TextView A2;
    EditText dig1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A1 = (TextView) findViewById(R.id.A1);      // instancio
        A2 = (TextView) findViewById(R.id.A2);
        va1 = findViewById(R.id.va1);
        va2 = findViewById(R.id.va2);
        dig1 = findViewById(R.id.dig1);
        button2 = findViewById(R.id.button2);
        //dig1.requestFocus();

        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {

                try {
                    int x1 = Integer.parseInt(dig1.getText().toString());  //transforma em inteiro
                    int x2 = Integer.parseInt(dig1.getText().toString());
                    int z1 = 5-2;
                    int z2 = 6-2;

                    if(x1 == z1){
                        Toast.makeText(getBaseContext(), "Você Acertou",Toast.LENGTH_LONG).show();
                        //A1.setText("3");
                        va1.setText("5 - 2   3");
                        dig1.requestFocus();

                    }
                    else {
                        Toast.makeText(getBaseContext(), "Você Errou",Toast.LENGTH_LONG).show();
                        A1.setText("");
                        //dig1.requestFocus();
                    }
                    if(x2 == z2){
                        Toast.makeText(getBaseContext(), "Você Acertou",Toast.LENGTH_LONG).show();
                        A2.setText("4");
                        A1.setText("3");
                        va2.setText("6 - 2    4");
                        dig1.requestFocus();

                    }


                    else {
                        Toast.makeText(getBaseContext(), "Você Errou",Toast.LENGTH_LONG).show();
                        A2.setText("");
                        dig1.requestFocus();
                    }



                } catch (Exception e) {
                    dig1.setError("Não deixe em Branco!");
                    //dig1.requestFocus();
                }

            }
        });

    }

}
package com.example.opilane.kalkulaator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText opr1, opr2;
    private Button lahuta,liida,jaga,korruta,kustuta;
    private TextView tulemus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1=(EditText) findViewById(R.id.editOp1);
        opr2=(EditText) findViewById(R.id.editOp2);
        lahuta=(Button) findViewById(R.id.lahuta);
        liida=(Button) findViewById(R.id.liida);
        korruta=(Button) findViewById(R.id.korruta);
        jaga=(Button) findViewById(R.id.jagan);
        tulemus=(Button) findViewById(R.id.tulemus);

        liida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length() > 0)&&(opr2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double tulem = oper1 + oper2;
                    tulemus.setText(Double.toString(tulem));
                }
                else{
                    Toast toast = Toast.makeText(context:MainActivity.this,
                            text:"sisesta vajalik number", toast.LENGTH_LONG);

                    toast.show();
                }
            }
        });
        kustuta.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) {

                opr1.setText('');
                opr2.setText('');
                tulemus.setText('0.00');
                opr1.requestFocus();
            }
        });

    }
}

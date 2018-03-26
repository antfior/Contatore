package com.example.antfi.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //View del layout

    private TextView  vMessaggio;
    private Button    vAggiungi;
    private Button    vDiminuisci;
    private int       contatore = 0;
    private Button    vReset;
    private CheckBox  vRaddoppio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imposto riferimenti layout
        vMessaggio = findViewById(R.id.textMessage);
        vAggiungi = findViewById(R.id.BtnAdd);
        vDiminuisci = findViewById(R.id.BtnMinus);
        vReset = findViewById(R.id.btnAzzera);
        vRaddoppio = findViewById(R.id.chkRaddoppia);

        //imposto azioni dei pulsanti
        vAggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                if (vRaddoppio.isChecked())
                    ++contatore;
                visualizzaMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
                if (vRaddoppio.isChecked())
                    --contatore;
                visualizzaMessaggio();
            }
        });
        vReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatore = 0;
                visualizzaMessaggio();
            }
        });

    }

    /**
     * funzione che visualizza il valore del contatore.
     */
    private void visualizzaMessaggio () {
        vMessaggio.setText(getString(R.string.valore)+  contatore);
    }
}

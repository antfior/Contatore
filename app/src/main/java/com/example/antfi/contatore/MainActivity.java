package com.example.antfi.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //View del layout

    private TextView  vMessaggio;
    private Button    vAggiungi;
    private Button    vDiminuisci;
    private int       contatore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imposto riferimenti layout
        vMessaggio = findViewById(R.id.textMessage);
        vAggiungi = findViewById(R.id.BtnAdd);
        vDiminuisci = findViewById(R.id.BtnMinus);

        //imposto azioni dei pulsanti
        vAggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                visualizzaMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
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

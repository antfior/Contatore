package com.example.antfi.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //View del layout

    private TextView  vMessaggio;
    private Button    vAggiungi;
    private Button    vDiminuisci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vMessaggio = findViewById(R.id.textMessage);
        vAggiungi = findViewById(R.id.BtnAdd);
        vDiminuisci = findViewById(R.id.BtnMinus);
    }
}

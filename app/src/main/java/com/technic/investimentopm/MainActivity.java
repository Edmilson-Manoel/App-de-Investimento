package com.technic.investimentopm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor, edtMensal, edtTempo, edtTaxa, edtResultado;
    private Button btnCalcular;

    private double valor, mensal, tempo, taxa, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtValor);
        edtMensal = findViewById(R.id.edtMensal);
        edtTempo = findViewById(R.id.edtTempo);
        edtTaxa = findViewById(R.id.edtTaxa);
        edtResultado = findViewById(R.id.edtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            valor  = Double.parseDouble(edtValor.getText().toString());
            mensal = Double.parseDouble(edtMensal.getText().toString());
            tempo  = Double.parseDouble(edtTempo.getText().toString());
            taxa   = Double.parseDouble(edtTaxa.getText().toString());
            resultado = valor +((mensal*tempo)/((mensal*taxa)));
            edtResultado.setText(String.valueOf(resultado));
            }
        });{

        };
    }
}
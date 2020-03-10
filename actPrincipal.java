package com.example.calcularidade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actPrincipal extends AppCompatActivity {
    // variaveis
    EditText edtAnoNasc, edtAnoAtual,edtIdade;
    Button btnCalcular, btnEncerra;
    TextView txtResultado;

    //metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_principal);
        edtAnoNasc = findViewById(R.id.edtAnoNasc);
        edtAnoAtual = findViewById(R.id.edtAnoAtual);
        edtIdade = findViewById(R.id.edtIdade);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularIdade (View v) {
        int idade=0,anoAtual=0,anoNascimento=0;

        anoAtual = Integer.parseInt(edtAnoAtual.getText().toString());
        anoNascimento = Integer.parseInt(edtAnoNasc.getText().toString());

        idade = anoAtual - anoNascimento;

        edtIdade.setText(String.valueOf(idade));

        if (idade >= 18 ) {
            txtResultado.setText("Maior de idade");
        } else {
            txtResultado.setText("Menor de idade");
        }

    }

    public void Sair (View v) {
        System.exit(0);

    }
    public void Limpar (View v) {
        txtResultado.setText(null);
        edtAnoAtual.setText(null);
        edtAnoNasc.setText(null);
        edtIdade.setText(null);
        edtAnoNasc.requestFocus();

    }
 }

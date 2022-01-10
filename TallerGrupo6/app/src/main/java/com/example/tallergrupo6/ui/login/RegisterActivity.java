package com.example.tallergrupo6.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private Spinner edad;
    private Button borrar, cancelar, registrarNew;
    private EditText nombre, apellido, telefono, email, passwordR;
    private RadioButton fem, mas;
    private TextView messageR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        edad = (Spinner) findViewById(R.id.edad);
        telefono = (EditText) findViewById(R.id.telefono);
        email = (EditText) findViewById(R.id.email);
        passwordR = (EditText) findViewById(R.id.passwordR);

        fem = (RadioButton) findViewById(R.id.fem);
        mas = (RadioButton) findViewById(R.id.mas);

        messageR = (TextView) findViewById((R.id.messageR));

        borrar = (Button) findViewById(R.id.borrar);
        registrarNew = (Button) findViewById(R.id.registrarRegister);
        cancelar = (Button) findViewById(R.id.cancelar);

        String [] respuestas = {"18","20","21","22","23","24","25","26","27"};
        ArrayAdapter <String> adapter = new  ArrayAdapter <String>(this, android.R.layout.simple_spinner_item, respuestas);
        edad.setAdapter(adapter);

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(pantallaLogin);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");
                apellido.setText("");
                edad.setSelected(false);
                telefono.setText("");
                email.setText("");
                passwordR.setText("");
                fem.setChecked(false);
                mas.setChecked(false);
            }
        });

        registrarNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageR.setText("Sus datos se han registrado correctamente");
                messageR.setVisibility(View.VISIBLE);
            }
        });
    }

    public void mostrarEdad (View v){
        edad.setSelection(edad.getSelectedItemPosition());
    }
}
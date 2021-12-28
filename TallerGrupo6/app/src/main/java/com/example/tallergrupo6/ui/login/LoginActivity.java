package com.example.tallergrupo6.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    private EditText user, password;
    private Button inicio, salir;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        inicio = (Button) findViewById(R.id.inicio);
        salir = (Button) findViewById(R.id.salir);
        message = (TextView) findViewById((R.id.message));
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    final String username = user.getText().toString().toUpperCase();
                    final String pass = password.getText().toString();
                    if (username.equals("GRUPO6") && pass.equals("123456")){
                        message.setText("Datos Correctos...");
                    }
                    else{
                        message.setText("Datos Incorrectos...");
                    }


                }catch (Exception e){
                    message.setText("Ingrese todos los datos...");
                }

            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}

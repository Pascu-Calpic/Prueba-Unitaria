package com.example.pruebasunitarias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText correoelectronico, contraseña;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }
    private void setViews() {
        correoelectronico = findViewById(R.id.correoelectronico);
        contraseña = findViewById(R.id.contraseña);
        check = findViewById(R.id.check);
        check.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == check) {
            Log.e("Testear", correoelectronico.getText().toString());
            Log.e("Testear", contraseña.getText().toString());

            if (validateUse(correoelectronico.getText().toString(), contraseña.getText().toString())) {
                Toast.makeText(this, "Testeo correcto", Toast.LENGTH_SHORT).show();
            } else {
                Log.e("Testear", "No se pudo validar");
            }
        }
    }
    public boolean validateUse(String email, String password) {
        if (Validar.validateEmpty(email) || Validar.validateEmpty(password)) {
            Toast.makeText(this, "No se pudo validar el empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!Validar.validateEmail(email)) {
            Toast.makeText(this, "No se pudo validar el correo electrónico", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!Validar.validateUser(email, password)) {
            Toast.makeText(this, "No se pudo validar la contraseña", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
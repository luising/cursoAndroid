package com.example.alber.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn =  findViewById(R.id.idBtn);
    }

    public void btnClick(View v){
        Toast.makeText(this,"Se a preccionado el boton",Toast.LENGTH_SHORT).show();
    }
}

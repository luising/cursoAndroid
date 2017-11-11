package com.example.alber.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        textView = findViewById(R.id.idtxt);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                String myvar = textView.getText().toString();
                Toast.makeText(getApplicationContext(),myvar, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

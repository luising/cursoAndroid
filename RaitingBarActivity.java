package com.example.alber.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RaitingBarActivity extends AppCompatActivity {

    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting_bar);

        btn =  findViewById(R.id.button);
        ratingBar =  findViewById(R.id.idratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                float ratingvalue = ratingBar.getRating();
                Toast.makeText(getApplicationContext(),"Rating is " +ratingvalue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

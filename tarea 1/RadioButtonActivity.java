package com.example.alber.ejercicios;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class RadioButtonActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup =  findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton1Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;

                    case R.id.radioButton2Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;

                    case R.id.radioButton3Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        break;
                    case R.id.radioButton4Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
                        break;
                }
            }
        });
    }
}

package com.example.alber.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        aSwitch =  findViewById(R.id.idSwitch);
    }

    public void onSwitchClick(View v)
    {
        if(aSwitch.isChecked())
        {
            Toast.makeText(this,"Toggle ON",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Toggle OFF",Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.alber.ejercicios;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends AppCompatActivity {
    Button btn; CheckBox checkBox1,checkBox2,checkBox3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        setControls();
        setEvents();


    }

    //region Controls
    private void setControls()
    {
        btn = findViewById(R.id.button);
        checkBox1 =  findViewById(R.id.checkBox1);
        checkBox2 =  findViewById(R.id.checkBox2);
        checkBox3 =  findViewById(R.id.checkBox3);
    }

    private void setEvents()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickMe(view);
            }
        });
    }
    //endregion
    public void ClickMe(View v)
    {
        if (checkBox1.isChecked() &&checkBox2.isChecked() && checkBox3.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        else if (checkBox1.isChecked() && checkBox2.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        }
        else if (checkBox1.isChecked() && checkBox3.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }
        else if (checkBox2.isChecked() && checkBox3.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }
        else if (checkBox1.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        }
        else if (checkBox2.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        }
        else if (checkBox3.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }
        else
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#000000"));
        }

    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//
}

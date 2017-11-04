package com.example.alber.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.Sp_Ejercicios);
        btn = findViewById(R.id.btn_Acept);
        String [] options = {"AutoComplete", "Button", "Checkbox", "EditText", "multiComplete", "progressBar",
                             "RadioButtonActivity", "SeekBar", "Spinner", "Switch", "TextViewActivity", "toggleButton"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,options);
        spinner.setAdapter(adapter);

    }

    public void btnClick(View v){
        goActivity(spinner.getSelectedItem().toString());
    }

    private void goActivity(String Option)
    {
        switch (Option)
        {
            case "Spinner":
                startActivity(new Intent(getApplicationContext(), SpinnerActivity.class));
                break;
            case "Button":
                startActivity(new Intent(getApplicationContext(), ButtonActivity.class));
                break;
            case "AutoComplete":
                startActivity(new Intent(getApplicationContext(), AutoCompleteActivity.class));
                break;
            case "Checkbox":
                startActivity(new Intent(getApplicationContext(), CheckBoxActivity.class));
                break;
            case "EditText":
                startActivity(new Intent(getApplicationContext(), EditTextActivity.class));
                break;
            case "multiComplete":
                startActivity(new Intent(getApplicationContext(), MautoCompleteActivity.class));
                break;
            case "progressBar":
                startActivity(new Intent(getApplicationContext(), ProgressBarActivity.class));
                break;
            case "RadioButtonActivity":
                startActivity(new Intent(getApplicationContext(), RadioButtonActivity.class));
                break;
            case "SeekBar":
                startActivity(new Intent(getApplicationContext(), SeekbarActivity.class));
                break;
            case "Switch":
                startActivity(new Intent(getApplicationContext(), SwitchActivity.class));
                break;
            case "TextViewActivity":
                startActivity(new Intent(getApplicationContext(), TextViewActivity.class));
                break;
            case "toggleButton":
                startActivity(new Intent(getApplicationContext(), toggleButtonActivity.class));
                break;
        }
    }
}

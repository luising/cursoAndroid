package com.example.alber.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MautoCompleteActivity extends AppCompatActivity {
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mauto_complete);

        String [] texts={"Arjun","Ankit","Anuradha","Amreen","Abhishek",
                "Arvind","Amit","Bharat","Chaitanya", "Chitra","Darshan","" +
                "Darsheel","Deven","Faizal","Fayyaz","Ganesh","Girish",
                "Heena","Hemant","Irfan","Jagdish","Jeel", "Kaushik","Kapil",
                "Keshav","Manish","Mayuri","Manali","Nikita","Pramod","Pratik",
                "Puja","Ravi","Raj","Reshma"};

        multiAutoCompleteTextView =  findViewById(R.id.idAutoCompTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,texts);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}

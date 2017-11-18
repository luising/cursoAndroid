package mx.fime.fsw.tareados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

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
        String [] options = {"ImageButton", "ImageView", "VideoView"};
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
            case "ImageButton":
                startActivity(new Intent(getApplicationContext(), ImageButtonActivity.class));
                break;
            case "ImageView":
                startActivity(new Intent(getApplicationContext(), ImageViewActivity.class));
                break;
            case "VideoView":
                startActivity(new Intent(getApplicationContext(), VideoViewActivity.class));
                break;
        }
    }
}

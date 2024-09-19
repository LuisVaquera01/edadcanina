package com.example.edadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.age_id);
        TextView resulttexto = findViewById(R.id.text_result);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadedit.getText().toString();
                if (!edad.isEmpty()){
                    String edad = edadedit.getText().toString();
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadostring= "La edad de tu dog es: " +resultado + " años";
                    resulttexto.setText(resultadostring);
                }else {
                    Toast.makeText(MainActivity.this,"se debe calcular una edad", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
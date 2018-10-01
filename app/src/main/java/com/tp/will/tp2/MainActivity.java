package com.tp.will.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textAns ;
    private Button btnMaths ;
    private Button btnFrancais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAns = findViewById(R.id.edtYourName);
        btnMaths = findViewById(R.id.btnMaths);
        btnFrancais = findViewById(R.id.btnFrancais);

    }

    @Override
    protected void onStart() {
        super.onStart();

        btnFrancais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiplyActivity.Launch(MainActivity.this,textAns.getText().toString());
            }
        });
    }

    public void btnMathsClicked(View view){
        MultiplyActivity.Launch(this,textAns.getText().toString());
    }
}

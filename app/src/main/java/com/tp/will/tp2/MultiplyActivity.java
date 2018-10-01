package com.tp.will.tp2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MultiplyActivity extends AppCompatActivity {
    public static final String USERNAME_EXTRA = "username";
    public TextView txtView;
    private TextView lblQuest ;
    private EditText edtAnswer ;
    private int nbA;
    private int nbB;

    public static void Launch(Context context, String name){
        Intent intent = new Intent(context, MultiplyActivity.class);
        intent.putExtra(USERNAME_EXTRA, name);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);

        Intent intent = getIntent();
        txtView = findViewById(R.id.lblSaisTu);
        lblQuest = findViewById(R.id.lblQst);
        edtAnswer = findViewById(R.id.edtAnswer);


        if (intent.hasExtra(USERNAME_EXTRA)){
            txtView.setText(getResources().getString(R.string.sais_tu_multiplier, intent.getStringExtra(USERNAME_EXTRA)));
        }

        nbA = (int) (Math.random() * 10);
        nbB = (int) (Math.random() * 10);

        lblQuest.setText((nbA + " * " + nbB));

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void btnVerifyClicked(View view){
        if(nbA*nbB != Integer.parseInt(edtAnswer.getText().toString())){
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "SUCCESS", Toast.LENGTH_SHORT).show();
        }
    }
}

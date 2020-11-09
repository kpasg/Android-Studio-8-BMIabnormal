package com.example.a008;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void compute(View v){

        EditText ht = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText wt = (EditText)findViewById(R.id.editTextTextPersonName2);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("Ht", ht.getText().toString());
        bundle.putString("Wt", wt.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
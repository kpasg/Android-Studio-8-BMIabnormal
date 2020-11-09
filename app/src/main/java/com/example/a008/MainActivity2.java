package com.example.a008;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bmi_Answer();
    }
    public void back(View v)
    {
        finish();
    }
    private void bmi_Answer()
    {

        double h;
        double w;
        double bmi ;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            DecimalFormat nf = new DecimalFormat("0.00");
            h = Double.parseDouble(bundle.getString("Ht")) / 100;
            w = Double.parseDouble(bundle.getString("Wt"));

            bmi = w / (h * h);

            TextView bmit = (TextView)findViewById(R.id.textView7);
            bmit.setText(nf.format(bmi));
            TextView a = (TextView)findViewById(R.id.textView8);

            if (bmi < 18){
                a.setText("體重過輕");
            }
            else if (bmi > 24){
                a.setText("體重過重");
            }
            else
                a.setText("體重正常");
        }
    }

}
package com.example.yannjaffrennou.conteur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Attributs
    private Button btnMin;
    private Button btnPlus;
    private TextView TextCpt;
    private BtnHandler BtnHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Components
        this.btnMin = (Button)findViewById(R.id.button);
        this.btnPlus = (Button)findViewById(R.id.button2);
        this.TextCpt = (TextView)findViewById(R.id.textView);

        //Events
        this.BtnHandler = new BtnHandler(this);
        this.btnMin.setOnClickListener(BtnHandler);
        this.btnPlus.setOnClickListener(BtnHandler);


    }

    public void PlusCpt () {
        String TexteDuCompteur = (String) this.TextCpt.getText();
        int nb = Integer.parseInt(TexteDuCompteur);
        nb++;
        this.TextCpt.setText(""+nb);
    }

    public void MinCpt () {
        String TexteDuCompteur = (String) this.TextCpt.getText();
        int nb = Integer.parseInt(TexteDuCompteur);
        nb-=1;
        this.TextCpt.setText(""+nb);
    }

    public boolean TestId (double Id) {
        if (Id == this.btnMin.getId()) {
            return true;
        }
        else {
            return false;
        }
    }

}

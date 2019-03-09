package com.example.yannjaffrennou.conteur;

import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * Created by yannjaffrennou on 26/11/2016.
 */

public class BtnHandler implements View.OnClickListener {

    //Attributs
    private MainActivity activity;

    public BtnHandler (MainActivity activity) {

        this.activity = activity;
    }

    public void onClick (View view) {
        System.out.println(view.getId());

        if (this.activity.TestId(view.getId())) {
            this.activity.MinCpt();
        }
        else {
            this.activity.PlusCpt();
        }
    }

}

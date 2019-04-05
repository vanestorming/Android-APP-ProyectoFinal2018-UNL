package com.example.vanesa.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class feedback_vr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_vr);
    }

    public void gotoAtrasFeedback (View view){
        Intent intent = new Intent(this, vr_ok.class);
        startActivity(intent);
    }

    public void gotoSalir (View v) {
        moveTaskToBack(true);
        android.os.Process.killProcess (android.os.Process.myPid());
        System.exit(1);

    }
}

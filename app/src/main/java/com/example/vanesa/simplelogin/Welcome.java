package com.example.vanesa.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void gotoVR (View view) {
        Intent intent = new Intent(this, vr_ok.class);
        startActivity(intent);
    }

    public void gotoPlano (View view) {
        Intent intent = new Intent(this, plano_ok.class);
        startActivity(intent);
    }

    public void gotoSalir (View v) {
        moveTaskToBack(true);
        android.os.Process.killProcess (android.os.Process.myPid());
        System.exit(1);

    }

}

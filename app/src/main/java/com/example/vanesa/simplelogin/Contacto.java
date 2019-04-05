package com.example.vanesa.simplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

public void gotoSalir (View v) {
   moveTaskToBack(true);
   android.os.Process.killProcess (android.os.Process.myPid());
   System.exit(1);

}






}

package com.example.vanesa.simplelogin;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class vr_ok extends AppCompatActivity {

    public void openvr (View view) {
        Intent openVRapp = getPackageManager().getLaunchIntentForPackage("com.unl.vanesa");
        startActivity (openVRapp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr_ok);
    }

    public void gotoAtrasVR (View view){
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);
    }

    public void gotoAtrasFeedbackVR (View view){
        Intent intent = new Intent(this, feedback_vr.class);
        startActivity(intent);
    }
}



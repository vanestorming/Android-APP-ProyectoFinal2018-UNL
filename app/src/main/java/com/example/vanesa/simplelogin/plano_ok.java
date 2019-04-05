package com.example.vanesa.simplelogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

import java.net.URL;

public class plano_ok extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano_ok);

    pdfView = findViewById(R.id.pdfView);
    pdfView.fromAsset("plano_ok_pdf.pdf")
            .load();
    }

    public void gotoAtras (View view){
            Intent intent = new Intent(this, Welcome.class);
            startActivity(intent);
        }

        public void DownloadPDF (View view) {
            Intent download = new Intent(Intent.ACTION_VIEW);
            String url = "https://app.box.com/s/zu54fqykimz66uye8dvtdwlsnv0kainr";
            download.setData(Uri.parse(url));
            startActivity(download);
        }

    public void gotoAtrasFeedbackPlano (View view){
        Intent intent = new Intent(this, activity_feedback_plano.class);
        startActivity(intent);
    }

    }





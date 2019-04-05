package com.example.vanesa.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private TextView attempt;
    private int count = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        attempt.setText("Numero:3");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Username.getText().toString();
                String password = Password.getText().toString();
                valid(name, password);
            }
        });
    }

    public void gotoContacto (View view) {
        Intent intent = new Intent(this, Contacto.class);
        startActivity(intent);
    }

    private void setViews ()
    {
        Username = (EditText) findViewById(R.id.ed_Name);
        Password = (EditText) findViewById(R.id.ed_Pass);
        Login = (Button) findViewById(R.id.btn_Login);
        attempt = (TextView) findViewById(R.id.textView);
    }

    private void valid (String Username, String Password) {
        if ((Username.equals("admin")) && (Password.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);

    } else {
            count--;
            attempt.setText("Numero de intentos:" + String.valueOf(count));
            if (count == 0) {
                Login.setEnabled(false);
            }
        }
    }
}

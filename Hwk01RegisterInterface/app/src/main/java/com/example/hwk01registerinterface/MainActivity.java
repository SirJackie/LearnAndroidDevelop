package com.example.hwk01registerinterface;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void buttonCallback(View view){
        TextView tvFirstName = findViewById(R.id.textView_firstName);
        TextView tvLastName = findViewById(R.id.textView_lastName);
        TextView tvEmail = findViewById(R.id.textView_email);

        EditText etFirstName = findViewById(R.id.editText_firstName);
        EditText etLastName = findViewById(R.id.editText_lastName);
        EditText etEmail = findViewById(R.id.editText_email);

        tvFirstName.setText("First Name: " + etFirstName.getText().toString());
        tvLastName.setText("Last Name: " + etLastName.getText().toString());
        tvEmail.setText("Email: " + etEmail.getText().toString());
    }
}
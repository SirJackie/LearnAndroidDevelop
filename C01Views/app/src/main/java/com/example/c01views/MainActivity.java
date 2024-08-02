package com.example.c01views;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private ProgressBar progressBar;
    private EditText nameInput;
    private TextView tViewResult;

    private CheckBox cbHarry, cbMatrix, cbJoker;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSubmit = findViewById(R.id.btnSubmit);
        progressBar = findViewById(R.id.progressBar);
        nameInput = findViewById(R.id.nameInput);
        tViewResult = findViewById(R.id.tViewResult);

        cbHarry = findViewById(R.id.cbHarry);
        cbMatrix = findViewById(R.id.cbMatrix);
        cbJoker = findViewById(R.id.cbJoker);

        radioGroup = findViewById(R.id.radioGroup);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Information Submitted.", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);  // or View.VISIBLE

                String name = nameInput.getText().toString();
                if (name.equals("")){
                    name = "Not Inputted Yet.";
                }

                String movie = "Not Selected.";
                if (cbHarry.isChecked()) {
                    if (movie.equals("Not Selected.")){
                        movie = "Harry Potter";
                    } else {
                        movie += ", Harry Potter";
                    }
                }
                if (cbMatrix.isChecked()) {
                    if (movie.equals("Not Selected.")){
                        movie = "Matrix";
                    } else {
                        movie += ", Matrix";
                    }
                }
                if (cbJoker.isChecked()) {
                    if (movie.equals("Not Selected.")){
                        movie = "Joker";
                    } else {
                        movie += ", Joker";
                    }
                }

                String maritalState;
                int radioSelection = radioGroup.getCheckedRadioButtonId();
                if (radioSelection == R.id.rbMarried){
                    maritalState = "Married";
                } else if (radioSelection == R.id.rbSingle) {
                    maritalState = "Single";
                } else if (radioSelection == R.id.rbInRel){
                    maritalState = "In a Relationship";
                } else {
                    maritalState = "Not Selected.";
                }


                tViewResult.setText(
                        "Your Name: " + name +
                        "\n The Movies You Like: " + movie +
                        "\n Your Marital State: " + maritalState
                );
            }
        });
    }
}

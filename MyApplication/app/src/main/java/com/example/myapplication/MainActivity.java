package com.example.myapplication;

import android.os.Bundle;
import android.view.View;  // for View type in onBtnClick
import android.widget.TextView;  // TextView Support
import android.widget.EditText;  // EditText Support

import androidx.activity.EdgeToEdge;  // 全面屏支持
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // 全面屏支持
        setContentView(R.layout.activity_main);  // Relate to activity_main.xml
    }

    public void onBtnClick(View view){
        TextView txtOutput = findViewById(R.id.outputTextView);
        EditText txtEdit = findViewById(R.id.nameInput);

        // txtOutput.setText("Hello");
        txtOutput.setText(
                "Hello, Dear " + txtEdit.getText().toString() + "!"
        );
    }
}

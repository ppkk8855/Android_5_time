package com.example.time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Year;
    private EditText Month;
    private EditText Day;
    private EditText Hour;
    private EditText Minute;
    private EditText Second;
    private Button   btn1;
    private TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Year=findViewById(R.id.edt1);
        Month=findViewById(R.id.edt2);
        Day=findViewById(R.id.edt3);
        Hour=findViewById(R.id.edt4);
        Minute=findViewById(R.id.edt5);
        Second=findViewById(R.id.edt6);
        btn1=findViewById(R.id.bt1);
        Display=findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Year.getText().toString()+"/"+Month.getText().toString()+"/"+Day.getText().toString()+"      "+Hour.getText().toString()+":"+Minute.getText().toString()+":"+Second.getText().toString());
            }
        });


    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Message;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView;

    EditText etInput;

    Button bControl;
    int value;
    boolean game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textVie);
        etInput = (EditText)findViewById(R.id.editvalue);
        bControl = (Button)findViewById(R.id.editvalue_btn);
        bControl.setOnClickListener(this);


        value = (int)(Math.random()*100);
        game = false;

    }

    public void onClick(View view)
    {
        //textView.setText("Рабоает");
        int inp = Integer.parseInt(etInput.getText().toString());
        if (!game)
        {

            if (value < inp)
            {
                textView.setText("Перелёт");
            }
            if (value > inp)
            {
                textView.setText("Недолёт");
            }
            if (value == inp)
            {
                bControl.setText("Начать заного!");
                textView.setText("В точку!");
                game = true;
            }
        }
        else
        {
            int value = (int)(Math.random()*100);
            boolean game = false;
            bControl.setText("Ввести значение");
            textView.setText("Угадайте число от 1 до 100");
        }
    }
}
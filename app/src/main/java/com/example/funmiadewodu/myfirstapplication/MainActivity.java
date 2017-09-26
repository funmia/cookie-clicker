package com.example.funmiadewodu.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button increaseButton = (Button)findViewById(R.id.increase_button_id);
        final Button decreaseButton = (Button)findViewById(R.id.decrease_button_id);
        final TextView lblTotal = (TextView) findViewById(R.id.lblTotal);

        increaseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View) {
                currentScore ++;
                lblTotal.setText(String.valueOf(currentScore));
            }
        });

        decreaseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                currentScore --;
                lblTotal.setText(String.valueOf(currentScore));
            }
        });
    }
}

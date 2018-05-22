package com.example.seanitzel.bloop;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button[] btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer[] mp = {MediaPlayer.create(this,R.raw.harmony), MediaPlayer.create(this,R.raw.bunny), MediaPlayer.create(this,R.raw.lying) };
        final int[] BUTTON_IDS = {
                R.id.btn1,
                R.id.btn2,
                R.id.btn3,
                R.id.btn4,
                R.id.btn5,
                R.id.btn6,
                R.id.btn7,
                R.id.btn8,
                R.id.btn9,
                R.id.btn10,
                R.id.btn11,
                R.id.btn12,
                R.id.btn13,
                R.id.btn14,
                R.id.btn15,
        };

        final String[] BUTTON_LABELS = {
                "Hi",
                "Yes",
                "No",
                "What",
                "Stop",
                "Dont",
                "Sure",
                "WTF",
                "Shit",
                "Life",
                "Death",
                "One",
                "Die",
                "Love",
                "Now",
        };
        btns = new Button[15];
        for(int i=0;i<15;i++) {
            btns[i] = (Button) findViewById(BUTTON_IDS[i]);
            btns[i].setBackgroundColor(0xFFFF0000);
            btns[i].setText(BUTTON_LABELS[i]);
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp[0].start();
                }
            });
        }
    }
}

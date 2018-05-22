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

        btns = new Button[3];
        btns[0] = (Button) findViewById(R.id.btn1);
        btns[1] = (Button) findViewById(R.id.btn2);
        btns[2] = (Button) findViewById(R.id.btn3);
        btns[0].setBackgroundColor(0xFFFF0000);
        btns[0].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            mp[0].start();
        }
    });
        btns[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mp[1].start();
            }
        });
        btns[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mp[2].start();
            }
        });
    }
}

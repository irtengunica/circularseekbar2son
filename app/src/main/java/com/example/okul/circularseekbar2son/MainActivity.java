package com.example.okul.circularseekbar2son;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.okul.circularseekbar2son.CircularSeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final CircularSeekBar deneme=(CircularSeekBar) findViewById(R.id.circularSeekBar1);
       final TextView degeral=(TextView) findViewById(R.id.degeral);
        deneme.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                degeral.setText(Integer.toString(deneme.getProgress()));
                return false;
            }
        });

    }
}

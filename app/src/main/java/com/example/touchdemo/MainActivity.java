package com.example.touchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.child1_tv).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("sihai", "child1_tv ontouch=" + event.getActionMasked() + " ex=" + event.getX() + "  ey=" + event.getY());
                return true;
            }
        });

        findViewById(R.id.touch_view).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("sihai", "touch_view ontouch=" + event.getActionMasked() + " ex=" + event.getX() + "  ey=" + event.getY());
                return true;
            }
        });

        findViewById(R.id.child2_tv).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("sihai", "child2_tv ontouch=" + event.getActionMasked() + " ex=" + event.getX() + "  ey=" + event.getY());
                return true;
            }
        });

        findViewById(R.id.parent2_rl).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("sihai", "parent2_rl ontouch=" + event.getActionMasked() + " ex=" + event.getX() + "  ey=" + event.getY());
                return true;
            }
        });

        findViewById(R.id.parent2_child).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("sihai", "parent2_child ontouch=" + event.getActionMasked() + " ex=" + event.getX() + "  ey=" + event.getY());
                return true;
            }
        });
    }
}
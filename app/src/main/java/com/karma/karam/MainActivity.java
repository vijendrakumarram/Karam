package com.karma.karam;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler.postDelayed(new Runnable() {
            public void run() {
                TabbedActivity();
            }
        }, 5000);
    }
    private void TabbedActivity() {
        Intent intent = new Intent(MainActivity.this, Tabbed_Activity.class);
        startActivity(intent);
    }
}

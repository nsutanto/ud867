package com.udacity.nsutanto.androidjokelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeActivity extends AppCompatActivity {

    private TextView tv_joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        tv_joke = findViewById(R.id.tv_joke);
        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        tv_joke.setText(joke);
    }
}

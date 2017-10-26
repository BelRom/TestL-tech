package com.example.roman.testl_tech;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private static final String EXTRA_HEADER = "EXTRA_HEADER";
    private static final String EXTRA_TEXT = "EXTRA_TEXT";
    private TextView mTextViewHeader, mTextViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent i = getIntent();
        String mHeader = i.getStringExtra(EXTRA_HEADER);
        String mText = i.getStringExtra(EXTRA_TEXT);

        mTextViewHeader = (TextView) findViewById(R.id.textView);
        mTextViewHeader.setText(mHeader);

        mTextViewText = (TextView) findViewById(R.id.textView2);
        mTextViewText.setText(mText);


    }

}

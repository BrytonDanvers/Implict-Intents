package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mLocationEditText;
    private EditText mWebsiteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public EditText getmWebsiteEditText() {
        return mWebsiteEditText;
    }

    public void setmWebsiteEditText(EditText mWebsiteEditText) {
        mWebsiteEditText = (EditText) findViewById(R.id.website_edittext);
        this.mWebsiteEditText = mWebsiteEditText;
    }

    public EditText getmLocationEditText() {
        return mLocationEditText;
    }

    public void setmLocationEditText(EditText mLocationEditText) {
        mLocationEditText = (EditText) findViewById(R.id.location_edittext);
        this.mLocationEditText = mLocationEditText;
    }
}

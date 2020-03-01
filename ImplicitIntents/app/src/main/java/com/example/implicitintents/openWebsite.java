package com.example.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

public class openWebsite {

    public void openWebsite(View view) {

        String url = mWebsiteEditText.getText().toString();

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent., webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}

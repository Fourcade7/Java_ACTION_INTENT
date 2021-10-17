package com.pr7.java_actions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Mwahahahahahahaha");
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        String[] recipients = {"mailto@gmail.com", "pr@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject text here...");
        intent.putExtra(Intent.EXTRA_TEXT, "Body of the content here...");
        intent.setType("text/plain");
        intent.setPackage("com.google.android.gm");
        startActivity(Intent.createChooser(intent, "Send mail"));
    }

    public void button3(View view) {
        // Uri uri = Uri.parse("smsto:1234655677");
        Intent it = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:+998999554247"));
        it.putExtra("sms_body", "Here you can set the SMS text to be sentaxaxaxax");
        startActivity(it);
    }

    public void button4(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:999554247"));
        startActivity(intent);
    }

    public void button6(View view) {
        Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/Fourcade7"));
        final String appName = "org.telegram.messenger";
        telegram.setPackage(appName);
        startActivity(telegram);
    }


    public void button7(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/xxx");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
        likeIng.setPackage("com.instagram.android");
        try {
            startActivity(likeIng);
        } catch (
                ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/xxx")));
        }
    }
}
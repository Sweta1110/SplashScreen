package com.example.swedish_sweta.splashtest;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends Activity {
 TextView sptext;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout);
        sptext=(TextView) findViewById(R.id.textView);
    }
}
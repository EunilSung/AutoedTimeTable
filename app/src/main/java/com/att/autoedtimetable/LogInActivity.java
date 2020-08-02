package com.att.autoedtimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.login_bnt:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
        }
    }
}

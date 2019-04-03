package com.example.raxabizze.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public String firstBranch(String allBranch){
        String[] split = allBranch.split(",");
        return split[0];
    }

    public String lastBranch(String allBranch){
        String[] split = allBranch.split(",");
        return split[split.length - 1];
    }

    public String returnStringABC(){
        return "ABC";
    }
}

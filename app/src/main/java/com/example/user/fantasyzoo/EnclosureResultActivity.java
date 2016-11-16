package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class EnclosureResultActivity extends AppCompatActivity{

    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enclosure_result);

        mResultText = (TextView)findViewById(R.id.result_text);


        ZooData zooData = new ZooData();
         String contents = zooData.darkEnclosure.listCreatures();
        mResultText.setText(contents);

//
////
////        Intent intent = getIntent();
////        Bundle extras = intent.getExtras();
////        String result = extras.getString("result");
//
//        mResultText.setText(result);
    }

}


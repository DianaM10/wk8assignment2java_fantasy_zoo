package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class ZooResultActivity extends AppCompatActivity{

    Button darkEnclosureButton;
    Button submergableEnclosureButton;
    Button standardEnclosureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        darkEnclosureButton = (Button) findViewById(R.id.dark_button);
        submergableEnclosureButton = (Button) findViewById(R.id.sub_button);
        standardEnclosureButton = (Button) findViewById(R.id.stand_button);

        darkEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "dark enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
//                String result = game.playGame("Rock");
//                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

        submergableEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "submergable enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
//                String result = game.playGame("Paper");
//                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

        standardEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "standard enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
//                String result = game.playGame("Scissors");
//                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

    }
}

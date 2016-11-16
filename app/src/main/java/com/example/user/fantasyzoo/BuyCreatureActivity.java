package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 16/11/2016.
 */

public class BuyCreatureActivity extends AppCompatActivity {
    Button bladeButton;
    Button spikeButton;
    Button angelButton;
    Button edButton;
    Button kelpieButton;
    Button nessieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        bladeButton = (Button) findViewById(R.id.blade_button);
        spikeButton = (Button) findViewById(R.id.spike_button);
        angelButton = (Button) findViewById(R.id.angel_button);
        edButton = (Button) findViewById(R.id.ed_button);
        kelpieButton = (Button) findViewById(R.id.kelpie_button);
        nessieButton = (Button) findViewById(R.id.nessie_button);

        bladeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "blade clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.dayWalker);
                intent.putExtra("result", contents);

                startActivity(intent);
            }

        });

        spikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "spike clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.dayWalker);
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        angelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "angel clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.vampire2);
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });


        edButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "ed clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.zombie1);
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        kelpieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "kelpie clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.kelpie);
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        nessieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "nessie clicked");
                Intent intent = new Intent(BuyCreatureActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.sell(zooData.lochNessMonster);
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

    }
}

package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 15/11/2016.
 */

public class ZooResultActivity extends AppCompatActivity{

    Button darkEnclosureButton;
    Button submergableEnclosureButton;
    Button standardEnclosureButton;
    Button buyButton;
    Button rampageButton;
    Button cashInBankButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        darkEnclosureButton = (Button) findViewById(R.id.dark_button);
        submergableEnclosureButton = (Button) findViewById(R.id.sub_button);
        standardEnclosureButton = (Button) findViewById(R.id.stand_button);
        buyButton = (Button) findViewById(R.id.buy_button);
        rampageButton = (Button) findViewById(R.id.rampage_button);
        cashInBankButton = (Button) findViewById(R.id.cash_button);

        darkEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "dark enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.darkEnclosure.listCreatures();
                intent.putExtra("result", contents);

                startActivity(intent);
            }

        });

        submergableEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "submergable enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.waterEnclosure.listCreatures();
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        standardEnclosureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "standard enclosure clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.standardEnclosure.listCreatures();
                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "buy button clicked");
                Intent intent = new Intent(ZooResultActivity.this, BuyCreatureActivity.class);
//                ZooData zooData = new ZooData();
//                String contents = zooData.standardEnclosure.listCreatures();
//                intent.putExtra("result", contents);
                startActivity(intent);
            }

        });

        rampageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "rampage clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                String contents = zooData.zoo.rampage();
                intent.putExtra("result", contents);
                startActivity(intent);

            }

        });

        cashInBankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ZooResultActivity", "cash button clicked");
                Intent intent = new Intent(ZooResultActivity.this, EnclosureResultActivity.class);
                ZooData zooData = new ZooData();
                double contents = zooData.zoo.getCashInBank();
                intent.putExtra("result", Double.toString(contents));
                startActivity(intent);
            }

        });

    }
}

package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 15/11/2016.
 */

public class Zootopia extends AppCompatActivity {
    Button mEnterZooButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Zoo zoo = new Zoo();
        setContentView(R.layout.activity_main);
        mEnterZooButton = (Button) findViewById(R.id.zoo_button);


        mEnterZooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Zootopia", "Zoo clicked");
//                Intent intent = new Intent(Zootopia.this, ResultActivity.class);
//                String result = game.playGame("Rock");
//                intent.putExtra("result", result);
//                startActivity(intent);
//            }
//
//        });


            }


        });
    }
}
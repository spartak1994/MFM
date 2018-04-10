package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tournaments_rus extends AppCompatActivity implements View.OnClickListener{
    Button tournam_rus_champ_btn;
    Button tournam_rus_cup_btn;
    Button tournam_rus_sup_cup_btn;
    Button tournam_rus_back_btn;
    Button tournam_rus_home_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments_rus);

        tournam_rus_champ_btn = (Button)findViewById(R.id.tournam_rus_champ_btn);
        tournam_rus_cup_btn = (Button)findViewById(R.id.tournam_rus_cup_btn);
        tournam_rus_sup_cup_btn = (Button)findViewById(R.id.tournam_rus_sup_cup_btn);
        tournam_rus_back_btn = (Button)findViewById(R.id.tournam_rus_back_btn);
        tournam_rus_home_btn = (Button)findViewById(R.id.tournam_rus_home_btn);

        tournam_rus_champ_btn.setOnClickListener(this);
        tournam_rus_cup_btn.setOnClickListener(this);
        tournam_rus_sup_cup_btn.setOnClickListener(this);
        tournam_rus_back_btn.setOnClickListener(this);
        tournam_rus_home_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.tournam_rus_back_btn:
                intent = new Intent(this, Tournaments.class);
                startActivity(intent);
                break;
            case R.id.tournam_rus_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.tournam_rus_champ_btn:
                intent = new Intent(this, Tournaments_rus_champ.class);
                startActivity(intent);
                break;
        }
    }
}

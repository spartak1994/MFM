package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tournaments_rus_champ extends AppCompatActivity implements View.OnClickListener{
    Button tournament_rus_champ_goal_btn;
    Button tournament_rus_champ_pas_btn;
    Button tournament_rus_champ_card_btn;
    Button tournament_rus_champ_back_btn;
    Button tournament_rus_champ_home_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments_rus_champ);

        tournament_rus_champ_goal_btn = (Button) findViewById(R.id.tournament_rus_champ_goal_btn);
        tournament_rus_champ_pas_btn = (Button) findViewById(R.id.tournament_rus_champ_pas_btn);
        tournament_rus_champ_card_btn = (Button) findViewById(R.id.tournament_rus_champ_card_btn);
        tournament_rus_champ_back_btn = (Button) findViewById(R.id.tournament_rus_champ_back_btn);
        tournament_rus_champ_home_btn = (Button) findViewById(R.id.tournament_rus_champ_home_btn);

        tournament_rus_champ_goal_btn.setOnClickListener(this);
        tournament_rus_champ_pas_btn.setOnClickListener(this);
        tournament_rus_champ_card_btn.setOnClickListener(this);
        tournament_rus_champ_back_btn.setOnClickListener(this);
        tournament_rus_champ_home_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.tournament_rus_champ_back_btn:
                intent = new Intent(this, Tournaments_rus.class);
                startActivity(intent);
                break;
            case R.id.tournament_rus_champ_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;

        }
    }
}

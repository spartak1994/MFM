package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Team_control extends AppCompatActivity implements View.OnClickListener {
    Button squad_btn;
    Button lineUp_btn;
    Button tactics_btn;
    Button trainings_btn;
    Button perspective_btn;
    Button contracts_btn;
    Button medical_btn;
    Button team_cont_back_btn;
    Button team_cont_home_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_control);

        squad_btn= (Button) findViewById(R.id.squab_btn);
        lineUp_btn= (Button) findViewById(R.id.lineUp_btn);
        tactics_btn= (Button) findViewById(R.id.tactics_btn);
        trainings_btn= (Button) findViewById(R.id.trainings_btn);
        perspective_btn= (Button) findViewById(R.id.perspective_btn);
        contracts_btn= (Button) findViewById(R.id.contracts_btn);
        medical_btn= (Button) findViewById(R.id.medical_btn);
        team_cont_back_btn= (Button) findViewById(R.id.team_cont_back_btn);
        team_cont_home_btn= (Button) findViewById(R.id.team_cont_home_btn);

        squad_btn.setOnClickListener(this);
        lineUp_btn.setOnClickListener(this);
        tactics_btn.setOnClickListener(this);
        trainings_btn.setOnClickListener(this);
        perspective_btn.setOnClickListener(this);
        contracts_btn.setOnClickListener(this);
        medical_btn.setOnClickListener(this);
        team_cont_back_btn.setOnClickListener(this);
        team_cont_home_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.squab_btn:
                intent = new Intent(this, Squad.class);
                startActivity(intent);
                break;
            case R.id.lineUp_btn:
                intent = new Intent(this, LineUp.class);
                startActivity(intent);
                break;
            case R.id.tactics_btn:
                intent = new Intent(this, Tactics.class);
                startActivity(intent);
                break;
            case R.id.trainings_btn:
                intent = new Intent(this, Trainings.class);
                startActivity(intent);
                break;
            case R.id.perspective_btn:
                intent = new Intent(this, ProspectsPlayers.class);
                startActivity(intent);
                break;
            case R.id.contracts_btn:
                intent = new Intent(this, Contracts.class);
                startActivity(intent);
                break;
            case R.id.medical_btn:
                intent = new Intent(this, Infirmary.class);
                startActivity(intent);
                break;
            case R.id.team_cont_back_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.team_cont_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainGameMenu extends AppCompatActivity implements View.OnClickListener{

    Button btn_next_game;
    Button btn_office;
    Button btn_team_control;
    Button btn_transfers;
    Button btn_tournaments;
    Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_menu);

        btn_next_game = (Button) findViewById(R.id.btn_next_game);
        btn_office = (Button) findViewById(R.id.btn_office);;
        btn_team_control = (Button) findViewById(R.id.btn_team_control);;
        btn_transfers = (Button) findViewById(R.id.btn_transfers);;
        btn_tournaments = (Button) findViewById(R.id.btn_tournaments);;
        btn_exit = (Button)findViewById(R.id.main_exit_btn);

        btn_next_game.setOnClickListener(this);
        btn_office.setOnClickListener(this);
        btn_team_control.setOnClickListener(this);
        btn_transfers.setOnClickListener(this);
        btn_tournaments.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_office:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.btn_team_control:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.btn_transfers:
                intent = new Intent(this, TransferSearch.class);
                startActivity(intent);
                break;
            case R.id.btn_tournaments:
                intent = new Intent(this, Tournaments.class);
                startActivity(intent);
                break;
            case R.id.main_exit_btn:
                //intent.putExtra("alignment", Gravity.RIGHT);
                finish();
                break;



        }
    }
}

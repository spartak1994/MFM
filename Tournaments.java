package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tournaments extends AppCompatActivity implements View.OnClickListener{
    Button tournam_your_btn;
    Button tournam_rus_btn;
    Button tournam_eng_btn;
    Button tournam_ita_btn;
    Button tournam_spain_btn;
    Button tournam_fra_btn;
    Button tournam_deutch_btn;
    Button tournam_euro_btn;
    Button tournam_other_btn;
    Button tournam_back_btn;
    Button tournam_home_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments);

        tournam_your_btn = (Button)findViewById(R.id.tournam_your_btn);
        tournam_rus_btn = (Button)findViewById(R.id.tournam_rus_btn);
        tournam_eng_btn = (Button)findViewById(R.id.tournam_eng_btn);
        tournam_ita_btn = (Button)findViewById(R.id.tournam_ita_btn);
        tournam_spain_btn = (Button)findViewById(R.id.tournam_spain_btn);
        tournam_fra_btn = (Button)findViewById(R.id.tournam_fra_btn);
        tournam_deutch_btn = (Button)findViewById(R.id.tournam_deutch_btn);
        tournam_euro_btn = (Button)findViewById(R.id.tournam_euro_btn);
        tournam_other_btn = (Button)findViewById(R.id.tournam_other_btn);
        tournam_back_btn = (Button)findViewById(R.id.tournam_back_btn);
        tournam_home_btn = (Button)findViewById(R.id.tournam_home_btn);

        tournam_your_btn.setOnClickListener(this);
        tournam_rus_btn.setOnClickListener(this);
        tournam_eng_btn.setOnClickListener(this);
        tournam_ita_btn.setOnClickListener(this);
        tournam_spain_btn.setOnClickListener(this);
        tournam_fra_btn.setOnClickListener(this);
        tournam_deutch_btn.setOnClickListener(this);
        tournam_euro_btn.setOnClickListener(this);
        tournam_other_btn.setOnClickListener(this);
        tournam_back_btn.setOnClickListener(this);
        tournam_home_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.tournam_back_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.tournam_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.tournam_rus_btn:
                intent = new Intent(this, Tournaments_rus.class);
                startActivity(intent);
                break;
        }
    }
}

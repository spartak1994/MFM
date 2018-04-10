package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TrophiesHall extends AppCompatActivity implements View.OnClickListener {
    LinearLayout linearLayout;
    LinearLayout llClubs;

    Button btn_back;
    Button btn_home;

    RelativeLayout rl_info;


    ArrayList<LinearLayout> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophies_hall);

        btn_back = (Button)findViewById(R.id.trophies_hall_btn_back);
        btn_home = (Button)findViewById(R.id.trophies_hall_btn_home);

        btn_back.setOnClickListener(this);
        btn_home.setOnClickListener(this);

        linearLayout = (LinearLayout)findViewById(R.id.trophies_hall_ll_shelf);
        llClubs = (LinearLayout)findViewById(R.id.trophies_hall_ll_clubs);
        linearLayout.setOnClickListener(this);
        llClubs.setOnClickListener(this);

        rl_info = (RelativeLayout)findViewById(R.id.trophies_hall_rl_info);
        rl_info.setOnClickListener(this);
        rl_info.setVisibility(View.INVISIBLE);

        list = new ArrayList<>();

        for(int i = 0; i < 7; i++)
        {
            LayoutInflater ltInflater = getLayoutInflater();
            if (true) {

                //color++;

                View item = ltInflater.inflate(R.layout.item_shelf_cup, linearLayout, false);
                //TextView tvTeam = (TextView) item.findViewById(R.id.tvTeam);
                //tvTeam.setText(teams.get(i));
                //ImageView ivTeam = (ImageView) item.findViewById(R.id.ivTeam);
                //ivTeam.setBackgroundResource(icons.get(i));


//                item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
//                if (color % 2 == 0)
//                    item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
//                else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
//                item.setTag(1000);
//                item.setOnClickListener(this);
//                if(i == 0) item.setBackgroundColor(getResources().getColor(R.color.sanye));
                linearLayout.addView(item);
            }
        }

        for(int i = 0; i< 9; i++)
        {
            LayoutInflater ltInflater = getLayoutInflater();
            if (true) {

                //color++;

                View item = ltInflater.inflate(R.layout.item_clubs_to_tournament_wins, llClubs, false);

                //TextView tvTeam = (TextView) item.findViewById(R.id.tvTeam);
                //tvTeam.setText(teams.get(i));
                //ImageView ivTeam = (ImageView) item.findViewById(R.id.ivTeam);
                //ivTeam.setBackgroundResource(icons.get(i));


//                item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
//                if (color % 2 == 0)
//                    item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
//                else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
//                item.setTag(1000);
//                item.setOnClickListener(this);
//                if(i == 0) item.setBackgroundColor(getResources().getColor(R.color.sanye));
                llClubs.addView(item);
            }
        }



    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.trophies_hall_btn_back:
                intent = new Intent(this, CoachHistory.class);
                startActivity(intent);
                break;
            case R.id.trophies_hall_btn_home:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.trophies_hall_ll_clubs:
                rl_info.setVisibility(View.INVISIBLE);
                break;
            default:
                rl_info.setVisibility(View.VISIBLE);
                break;
        }
    }
}

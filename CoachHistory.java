package ru.pabloidoid.mfm;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CoachHistory extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;
    Button troph_his_btn;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;
    TextView tv13;
    TextView tv14;

    ArrayList<TextView> list1;
    ArrayList<TextView> list2;

    ArrayList<String> teams;
    ArrayList<Integer> icons;

    LinearLayout linearLayout;

    int color = 0;
    int selected_index = 0;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_history);

        linearLayout = (LinearLayout)findViewById(R.id.coach_history_teams);

        back_btn = (Button)findViewById(R.id.coach_his_back_btn);
        home_btn = (Button)findViewById(R.id.coach_his_home_btn);
        troph_his_btn = (Button)findViewById(R.id.trophies_hall_btn);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);
        troph_his_btn.setOnClickListener(this);

        tv1 = (TextView)findViewById(R.id.coach_history_1);
        tv2 = (TextView)findViewById(R.id.coach_history_2);
        tv3 = (TextView)findViewById(R.id.coach_history_3);
        tv4 = (TextView)findViewById(R.id.coach_history_4);
        tv5 = (TextView)findViewById(R.id.coach_history_5);
        tv6 = (TextView)findViewById(R.id.coach_history_6);
        tv7 = (TextView)findViewById(R.id.coach_history_7);
        tv8 = (TextView)findViewById(R.id.coach_history_8);
        tv9 = (TextView)findViewById(R.id.coach_history_9);
        tv10 = (TextView)findViewById(R.id.coach_history_10);
        tv11 = (TextView)findViewById(R.id.coach_history_11);
        tv12 = (TextView)findViewById(R.id.coach_history_12);
        tv13 = (TextView)findViewById(R.id.coach_history_13);
        tv14 = (TextView)findViewById(R.id.coach_history_14);

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        teams = new ArrayList<>();
        list1.add(tv1);
        list1.add(tv2);
        list1.add(tv3);
        list1.add(tv4);
        list1.add(tv5);
        list1.add(tv6);
        list1.add(tv7);
        list2.add(tv8);
        list2.add(tv9);
        list2.add(tv10);
        list2.add(tv11);
        list2.add(tv12);
        list2.add(tv13);
        list2.add(tv14);

        icons = new ArrayList<>();
        icons.add(R.drawable.kuban);
        icons.add(R.drawable.dinamo_moscow);
        icons.add(R.drawable.ckg);
        icons.add(R.drawable.udineze);
        icons.add(R.drawable.inter);
        icons.add(R.drawable.barselona);

        teams.add("Кубань(Краснодар)");
        teams.add("Динамо(Москва)");
        teams.add("ЦКГ(Химки)");
        teams.add("Удинезе(Удине)");
        teams.add("Интер(Милан)");
        teams.add("Барселона");

        setColorNoSelect();
        AddTeams();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.coach_his_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.coach_his_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.trophies_hall_btn:
                intent = new Intent(this, TrophiesHall.class);
                startActivity(intent);
                break;
            default:
                if((Integer)v.getTag()>0)
                {
                    setColorToTeams();
                    ((LinearLayout)v).setBackgroundColor(getResources().getColor(R.color.sanye));
                }
        }
    }

    void setColorNoSelect() {
        int i = 0;
        for (TextView tw : list1) {
            if (i % 2 == 0)
                tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for (TextView tw : list2) {
            if (i % 2 == 0)
                tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    void AddTeams()
    {

            for(int i = 0; i<teams.size(); i++)
            {
                LayoutInflater ltInflater = getLayoutInflater();
                if (true) {

                    color++;

                    View item = ltInflater.inflate(R.layout.item_team_for_coach_history, linearLayout, false);
                    TextView tvTeam = (TextView) item.findViewById(R.id.tvTeam);
                    tvTeam.setText(teams.get(i));
                    ImageView ivTeam = (ImageView) item.findViewById(R.id.ivTeam);
                    ivTeam.setBackgroundResource(icons.get(i));


                    item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
                    if (color % 2 == 0)
                        item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
                    else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
                    item.setTag(1000);
                    item.setOnClickListener(this);
                    if(i == 0) item.setBackgroundColor(getResources().getColor(R.color.sanye));
                    linearLayout.addView(item);
                }
            }
    }

    void setColorToTeams()
    {
        color =0;
        for(int i = 0; i<linearLayout.getChildCount(); i++ )
        {
            if (color % 2 == 0)
                linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));

            color++;
        }
    }

}

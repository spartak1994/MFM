package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Infirmary extends AppCompatActivity implements View.OnClickListener{
    ArrayList<LinearLayout> list;
    ArrayList<Player> players;

    LinearLayout linearLayout;
    LinearLayout llInjury;

    final Random random = new Random();

    Button btn_home;
    Button btn_back;

    int color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infirmary);

        btn_back = (Button)findViewById(R.id.infirmary_btn_back);
        btn_home = (Button)findViewById(R.id.infirmary_btn_home);

        btn_back.setOnClickListener(this);
        btn_home.setOnClickListener(this);

        linearLayout = (LinearLayout)findViewById(R.id.infirmary_ll);
        llInjury = (LinearLayout)findViewById(R.id.infirmary_ll_injury);

        list = new ArrayList<>();

        players = new ArrayList<>();
        players.add(new Player("ВР","Селихов А.", random.nextInt(80)+20));
        players.add(new Player("ПЗ","Ещенко А.", random.nextInt(80)+20));
        players.add(new Player("ЦЗ","Таски С.", random.nextInt(80)+20));
        players.add(new Player("ЦЗ","Джикия Г.", random.nextInt(80)+20));
        players.add(new Player("ЛЗ","Комбаров Д.", random.nextInt(80)+20));
        players.add(new Player("ЦП","Глушаков Д.", random.nextInt(80)+20));
        players.add(new Player("ЦП","Фернандо", random.nextInt(80)+20));
        players.add(new Player("ЦАП","Попов И.", random.nextInt(80)+20));
        players.add(new Player("ЛФД","Промес К.", random.nextInt(80)+20));
        players.add(new Player("ПФД","Мельгарехо Л.", random.nextInt(80)+20));
        players.add(new Player("ЦФ","Адриано Л.", random.nextInt(80)+20));
        players.add(new Player("ВР","Ребров А.", random.nextInt(80)+20));
        players.add(new Player("ЦЗ","Кутепов И.", random.nextInt(80)+20));
        players.add(new Player("ЦЗ","Бокетти С.", random.nextInt(80)+20));
        players.add(new Player("ПЗ","Петкович М.", random.nextInt(80)+20));
        players.add(new Player("ЛЗ","Тигиев Г.", random.nextInt(80)+20));
        players.add(new Player("ЦП","Пашалич М.", random.nextInt(80)+20));
        players.add(new Player("ЛП","Самедов А.", random.nextInt(80)+20));
        players.add(new Player("ЦАП","Джано", random.nextInt(80)+20));
        players.add(new Player("ОПЗ","Тимофеев А.", random.nextInt(80)+20));
        players.add(new Player("ЦФ","Зе Луиш", random.nextInt(80)+20));
        players.add(new Player("ЛФД","Педро Роша", random.nextInt(80)+20));
        players.add(new Player("ЦП","Зобнин Р.", random.nextInt(80)+20));
        players.add(new Player("ПП","Бакаев З.", random.nextInt(80)+20));


        AddPlayers();
        AddInjury();

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.infirmary_btn_back:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.infirmary_btn_home:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
        }
    }

    void AddPlayers()
    {
        //boolean isFirst = true;
        for(Player p:players)
        {
            LayoutInflater ltInflater = getLayoutInflater();

            View item = ltInflater.inflate(R.layout.item_infirmary, linearLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.item_infirm_pos);
            tvPos.setText(p.pos);
            TextView tvName = (TextView) item.findViewById(R.id.item_infirm_name);
            tvName.setText(p.name);
            ProgressBar progressBar = (ProgressBar) item.findViewById(R.id.item_infirm_bar);
            progressBar.setMax(100);
            progressBar.setProgress(p.phisics);
            progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.phisics20), PorterDuff.Mode.SRC_ATOP);

            if(p.phisics>20)progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.phisics35), PorterDuff.Mode.SRC_ATOP);
            if(p.phisics>35)progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.phisics50), PorterDuff.Mode.SRC_ATOP);
            if(p.phisics>50)progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.phisics70), PorterDuff.Mode.SRC_ATOP);
            if(p.phisics>85)progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.phisics85), PorterDuff.Mode.SRC_ATOP);


            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            color++;
//            if(isFirst)
//            {
//                item.setBackgroundColor(getResources().getColor(R.color.sanye));
//                isFirst = false;
//            }
//            item.setTag(1000);
            item.setOnClickListener(this);
            linearLayout.addView(item);
        }

    }

    void AddInjury()
    {
        LayoutInflater ltInflater = getLayoutInflater();

        View item = ltInflater.inflate(R.layout.item_infirmary2, llInjury, false);
        TextView tvPos = (TextView) item.findViewById(R.id.injury_pos);
        tvPos.setText("ЦАП");
        TextView tvName = (TextView) item.findViewById(R.id.injury_name);
        tvName.setText("Ананидзе Ж.");
        TextView tvDuration = (TextView) item.findViewById(R.id.injury_duration);
        tvDuration.setText("3 недели");
        TextView tvInjuryType = (TextView) item.findViewById(R.id.injury_type);
        tvInjuryType.setText("Задняя поверхность бедра");
        item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
        llInjury.addView(item);


        item = ltInflater.inflate(R.layout.item_infirmary2, llInjury, false);
        tvPos = (TextView) item.findViewById(R.id.injury_pos);
        tvPos.setText("ЦЗ");
        tvName = (TextView) item.findViewById(R.id.injury_name);
        tvName.setText("Джикия Г.");
        tvDuration = (TextView) item.findViewById(R.id.injury_duration);
        tvDuration.setText("23 недели");
        tvInjuryType = (TextView) item.findViewById(R.id.injury_type);
        tvInjuryType.setText("Крестообразная связка");
        item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
        llInjury.addView(item);

    }

    public class Player
    {
        String pos;
        String name;
        int phisics;

        Player(String pos, String name, int phisics)
        {
            this.name = name;
            this.phisics = phisics;
            this.pos = pos;
        }

    }
}

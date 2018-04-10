package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

public class TransferSearch extends AppCompatActivity implements View.OnClickListener {
    Button transfer_search_btn_back;
    Button transfer_search_btn_search;
    Button transfer_search_btn_edit_leag;
    Button transfer_search_btn_edit_club;
    Button transfer_search_btn_edit_pos;
    Button transfer_search_btn_edit_mas;
    Button transfer_search_btn_edit_age;
    Button transfer_search_btn_edit_price;
    Button transfer_search_btn_edit_status;

    ArrayList<String> country ;
    ArrayList <String> russian;
    ArrayList <String> english;
    ArrayList <String> french;
    ArrayList <String> italian;
    ArrayList <String> german;
    ArrayList <String> spanish;

    ArrayList <TextView> teams;
    ArrayList <TextView> positions;

    ArrayList <String> list1 = new ArrayList<>();
    ArrayList <Boolean> list2 = new ArrayList<>();


    RelativeLayout rl_league;
    RelativeLayout rl_team;
    RelativeLayout rl_skill;
    RelativeLayout rl_age;
    RelativeLayout rl_price;
    RelativeLayout rl_status;
    RelativeLayout rl_position;


    LinearLayout linearLayout;


    int minSkill = 50;
    int maxSkill = 90;
    TextView tvMinAge;
    TextView tvMaxAge;

    int minAge = 16;
    int maxAge = 99;
    TextView tvMinSkill;
    TextView tvMaxSkill;

    int minPrice = 0;
    int maxPrice = 100000000;
    TextView tvMinPrice;
    TextView tvMaxPrice;


    View.OnClickListener OnSelectLeague = new View.OnClickListener() {
        String s;
        boolean b = false;
        @Override
        public void onClick(View v) {
            transfer_search_btn_edit_club.setText("Все");
            switch (v.getId()) {

                case R.id.item_tr_srch_rus:
                    transfer_search_btn_edit_leag.setText("Россия");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_eng:
                    transfer_search_btn_edit_leag.setText("Англия");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_ita:
                    transfer_search_btn_edit_leag.setText("Италия");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_ger:
                    transfer_search_btn_edit_leag.setText("Германия");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_spa:
                    transfer_search_btn_edit_leag.setText("Испания");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_fra:
                    transfer_search_btn_edit_leag.setText("Франция");
                    rl_league.setVisibility(View.INVISIBLE);
                    break;
                case R.id.item_tr_srch_all:
                    transfer_search_btn_edit_leag.setText("Все");
                    rl_league.setVisibility(View.INVISIBLE);
                    b = true;
                    break;

            }
            EnableAllBtn();
            if(b)transfer_search_btn_edit_club.setEnabled(false);
        }
    };

    View.OnClickListener OnSelectAge = new View.OnClickListener() {
        String s= "";
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.item_tr_srch_age_max_inc:
                    maxAge++;
                    if(maxAge>40)maxAge = 40;
                    tvMaxAge.setText(String.valueOf(maxAge));
                    break;
                case R.id.item_tr_srch_age_max_dec:
                    maxAge--;
                    if(maxAge<16)maxAge = 16;
                    if(maxAge<=minAge)
                    {
                        minAge = maxAge;
                        tvMinAge.setText(String.valueOf(minAge));
                    }
                    tvMaxAge.setText(String.valueOf(maxAge));
                    break;
                case R.id.item_tr_srch_age_min_dec:
                    minAge--;
                    if(minAge<16)minAge=16;
                    tvMinAge.setText(String.valueOf(minAge));
                    break;
                case R.id.item_tr_srch_age_min_inc:
                    minAge++;
                    if(minAge>40)minSkill = 40;
                    if(minAge>=maxAge)
                    {
                        maxAge = minAge;
                        tvMaxAge.setText(String.valueOf(maxAge));
                    }
                    tvMinAge.setText(String.valueOf(minAge));
                    break;
                case R.id.item_tr_srch_age_all:
                    rl_age.setVisibility(View.INVISIBLE);
                    maxAge = 40;
                    minAge = 16;
                    tvMinAge.setText(String.valueOf(minAge));
                    tvMaxAge.setText(String.valueOf(maxAge));
                    rl_age.setVisibility(View.INVISIBLE);
                    EnableAllBtn();
                    break;
                case R.id.item_tr_srch_age_apply:
                    rl_age.setVisibility(View.INVISIBLE);
                    EnableAllBtn();
                    break;
            }
            s = "От " + minAge + " до " + maxAge;
            transfer_search_btn_edit_age.setText(s);
        }
    };

    View.OnClickListener OnSelectClub = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            transfer_search_btn_edit_club.setText(((TextView)v).getText().toString());
            rl_team.setVisibility(View.INVISIBLE);
            EnableAllBtn();
        }
    };

    View.OnClickListener OnSelectSkill = new View.OnClickListener() {
        String s= "";
        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.item_tr_srch_skill_max_inc:
                    maxSkill++;
                    if(maxSkill>99)maxSkill = 99;
                    tvMaxSkill.setText(String.valueOf(maxSkill));
                    break;
                case R.id.item_tr_srch_skill_max_dec:
                    maxSkill--;
                    if(maxSkill<20)maxSkill = 20;
                    if(maxSkill<=minSkill)
                    {
                        minSkill = maxSkill;
                        tvMinSkill.setText(String.valueOf(minSkill));
                    }
                    tvMaxSkill.setText(String.valueOf(maxSkill));
                    break;
                case R.id.item_tr_srch_skill_min_dec:
                    minSkill--;
                    if(minSkill<20)minSkill=20;
                    tvMinSkill.setText(String.valueOf(minSkill));
                    break;
                case R.id.item_tr_srch_skill_min_inc:
                    minSkill++;
                    if(minSkill>99)minSkill =99;
                    if(minSkill>=maxSkill)
                    {
                        maxSkill = minSkill;
                        tvMaxSkill.setText(String.valueOf(maxSkill));
                    }
                    tvMinSkill.setText(String.valueOf(minSkill));
                    break;
                case R.id.item_tr_srch_skill_all:
                    rl_skill.setVisibility(View.INVISIBLE);
                    maxSkill = 99;
                    minSkill = 20;
                    tvMinSkill.setText(String.valueOf(minSkill));
                    tvMaxSkill.setText(String.valueOf(maxSkill));
                    rl_skill.setVisibility(View.INVISIBLE);
                    EnableAllBtn();
                    break;
                case R.id.item_tr_srch_skill_apply:
                    rl_skill.setVisibility(View.INVISIBLE);
                    EnableAllBtn();
                    break;
            }

            s = "От " + minSkill + " до " + maxSkill;
            transfer_search_btn_edit_mas.setText(s);

        }
    };

    View.OnClickListener OnSelectPrice = new View.OnClickListener() {
        String s ; // нужно только для того что бы свернуть OnClick))))
        @Override
        public void onClick(View v) {
            double step = 0;
            switch (v.getId())
            {
                case R.id.item_tr_srch_price_max_dec:

                    if(maxPrice<=1000000)step = 0.1;
                    if(maxPrice>1000000 && maxPrice<=5000000)step = 0.5;
                    if(maxPrice>5000000 && maxPrice<=50000000)step = 1;
                    if(maxPrice>50000000 && maxPrice<=100000000)step = 2.5;
                    if(maxPrice>100000000 && maxPrice<=250000000) step = 5;
                    if(maxPrice>250000000)step = 10;

                    step *= 1000000.0;

                    maxPrice -=step;
                    if(minPrice>maxPrice)
                    {
                        minPrice = maxPrice;
                        tvMinPrice.setText(getStringFormatPrice(minPrice));
                    }
                    if(maxPrice<0)
                    {
                        maxPrice = 0;
                        minPrice = maxPrice;
                        tvMinPrice.setText(getStringFormatPrice(minPrice));
                    }
                    tvMaxPrice.setText(getStringFormatPrice(maxPrice));

                    break;
                case R.id.item_tr_srch_price_max_inc:

                    if(maxPrice<=1000000)step = 0.1;
                    if(maxPrice>1000000 && maxPrice<=5000000)step = 0.5;
                    if(maxPrice>5000000 && maxPrice<=50000000)step = 1;
                    if(maxPrice>50000000 && maxPrice<=100000000)step = 2.5;
                    if(maxPrice>100000000 && maxPrice<=250000000) step = 5;
                    if(maxPrice>250000000)step = 10;

                    step *= 1000000.0;

                    maxPrice +=step;
                    if(minPrice>maxPrice)
                    {
                        minPrice = maxPrice;
                        tvMinPrice.setText(getStringFormatPrice(minPrice));
                    }
                    tvMaxPrice.setText(getStringFormatPrice(maxPrice));


                    break;
                case R.id.item_tr_srch_price_min_dec:

                    if(minPrice<=1000000)step = 0.1;
                    if(minPrice>1000000 && minPrice<=5000000)step = 0.5;
                    if(minPrice>5000000 && minPrice<=50000000)step = 1;
                    if(minPrice>50000000 && minPrice<=100000000)step = 2.5;
                    if(minPrice>100000000 && minPrice<=250000000) step = 5;
                    if(minPrice>250000000)step = 10;

                    step *= 1000000.0;

                    minPrice -=step;
                    if(minPrice<0)
                    {
                        minPrice = 0;
                        tvMinPrice.setText(getStringFormatPrice(minPrice));
                    }
                    tvMinPrice.setText(getStringFormatPrice(minPrice));
                    break;
                case R.id.item_tr_srch_price_min_inc:
                    if(minPrice<=1000000)step = 0.1;
                    if(minPrice>1000000 && minPrice<5000000)step = 0.5;
                    if(minPrice>5000000 && minPrice<50000000)step = 1;
                    if(minPrice>50000000 && minPrice<100000000)step = 2.5;
                    if(minPrice>100000000 && minPrice<=250000000) step = 5;
                    if(minPrice>250000000)step = 10;

                    step *= 1000000.0;

                    minPrice +=step;
                    if(minPrice>maxPrice)
                    {
                        maxPrice = minPrice;
                        tvMaxPrice.setText(getStringFormatPrice(maxPrice));
                    }
                    tvMinPrice.setText(getStringFormatPrice(minPrice));
                    break;
                case R.id.item_tr_srch_price_all:
                    minPrice = 0;
                    maxPrice = 999000000;
                    tvMaxPrice.setText(getStringFormatPrice(maxPrice));
                    tvMinPrice.setText(getStringFormatPrice(minPrice));
                    EnableAllBtn();
                    rl_price.setVisibility(View.INVISIBLE);
                    transfer_search_btn_edit_price.setText(String.valueOf((Integer)minPrice/1000000) + " - " + String.valueOf(maxPrice/1000000) + " mln");
                    break;
                case R.id.item_tr_srch_price_apply:
                    EnableAllBtn();
                    rl_price.setVisibility(View.INVISIBLE);
                    transfer_search_btn_edit_price.setText(String.valueOf(minPrice/1000000) + " - " + String.valueOf(maxPrice/1000000) + " mln");
                    break;
            }
        }
    };

    View.OnClickListener OnSelectStatus = new View.OnClickListener() {
        String s;
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.item_tr_srch_status_allowed:
                    transfer_search_btn_edit_status.setText("Трансфер разрешен");
                    break;
                case R.id.item_tr_srch_status_arend:
                    transfer_search_btn_edit_status.setText("Аренда Разрешена");
                    break;
                case R.id.item_tr_srch_status_free:
                    transfer_search_btn_edit_status.setText("Свободный агент");
                    break;
                case R.id.item_tr_srch_status_all:
                    transfer_search_btn_edit_status.setText("Все");
                    break;

            }
            rl_status.setVisibility(View.INVISIBLE);
            EnableAllBtn();
        }
    };

    View.OnClickListener OnSelectPosition = new View.OnClickListener() {
        String s;


        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.item_tr_srch_pos_GK:
                    list2.set(0, !list2.get(0));
                    CheckPositionFilter(0);
                    break;
                case R.id.item_tr_srch_pos_LD:
                    list2.set(1, !list2.get(1));
                    CheckPositionFilter(1);
                    break;
                case R.id.item_tr_srch_pos_CD:
                    list2.set(2, !list2.get(2));
                    CheckPositionFilter(2);
                    break;
                case R.id.item_tr_srch_pos_RD:
                    list2.set(3, !list2.get(3));
                    CheckPositionFilter(3);
                    break;

                case R.id.item_tr_srch_pos_CDM:
                    list2.set(4, !list2.get(4));
                    CheckPositionFilter(4);
                    break;

                case R.id.item_tr_srch_pos_LM:
                    list2.set(5, !list2.get(5));
                    CheckPositionFilter(5);
                    break;
                case R.id.item_tr_srch_pos_CM:
                    list2.set(6, !list2.get(6));
                    CheckPositionFilter(6);
                    break;
                case R.id.item_tr_srch_pos_RM:
                    list2.set(7, !list2.get(7));
                    CheckPositionFilter(7);
                    break;
                case R.id.item_tr_srch_pos_CAM:
                    list2.set(8, !list2.get(8));
                    CheckPositionFilter(8);
                    break;
                case R.id.item_tr_srch_pos_LFD:
                    list2.set(9, !list2.get(9));
                    CheckPositionFilter(9);
                    break;
                case R.id.item_tr_srch_pos_CFD:
                    list2.set(10, !list2.get(10));
                    CheckPositionFilter(10);
                    break;
                case R.id.item_tr_srch_pos_RFD:
                    list2.set(11, !list2.get(11));
                    CheckPositionFilter(11);
                    break;

                case R.id.item_tr_srch_pos_allow:
                    rl_position.setVisibility(View.INVISIBLE);
                    EnableAllBtn();
                    s = getPositionString();
                    transfer_search_btn_edit_pos.setText(s);
                    break;
                case R.id.item_tr_srch_pos_all:
                    for(int i = 0; i<list2.size(); i++)
                    {
                        list2.set(i, true);
                    }
                    break;
            }
            LightPosition();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_search);
        transfer_search_btn_back = (Button) findViewById(R.id.transf_search_back_btn);
        transfer_search_btn_search = (Button) findViewById(R.id.transf_search_Search_btn);
        transfer_search_btn_edit_leag = (Button) findViewById(R.id.transf_search_edit_leag);
        transfer_search_btn_edit_club = (Button) findViewById(R.id.transf_search_edit_team);
        transfer_search_btn_edit_pos = (Button) findViewById(R.id.transf_search_edit_pos);
        transfer_search_btn_edit_mas = (Button) findViewById(R.id.transf_search_edit_mas);
        transfer_search_btn_edit_age = (Button) findViewById(R.id.transf_search_edit_age);
        transfer_search_btn_edit_price = (Button) findViewById(R.id.transf_search_edit_price);
        transfer_search_btn_edit_status = (Button) findViewById(R.id.transf_search_edit_stasus);

        transfer_search_btn_back.setOnClickListener(this);
        transfer_search_btn_search.setOnClickListener(this);
        transfer_search_btn_edit_leag.setOnClickListener(this);
        transfer_search_btn_edit_club.setOnClickListener(this);
        transfer_search_btn_edit_pos.setOnClickListener(this);
        transfer_search_btn_edit_mas.setOnClickListener(this);
        transfer_search_btn_edit_age.setOnClickListener(this);
        transfer_search_btn_edit_price.setOnClickListener(this);
        transfer_search_btn_edit_status.setOnClickListener(this);

        transfer_search_btn_edit_club.setEnabled(false);

        LayoutInflater ltInflater = getLayoutInflater();
        View item = ltInflater.inflate(R.layout.item_transfers_search_league,rl_league,false);
        item.findViewById(R.id.item_tr_srch_rus).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_eng).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_spa).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_ger).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_ita).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_fra).setOnClickListener(OnSelectLeague);
        item.findViewById(R.id.item_tr_srch_all).setOnClickListener(OnSelectLeague);
        rl_league = (RelativeLayout)findViewById(R.id.transfers_search_rl_league);
        rl_league.addView(item);
        rl_league.setVisibility(View.INVISIBLE);
        //rl_league.setOnClickListener(this);


        rl_team = (RelativeLayout)findViewById(R.id.transfers_search_rl_team);
        rl_team.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_team,rl_team,false);
        linearLayout = (LinearLayout) item.findViewById(R.id.item_tr_srch_club_ll);
        rl_team.addView(item);

        rl_skill = (RelativeLayout)findViewById(R.id.transfers_search_rl_skill);
        rl_skill.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_skill,rl_skill,false);
        tvMinSkill = (TextView)item.findViewById(R.id.item_tr_srch_skill_min);
        tvMaxSkill = (TextView)item.findViewById(R.id.item_tr_srch_skill_max);

        item.findViewById(R.id.item_tr_srch_skill_max_dec).setOnClickListener(OnSelectSkill);
        item.findViewById(R.id.item_tr_srch_skill_max_inc).setOnClickListener(OnSelectSkill);
        item.findViewById(R.id.item_tr_srch_skill_min_inc).setOnClickListener(OnSelectSkill);
        item.findViewById(R.id.item_tr_srch_skill_min_dec).setOnClickListener(OnSelectSkill);
        item.findViewById(R.id.item_tr_srch_skill_all).setOnClickListener(OnSelectSkill);
        item.findViewById(R.id.item_tr_srch_skill_apply).setOnClickListener(OnSelectSkill);
        rl_skill.addView(item);


        rl_age = (RelativeLayout)findViewById(R.id.transfers_search_rl_age);
        rl_age.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_age,rl_age,false);
        tvMinAge = (TextView)item.findViewById(R.id.item_tr_srch_age_min);
        tvMaxAge = (TextView)item.findViewById(R.id.item_tr_srch_age_max);
        item.findViewById(R.id.item_tr_srch_age_max_dec).setOnClickListener(OnSelectAge);
        item.findViewById(R.id.item_tr_srch_age_max_inc).setOnClickListener(OnSelectAge);
        item.findViewById(R.id.item_tr_srch_age_min_inc).setOnClickListener(OnSelectAge);
        item.findViewById(R.id.item_tr_srch_age_min_dec).setOnClickListener(OnSelectAge);
        item.findViewById(R.id.item_tr_srch_age_all).setOnClickListener(OnSelectAge);
        item.findViewById(R.id.item_tr_srch_age_apply).setOnClickListener(OnSelectAge);
        rl_age.addView(item);

        rl_price = (RelativeLayout)findViewById(R.id.transfers_search_rl_price);
        rl_price.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_price,rl_price,false);
        tvMinPrice = (TextView)item.findViewById(R.id.item_tr_srch_price_min);
        tvMaxPrice = (TextView)item.findViewById(R.id.item_tr_srch_price_max);
        item.findViewById(R.id.item_tr_srch_price_max_dec).setOnClickListener(OnSelectPrice);
        item.findViewById(R.id.item_tr_srch_price_max_inc).setOnClickListener(OnSelectPrice);
        item.findViewById(R.id.item_tr_srch_price_min_inc).setOnClickListener(OnSelectPrice);
        item.findViewById(R.id.item_tr_srch_price_min_dec).setOnClickListener(OnSelectPrice);
        item.findViewById(R.id.item_tr_srch_price_all).setOnClickListener(OnSelectPrice);
        item.findViewById(R.id.item_tr_srch_price_apply).setOnClickListener(OnSelectPrice);
        rl_price.addView(item);

        rl_status = (RelativeLayout)findViewById(R.id.transfers_search_rl_status);
        rl_status.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_status, rl_status, false);
        item.findViewById(R.id.item_tr_srch_status_allowed).setOnClickListener(OnSelectStatus);
        item.findViewById(R.id.item_tr_srch_status_arend).setOnClickListener(OnSelectStatus);
        item.findViewById(R.id.item_tr_srch_status_free).setOnClickListener(OnSelectStatus);
        item.findViewById(R.id.item_tr_srch_status_all).setOnClickListener(OnSelectStatus);
        rl_status.addView(item);

        rl_position = (RelativeLayout)findViewById(R.id.transfers_search_rl_position);
        rl_position.setVisibility(View.INVISIBLE);
        item = ltInflater.inflate(R.layout.item_transfers_search_position, rl_position, false);
        item.findViewById(R.id.item_tr_srch_pos_all).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_allow).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_GK).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_LD).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_CD).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_RD).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_CDM).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_LM).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_CM).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_RM).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_CAM).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_LFD).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_CFD).setOnClickListener(OnSelectPosition);
        item.findViewById(R.id.item_tr_srch_pos_RFD).setOnClickListener(OnSelectPosition);

        positions = new ArrayList<>();
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_GK));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_LD));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_CD));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_RD));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_CDM));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_LM));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_CM));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_RM));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_CAM));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_LFD));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_CFD));
        positions.add((TextView) item.findViewById(R.id.item_tr_srch_pos_RFD));

        rl_position.addView(item);

        for (int i = 0; i<12; i++)
        {
            list2.add(false);
        }

        list1.add("Вр");
        list1.add("ЛЗ");
        list1.add("ЦЗ");
        list1.add("ПЗ");
        list1.add("ОП");
        list1.add("ЛП");
        list1.add("ЦП");
        list1.add("ПП");
        list1.add("ЦАП");
        list1.add("ЛФД");
        list1.add("ЦФ");
        list1.add("ПФД");

        initTeams();
        teams = new ArrayList<>();


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.transf_search_back_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.transf_search_edit_leag:
                rl_league.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transf_search_edit_team:
                switch (transfer_search_btn_edit_leag.getText().toString())
                {
                    case "Россия":
                        AddTeamFromCountry(russian);
                        break;
                    case "Англия":
                        AddTeamFromCountry(english);
                        break;
                    case "Италия":
                        AddTeamFromCountry(italian);
                        break;
                    case "Германия":
                        AddTeamFromCountry(german);
                        break;
                    case "Испания":
                        AddTeamFromCountry(spanish);
                        break;
                    case "Франция":
                        AddTeamFromCountry(french);
                        break;

                }
                rl_team.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transf_search_edit_mas:
                rl_skill.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transf_search_edit_age:
                rl_age.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transf_search_edit_price:
                rl_price.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transf_search_edit_stasus:
                rl_status.setVisibility(View.VISIBLE);
                DisableAllBtn();
                break;
            case R.id.transfers_search_rl_league:
                rl_league.setVisibility(View.INVISIBLE);
                break;
            case R.id.transf_search_edit_pos:
                rl_position.setVisibility(View.VISIBLE);
                LightPosition();
                DisableAllBtn();
                break;
            case R.id.transf_search_Search_btn:
                intent = new Intent(this, TransfersSearchResults.class);
                startActivity(intent);
                break;

        }
    }

    void initTeams()
    {
        country = new ArrayList<>();
        russian = new ArrayList<>();
        english = new ArrayList<>();
        french = new ArrayList<>();
        italian = new ArrayList<>();
        german = new ArrayList<>();
        spanish = new ArrayList<>();



        country.add("Россия");
        country.add("Англия");
        country.add("Франция");
        country.add("Испания");
        country.add("Германия");
        country.add("Италия");


        russian.add("Спартак Москва");
        russian.add("Зенит СпБ");
        russian.add("ЦСКА Москва");
        russian.add("Краснодар");
        russian.add("Ростов");
        russian.add("Ахмат Грозный");
        russian.add("Рубин Казань");
        russian.add("СКА-Хабаровск");
        russian.add("Динамо Москва");
        russian.add("Урал Екатеренбург");
        russian.add("Арсенал Тула");
        russian.add("Локомотив Москва");
        russian.add("Анжи Махачкала");
        russian.add("Амкар Пермь");
        russian.add("Тосно");
        russian.add("Уфа");

        english.add("Ливерпуль");
        english.add("Челси");
        english.add("Манчестер Юнайтед");
        english.add("Манчестер Сити");
        english.add("Тоттентхэм");
        english.add("Арсенал");
        english.add("Лестер");
        english.add("Суонси");
        english.add("Бернли");
        english.add("Брайтон");
        english.add("Хаддерсфилд");
        english.add("Саутгемптон");
        english.add("Сток Сити");
        english.add("Вест Хэм");
        english.add("Эвертон");
        english.add("Ньюкасл");
        english.add("Кристал Пелас");
        english.add("Уотфорд");
        english.add("Вест Бромвич");
        english.add("Борнмут");

        spanish.add("Барселона");
        spanish.add("Aтлетик Бильбао");
        spanish.add("Атлетико Мадрид");
        spanish.add("Реал Мадрид");
        spanish.add("Вильяреал");
        spanish.add("Валенсия");
        spanish.add("Севилья");
        spanish.add("Депортиво");
        spanish.add("Лас-Пальмас");
        spanish.add("Жирона");
        spanish.add("Реал Сосьедад");
        spanish.add("Леванте");
        spanish.add("Алавес");
        spanish.add("Сельта");
        spanish.add("Реал Бетис");
        spanish.add("Эйбар");
        spanish.add("Леванте");
        spanish.add("Леванте");
        spanish.add("Леванте");
        spanish.add("Леванте");

        french.add("ПСЖ");
        french.add("Монако");
        french.add("Лион");
        french.add("Марсель");
        french.add("Нант");
        french.add("Ницца");
        french.add("Бордо");
        french.add("Лиль");
        french.add("Сент-Этьен");
        french.add("Монпелье");
        french.add("");


        italian.add("Ювентус");//
        italian.add("Наполи");//
        italian.add("Милан");//
        italian.add("Интер");//
        italian.add("Лацио");//
        italian.add("Рома");//
        italian.add("Сампдория");//
        italian.add("Дженоа");
        italian.add("Удинезе");//
        italian.add("Болонья");
        italian.add("Фиорентина");//
        italian.add("СПАЛ");//
        italian.add("Бенневито");//
        italian.add("Кротоне");
        italian.add("Сасуолло");
        italian.add("Аталанта");//
        italian.add("Торино");//
        italian.add("Верона");//
        italian.add("");
        italian.add("");

        german.add("Бавария");
        german.add("Боруссия Дортмунд");
        german.add("Боррусия Менхенгладбах");
        german.add("РБ Лейпциг");
        german.add("Шальке 04");
        german.add("Штутгарт");
        german.add("Гамбург");
        german.add("Вердер");
        german.add("Герта");
        german.add("Кельн");
        german.add("Хоффенхайм");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
    }

    void AddTeamFromCountry(ArrayList<String> list)
    {
        teams.clear();
        linearLayout.removeAllViews();
        for(String s : list)
        {
            TextView textView = new TextView(this);
            textView.setText(s);
            textView.setTextColor(Color.WHITE);
            textView.setTextSize(30);
            textView.setGravity(Gravity.CENTER);


            teams.add(textView);
        }

        int color = 0;

        for(TextView t : teams)
        {
            if(color%2==0)t.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else t.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            linearLayout.addView(t);
            t.setPadding(10,5,10,5);
            t.setOnClickListener(OnSelectClub);
            color++;
        }
    }

    void DisableAllBtn()
    {
        transfer_search_btn_edit_leag.setEnabled(false);
        transfer_search_btn_edit_mas.setEnabled(false);
        transfer_search_btn_edit_club.setEnabled(false);
        transfer_search_btn_edit_age.setEnabled(false);
        transfer_search_btn_edit_pos.setEnabled(false);
        transfer_search_btn_edit_price.setEnabled(false);
        transfer_search_btn_edit_status.setEnabled(false);
    }

    void EnableAllBtn()
    {
        transfer_search_btn_edit_leag.setEnabled(true);
        transfer_search_btn_edit_mas.setEnabled(true);
        if(!transfer_search_btn_edit_leag.getText().equals("Все"))transfer_search_btn_edit_club.setEnabled(true);
        transfer_search_btn_edit_age.setEnabled(true);
        transfer_search_btn_edit_pos.setEnabled(true);
        transfer_search_btn_edit_price.setEnabled(true);
        transfer_search_btn_edit_status.setEnabled(true);
    }

    String getStringFormatPrice(double price)
    {
        String s = "";
        if(price<50000000)
        {
            s = "$" + String.valueOf((int)price/1000000) + "." + String.valueOf((int)(price%1000000)/100000) + " mln";
        }
        else
        {
            s = "$" + String.valueOf((int)price/1000000) + " mln";
        }
        return s;
    }

    void LightPosition()
    {
        for(int i = 0; i<positions.size(); i++)
        {
            if(list2.get(i))
            {
                if(i==0)positions.get(i).setBackgroundColor(getResources().getColor(R.color.goalKeepers));
                if(i>0 && i<4)positions.get(i).setBackgroundColor(getResources().getColor(R.color.defendersOnField));
                if(i>=4 && i<9)positions.get(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                if(i>=9)positions.get(i).setBackgroundColor(getResources().getColor(R.color.forwards));
            }
            else positions.get(i).setBackgroundColor(Color.alpha(getResources().getColor(R.color.defendersOnField)));
        }
    }

    void CheckPositionFilter(int index)
    {
        if(index==0)
        {
            for(int i = 1; i<list2.size(); i++)
            {
                list2.set(i, false);
            }
        }
        if(index>0 && index <4)
        {
            list2.set(0, false);
            for(int i = 4; i<list2.size(); i++)
            {
                list2.set(i, false);
            }
        }
        if(index>=4 && index<9)
        {
            for(int i = 0; i<4; i++)
            {
                list2.set(i, false);
            }

            for(int i = 9; i<list2.size(); i++)
            {
                list2.set(i, false);
            }
        }

        if(index>=9)
        {
            for(int i = 0; i<9; i++)
            {
                list2.set(i, false);
            }
        }
    }
    String getPositionString()
    {
        String s = "";
        int count = 0;
        for(int i = 0; i<list2.size(); i++)
        {
            if(list2.get(i))
            {
                count++;
                s+=list1.get(i) + ", ";
            }
        }
        if(s.length()!=0)s = s.substring(0, s.length()-2);
        if (count==12 || s.length()==0) s = "Все";

        return s;
    }
}

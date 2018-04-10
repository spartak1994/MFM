package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ControlPersonal extends AppCompatActivity implements View.OnClickListener {
    Button back_btn;
    Button home_btn;

    LinearLayout llmidl;
    LinearLayout llyoung;
    LinearLayout lldef;
    LinearLayout llforw;
    LinearLayout llpress;
    LinearLayout llmedic;
    LinearLayout llnegotivat;
    LinearLayout llgoalkeep;

    ArrayList<LinearLayout> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_personal);
        back_btn = (Button)findViewById(R.id.control_pers_back_btn);
        home_btn = (Button)findViewById(R.id.control_pesr_home_btn);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);

        llmidl = (LinearLayout) findViewById(R.id.contr_pers_ll_midl);
        llyoung = (LinearLayout) findViewById(R.id.contr_pers_ll_young);
        lldef = (LinearLayout) findViewById(R.id.contr_pers_ll_defender);
        llforw = (LinearLayout) findViewById(R.id.contr_pers_ll_forw);
        llpress = (LinearLayout) findViewById(R.id.contr_pers_ll_press);
        llmedic = (LinearLayout) findViewById(R.id.contr_pers_ll_medic);
        llnegotivat = (LinearLayout) findViewById(R.id.contr_pers_ll_negotiator);
        llgoalkeep = (LinearLayout) findViewById(R.id.contr_pers_ll_goalkeeper);

        list = new ArrayList<>();
        list.add(llforw);
        list.add(llmidl);
        list.add(lldef);
        list.add(llgoalkeep);
        list.add(llmedic);
        list.add(llpress);
        list.add(llnegotivat);
        list.add(llyoung);
        setColor();
        llforw.setBackgroundColor(getResources().getColor(R.color.sanye));

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.control_pers_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.control_pesr_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.contr_pers_ll_forw:
                setColor();
                llforw.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_midl:
                setColor();
                llmidl.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_defender:
                setColor();
                lldef.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_goalkeeper:
                setColor();
                llgoalkeep.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_medic:
                setColor();
                llmedic.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_press:
                setColor();
                llpress.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_negotiator:
                setColor();
                llnegotivat.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.contr_pers_ll_young:
                setColor();
                llyoung.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
        }
    }



    void setColor()
    {
        int i = 0;
        for(LinearLayout ll : list)
        {
            if(i%2 == 0 )ll.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else ll.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));;
            i++;
        }
    }
}

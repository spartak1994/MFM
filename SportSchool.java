package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SportSchool extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;
    Button offer_contract_btn;


    TextView spSxhool1;
    TextView spSxhool2;
    TextView spSxhool3;
    TextView spSxhool4;
    TextView spSxhool5;
    TextView spSxhool6;
    TextView spSxhool7;
    TextView spSxhool8;
    TextView spSxhool9;
    TextView spSxhool10;
    TextView spSxhool11;
    TextView spSxhool12;
    TextView spSxhool13;
    TextView spSxhool14;
    TextView spSxhool15;
    TextView spSxhool16;
    TextView spSxhool17;
    TextView spSxhool18;
    TextView spSxhool19;

    ArrayList<TextView> list1;
    ArrayList<TextView> list2;
    ArrayList<TextView> list3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_school);
        back_btn = (Button)findViewById(R.id.sp_school_back_btn);
        home_btn = (Button)findViewById(R.id.sp_school_home_btn);
        offer_contract_btn = (Button)findViewById(R.id.sp_school_offer_contract);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);
        offer_contract_btn.setOnClickListener(this);

        spSxhool1 = (TextView) findViewById(R.id.sp_school_1);
        spSxhool2 = (TextView) findViewById(R.id.sp_school_2);
        spSxhool3 = (TextView) findViewById(R.id.sp_school_3);
        spSxhool4 = (TextView) findViewById(R.id.sp_school_4);
        spSxhool5 = (TextView) findViewById(R.id.sp_school_5);
        spSxhool6 = (TextView) findViewById(R.id.sp_school_6);
        spSxhool7 = (TextView) findViewById(R.id.sp_school_7);
        spSxhool8 = (TextView) findViewById(R.id.sp_school_8);
        spSxhool9 = (TextView) findViewById(R.id.sp_school_9);
        spSxhool10 = (TextView) findViewById(R.id.sp_school_10);
        spSxhool11 = (TextView) findViewById(R.id.sp_school_11);
        spSxhool12 = (TextView) findViewById(R.id.sp_school_12);
        spSxhool13 = (TextView) findViewById(R.id.sp_school_13);
        spSxhool14 = (TextView) findViewById(R.id.sp_school_14);
        spSxhool15 = (TextView) findViewById(R.id.sp_school_15);
        spSxhool16 = (TextView) findViewById(R.id.sp_school_16);
        spSxhool17 = (TextView) findViewById(R.id.sp_school_17);
        spSxhool18 = (TextView) findViewById(R.id.sp_school_18);
        spSxhool19 = (TextView) findViewById(R.id.sp_school_19);


        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();

        list1.add(spSxhool1);
        list1.add(spSxhool2);
        list1.add(spSxhool3);

        list2.add(spSxhool4);
        list2.add(spSxhool5);
        list2.add(spSxhool6);
        list2.add(spSxhool7);
        list2.add(spSxhool8);
        list2.add(spSxhool9);
        list2.add(spSxhool10);
        list2.add(spSxhool11);

        list3.add(spSxhool12);
        list3.add(spSxhool13);
        list3.add(spSxhool14);
        list3.add(spSxhool15);
        list3.add(spSxhool16);
        list3.add(spSxhool17);
        list3.add(spSxhool18);
        list3.add(spSxhool19);

        setColorNoSelect();

        setColor();
        if(list1.size()>0)list1.get(0).setBackgroundColor(getResources().getColor(R.color.sanye));
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.sp_school_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.sp_school_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.sp_school_1:
                setColor();
                spSxhool1.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.sp_school_2:
                setColor();
                spSxhool2.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.sp_school_3:
                setColor();
                spSxhool3.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            case R.id.sp_school_offer_contract:
                intent = new Intent(this, ContractExtension.class);
                startActivity(intent);
                break;
        }
    }

    void setColorNoSelect() {
        int i = 0;
        for (TextView tw : list3) {
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

    void setColor()
    {
        int i = 0;
        for(TextView ll : list1)
        {
            if(i%2 == 0 )ll.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else ll.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));;
            i++;
        }
    }


}

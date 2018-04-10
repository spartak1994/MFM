package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutSponsor extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;

    TextView aboutSponsor1;
    TextView aboutSponsor2;
    TextView aboutSponsor3;
    TextView aboutSponsor4;
    TextView aboutSponsor5;
    TextView aboutSponsor6;
    TextView aboutSponsor7;
    TextView aboutSponsor8;
    TextView aboutSponsor9;
    TextView aboutSponsor10;

    ArrayList<TextView> list1;
    ArrayList<TextView> list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_sponsor);

        back_btn = (Button)findViewById(R.id.ab_spons_back_btn);
        home_btn = (Button)findViewById(R.id.ab_spons_home_btn);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);

        aboutSponsor1 = (TextView)findViewById(R.id.about_spons_1);
        aboutSponsor2 = (TextView)findViewById(R.id.about_spons_2);
        aboutSponsor3 = (TextView)findViewById(R.id.about_spons_3);
        aboutSponsor4 = (TextView)findViewById(R.id.about_spons_4);
        aboutSponsor5 = (TextView)findViewById(R.id.about_spons_5);
        aboutSponsor6 = (TextView)findViewById(R.id.about_spons_6);
        aboutSponsor7 = (TextView)findViewById(R.id.about_spons_7);
        aboutSponsor8 = (TextView)findViewById(R.id.about_spons_8);
        aboutSponsor9 = (TextView)findViewById(R.id.about_spons_9);
        aboutSponsor10 = (TextView)findViewById(R.id.about_spons_10);


        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        list1.add(aboutSponsor1);
        list1.add(aboutSponsor2);
        list1.add(aboutSponsor3);
        list1.add(aboutSponsor4);
        list1.add(aboutSponsor5);

        list2.add(aboutSponsor6);
        list2.add(aboutSponsor7);
        list2.add(aboutSponsor8);
        list2.add(aboutSponsor9);
        list2.add(aboutSponsor10);

        setColor();

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.ab_spons_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.ab_spons_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;

        }
    }

    void setColor()
    {
        int i = 0;
        for(TextView tw : list1)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list2)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }
    }

}

package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SovetDirectorov extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;

    TextView sov_dir1;
    TextView sov_dir2;
    TextView sov_dir3;
    TextView sov_dir4;
    TextView sov_dir5;
    TextView sov_dir6;
    TextView sov_dir7;
    TextView sov_dir8;
    TextView sov_dir9;
    TextView sov_dir10;

    ArrayList<TextView> list1;
    ArrayList<TextView> list2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sovet_directorov);

        back_btn = (Button)findViewById(R.id.sovet_dir_back_btn);
        home_btn = (Button)findViewById(R.id.sovet_dir_home_btn);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);


        sov_dir1 = (TextView)findViewById(R.id.sov_dir_1);
        sov_dir2 = (TextView)findViewById(R.id.sov_dir_2);
        sov_dir3 = (TextView)findViewById(R.id.sov_dir3);
        sov_dir4 = (TextView)findViewById(R.id.sov_dir_4);
        sov_dir5 = (TextView)findViewById(R.id.sov_dir_5);
        sov_dir6 = (TextView)findViewById(R.id.sov_dir_6);
        sov_dir7 = (TextView)findViewById(R.id.sov_dir_7);
        sov_dir8 = (TextView)findViewById(R.id.sov_dir_8);
        sov_dir9 = (TextView)findViewById(R.id.sov_dir_9);
        sov_dir10 = (TextView)findViewById(R.id.sov_dir_10);

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        list1.add(sov_dir1);
        list1.add(sov_dir2);
        list1.add(sov_dir3);
        list1.add(sov_dir4);
        list1.add(sov_dir5);

        list2.add(sov_dir6);
        list2.add(sov_dir7);
        list2.add(sov_dir8);
        list2.add(sov_dir9);
        list2.add(sov_dir10);

        setColor();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.sovet_dir_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.sovet_dir_home_btn:
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

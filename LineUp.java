package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class LineUp extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;

    Button lineup_btn_left;
    Button lineup_btn_right;

    TextView lineUp;

    ArrayList<String> list;

    int lineUp_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_up);

        back_btn = (Button)findViewById(R.id.lineup_back_btn);
        home_btn = (Button)findViewById(R.id.lineup_home_btn);
        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);

        list = new ArrayList<>();
        list.add("4-4-2");
        list.add("4-5-1");
        list.add("4-3-3");
        list.add("3-4-3");
        list.add("3-5-2");
        list.add("3-6-1");
        list.add("5-3-2");
        list.add("5-4-1");
        list.add("4-1-3-1");
        list.add("4-2-3-1");

        lineUp = (TextView)findViewById(R.id.lineup_tv_lineup);
        lineUp.setText(list.get(0));
        lineUp_index = 0;

        lineup_btn_left = (Button)findViewById(R.id.lineup_btn_left);
        lineup_btn_right = (Button)findViewById(R.id.lineup_btn_right);

        lineup_btn_left.setOnClickListener(this);
        lineup_btn_right.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.lineup_back_btn:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.lineup_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.lineup_btn_left:
                lineUp_index--;
                if(lineUp_index<0)lineUp_index = list.size()-1;
                lineUp.setText(list.get(lineUp_index));
                break;
            case R.id.lineup_btn_right:
                lineUp_index++;
                if(lineUp_index>list.size()-1)lineUp_index = 0;
                lineUp.setText(list.get(lineUp_index));
                break;
        }
    }
}

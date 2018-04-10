package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button new_game_btn;
    Button load_game_btn;
    Button exit_btn;

    int anInt;

    ArrayList<Integer> colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_game_btn = (Button) findViewById(R.id.new_game_btn);
        load_game_btn = (Button) findViewById(R.id.load_game_btn);
        exit_btn = (Button) findViewById(R.id.exit_btn);

        new_game_btn.setOnClickListener(this);
        load_game_btn.setOnClickListener(this);
        exit_btn.setOnClickListener(this);

        colors = new ArrayList<>();


        colors.add(Color.CYAN);
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);
        colors.add(Color.DKGRAY);
        colors.add(Color.GRAY);
        colors.add(Color.GREEN);
        colors.add(Color.LTGRAY);
        colors.add(Color.MAGENTA);
        colors.add(Color.RED);
        colors.add(Color.TRANSPARENT);
        colors.add(Color.YELLOW);
        colors.add(335626);
        colors.add(Color.rgb(102,150,30));
        colors.add(Color.rgb(50,150,30));
        colors.add(Color.rgb(50,200,30));
        colors.add(Color.rgb(75,180,30));
        colors.add(Color.rgb(75,150,40));


        anInt = 0;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.new_game_btn:
                intent = new Intent(this, SignUp.class);
                startActivity(intent);
                break;
            case R.id.load_game_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.exit_btn:
                //intent.putExtra("alignment", Gravity.RIGHT);
                //Toast.makeText(this, "Дурак", Toast.LENGTH_SHORT).show();
                //finish();
                if(anInt>=colors.size()-1)anInt =0;
                setColors(anInt);
                anInt++;
                break;
        }
        //setResult(RESULT_OK, intent);
        //finish();
    }


    void setColors(int i)
    {
        new_game_btn.setBackgroundColor(colors.get(i));
        load_game_btn.setBackgroundColor(colors.get(i));
        exit_btn.setBackgroundColor(colors.get(i));
    }
}

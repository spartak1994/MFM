package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Contracts extends AppCompatActivity implements View.OnClickListener {
    Button contracts_back_btn;
    Button contracts_home_btn;
    Button contracts_offer_btn;

    LinearLayout linLayout;
    ArrayList<Player> list;
    int selected;
    int index;
    int color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contracts2);

        contracts_back_btn = (Button) findViewById(R.id.contracts_back_btn);
        contracts_home_btn = (Button) findViewById(R.id.contracts_home_btn);
        contracts_offer_btn = (Button) findViewById(R.id.contracts_offer_btn);

        contracts_back_btn.setOnClickListener(this);
        contracts_home_btn.setOnClickListener(this);
        contracts_offer_btn.setOnClickListener(this);

        linLayout = (LinearLayout)findViewById(R.id.contracts2_ll);
        linLayout.setOnClickListener(this);

        color = 0;
        selected = 0;
        index = 0;

        list = new ArrayList<>();
        list.add(new Player("ВР","Селихов А.", 57 , 100 , "10,1 m" ));
        list.add(new Player("ПЗ","Ещенко А.", 32 , 100, "10,1 m" ));
        list.add(new Player("ЦЗ","Таски С.", 5 , 100, "10,1 m" ));
        list.add(new Player("ЦЗ","Джикия Г.", 14 , 100, "10,1 m"));
        list.add(new Player("ЛЗ","Комбаров Д.", 23 , 100, "10,1 m"));
        list.add(new Player("ЦП","Глушаков Д.", 8 , 100, "10,1 m" ));
        list.add(new Player("ЦП","Фернандо", 11 , 100, "10,1 m" ));
        list.add(new Player("ЦАП","Попов И.", 71 , 100, "10,1 m" ));
        list.add(new Player("ЛФД","Промес К.", 10 , 100, "10,1 m" ));
        list.add(new Player("ПФД","Мельгарехо Л.", 25 , 100, "10,1 m" ));
        list.add(new Player("ЦФ","Адриано Л.", 12 , 100 , "10,1 m"));
        list.add(new Player("ВР","Ребров А.", 32 , 100 , "10,1 m"));
        list.add(new Player("ЦЗ","Кутепов И.", 29 , 100 , "10,1 m"));
        list.add(new Player("ЦЗ","Бокетти С.", 16 , 100 , "10,1 m"));
        list.add(new Player("ПЗ","Петкович М.", 3 , 100 , "10,1 m"));
        list.add(new Player("ЛЗ","Тигиев Г.", 17 , 100 , "10,1 m"));
        list.add(new Player("ЦП","Пашалич М.", 50 , 100, "10,1 m"));
        list.add(new Player("ЛП","Самедов А.", 19 , 100, "10,1 m"));
        list.add(new Player("ЦАП","Джано", 7 , 100 , "10,1 m"));
        list.add(new Player("ОПЗ","Тимофеев А.", 40 , 100, "10,1 m"));
        list.add(new Player("ЦФ","Зе Луиш", 9 , 100 , "10,1 m"));
        list.add(new Player("ЛФД","Педро Роша", 99 , 100 , "10,1 m"));
        list.add(new Player("ЦП","Зобнин Р.", 47 , 100 , "10,1 m"));
        list.add(new Player("ПП","Бакаев З.", 78 , 100 , "10,1 m"));
        RefreshSquad();

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.contracts_back_btn:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.contracts_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.contracts_offer_btn:
                intent = new Intent(this,ContractExtension.class);
                startActivity(intent);
                break;
            default:
                switch ((int)v.getTag()) {
                    case 1000:
                        //Toast.makeText(this,"Это заголовок", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        //Toast.makeText(this,"Это состав", Toast.LENGTH_SHORT).show();
                        setColors();
                        setColor((int)v.getTag());

                }






        }
    }

    void AddTitle()
    {
        LayoutInflater ltInflater = getLayoutInflater();
        if(true)
        {
            //Log.d("myLogs", "i = " + i);
            color++;

            View item = ltInflater.inflate(R.layout.item_contracts, linLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.item_contr_tvPos);
            tvPos.setText("Поз");
            TextView tvName = (TextView) item.findViewById(R.id.item_contr_tvName);
            tvName.setText("Имя");
            TextView tvMoral = (TextView) item.findViewById(R.id.item_contr_tvMoral);
            tvMoral.setText("Мор");
            TextView tvAge = (TextView) item.findViewById(R.id.item_contr_tvAge);
            tvAge.setText("Возр");
            TextView tvPrice = (TextView) item.findViewById(R.id.item_contr_tvPrice);
            tvPrice.setText("Цена");


            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            item.setTag(1000);
            item.setOnClickListener(this);
            linLayout.addView(item);
            index++;
        }
    }

    void AddNewPlayer(Player player)
    {


        LayoutInflater ltInflater = getLayoutInflater();
        if(true)
        {
            //Log.d("myLogs", "i = " + i);
            color++;
            View item = ltInflater.inflate(R.layout.item_contracts, linLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.item_contr_tvPos);
            tvPos.setText(player.position);
            TextView tvName = (TextView) item.findViewById(R.id.item_contr_tvName);
            tvName.setText(player.name);
            TextView tvMoral = (TextView) item.findViewById(R.id.item_contr_tvMoral);
            tvMoral.setText(String.valueOf(player.moral));
            TextView tvAge = (TextView) item.findViewById(R.id.item_contr_tvAge);
            tvAge.setText(String.valueOf(player.age));
            TextView tvPrice = (TextView) item.findViewById(R.id.item_contr_tvPrice);
            tvPrice.setText(String.valueOf(player.price));

            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
//            if(player.position.equals("ВР"))item.setBackgroundColor(getResources().getColor(R.color.goalKeepers));
//            if(player.position.equals("ЛЗ") || player.position.equals("ЦЗ") || player.position.equals("ПЗ"))
//                item.setBackgroundColor(getResources().getColor(R.color.defenders));
//            if(player.position.equals("ЦП") || player.position.equals("ОПЗ")|| player.position.equals("ЛП")|| player.position.equals("ПП")|| player.position.equals("ЦАП"))
//                item.setBackgroundColor(getResources().getColor(R.color.midldeffenders));
//            if(player.position.equals("ЦФ")|| player.position.equals("ЛФД")|| player.position.equals("ПФД"))
//                item.setBackgroundColor(getResources().getColor(R.color.forwards));

            item.setOnClickListener(this);

            item.setTag(index);

            linLayout.addView(item);
            index++;
        }
    }


    void RefreshSquad()
    {
        linLayout.removeAllViews();
        color = 0;
        index = 0;
        AddTitle();
        for(Player player : list)
        {
            AddNewPlayer(player);
        }

    }

    void setColors()
    {
        //Toast.makeText(this,"Охуеть", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,String.valueOf(linLayout.getChildCount()), Toast.LENGTH_SHORT).show();
        color = 0;
        for(int i = 0; i < linLayout.getChildCount(); i++)
        {
            if(color%2 == 0)linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
        }
    }

    void setColor(int position)
    {
        linLayout.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.sanye));
    }

    public class Player
    {
        String position;
        String name;
        int moral;
        int age;
        String price;

        Player(String pos, String name, int mor, int age, String price)
        {
            this.position = pos;
            this.name = name;
            this.moral = mor;
            this.age = age;
            this.price = price;
        }
    }



}

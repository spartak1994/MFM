package ru.pabloidoid.mfm;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.IntegerRes;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class TransfersSearchResults extends AppCompatActivity implements View.OnClickListener{
    Button btn_request;
    Button btn_back;
    Button btn_home;

    LinearLayout linearLayout;

    View.OnClickListener OnSelectPlayer = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setColors();
            v.setBackgroundColor(getResources().getColor(R.color.sanye));
        }
    };


    ArrayList<Player> players = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers_result);

        btn_back = (Button)findViewById(R.id.tr_result_btn_back);
        btn_home = (Button)findViewById(R.id.tr_result_btn_home);
        btn_request = (Button)findViewById(R.id.tr_result_btn_request);

        btn_back.setOnClickListener(this);
        btn_home.setOnClickListener(this);
        btn_request.setOnClickListener(this);


        linearLayout = (LinearLayout)findViewById(R.id.tr_result_ll);

        Random random = new Random();

        players.add(new Player("ВР","Селихов А.","Спартак", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Лунев А.","Зенит", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Ребров А.","Спартак", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Довбня А.","СКА Хабаровск", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Песьяков С.","Ростов", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Джанаев С.","Рубин", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Гильерме М.","Локомотив", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));;
        players.add(new Player("ВР","Лодыгин Ю.","Зенит", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Акинфеев И.","ЦСКА", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Максименко А.","Спартак", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Шунин А.","Динамо", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Синицин А.","Краснодар", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Нарубин С.","Амкар", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Куртуа Т.","Челси", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Тер-Штеген М.","Барселона", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Буфффон Д.","Ювентус", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Де Хэа Д.","Манчестер Юнайтед", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Эдерсон","Манчестер Сити", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Миньоле.С","Ливерпуль", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Доннарума Д.","Милан", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Чех П.","Арсенал", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));
        players.add(new Player("ВР","Льорис У.","Тоттентхэм", Math.abs(random.nextInt()%24)+16, Math.abs(random.nextInt()%79)+20, ((int)(random.nextDouble() *745))/10.0 + 0.5));



        for(Player p:players)
        {
            LayoutInflater ltInflater = getLayoutInflater();
            View item = ltInflater.inflate(R.layout.item_transfers_search_results,linearLayout,false);
            ((TextView)item.findViewById(R.id.item_tr_result_pos)).setText(p.pos);
            ((TextView)item.findViewById(R.id.item_tr_result_name)).setText(p.name);
            ((TextView)item.findViewById(R.id.item_tr_result_club)).setBackground(getResources().getDrawable(R.drawable.bayern));
            ((TextView)item.findViewById(R.id.item_tr_result_age)).setText(String.valueOf(p.age));
            ((TextView)item.findViewById(R.id.item_tr_result_skill)).setText(String.valueOf(p.skill));
            ((TextView)item.findViewById(R.id.item_tr_result_price)).setText(String.valueOf(p.price));
            item.setOnClickListener(OnSelectPlayer);
            item.setTag(linearLayout.getChildCount());
            linearLayout.addView(item);

        }

        setColors();

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.tr_result_btn_request:
                //intent = new Intent(this, MainGameMenu.class);
                //startActivity(intent);
                break;
            case R.id.tr_result_btn_back:
                intent = new Intent(this, TransferSearch.class);
                startActivity(intent);
                break;
            case R.id.tr_result_btn_home:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
        }
    }



    class Player
    {
        String pos;
        String name;
        String club;
        int age;
        int skill;
        double price;

        Player(String pos, String name, String club, int age, int skill, double price)
        {
            this.pos = pos;
            this.name = name;
            this.club = club;
            this.age = age;
            this.skill = skill;
            this.price = price;
        }


    }


    void setColors()
    {
        int color = 0;
        for(int i= 1; i<linearLayout.getChildCount(); i++)
        {
            if(color%2 == 0) linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            color++;
        }
    }
}

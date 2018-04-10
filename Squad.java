package ru.pabloidoid.mfm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Squad extends AppCompatActivity implements View.OnClickListener {
    Button back_btn;
    Button home_btn;
    Button change_btn;


    RelativeLayout relativeLayout;

    TextView textViewOut;
    TextView textViewIn;



    LinearLayout linLayout;
    ArrayList<Player> list;
    int color;
    int viewIndex;

    boolean OutSelected = false;
    boolean InSelected = false;
    int selected1 = -1;
    int selected2 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad);

        back_btn = (Button)findViewById(R.id.squad_back_btn);
        home_btn = (Button)findViewById(R.id.squad_home_btn);
        change_btn = (Button)findViewById(R.id.squad_btn_chahge);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);
        change_btn.setOnClickListener(this);

        color = 0;
        viewIndex =0;

        relativeLayout = (RelativeLayout)findViewById(R.id.squad_rl_change);
        relativeLayout.setVisibility(View.INVISIBLE);

        textViewOut = (TextView)findViewById(R.id.squad_tv_out);
        textViewIn = (TextView)findViewById(R.id.squad_tv_in);


        linLayout = (LinearLayout) findViewById(R.id.squad_ll);
        linLayout.setOnClickListener(this);

        //AddTitle();
        list = new ArrayList<>();
        list.add(new Player("ВР","Селихов А.", 57 , 100 , 85 , 78));
        list.add(new Player("ПЗ","Ещенко А.", 32 , 100 , 85 , 78));
        list.add(new Player("ЦЗ","Таски С.", 5 , 100 , 85 , 78));
        list.add(new Player("ЦЗ","Джикия Г.", 14 , 100 , 85 , 78));
        list.add(new Player("ЛЗ","Комбаров Д.", 23 , 100 , 85 , 78));
        list.add(new Player("ЦП","Глушаков Д.", 8 , 100 , 85 , 78));
        list.add(new Player("ЦП","Фернандо", 11 , 100 , 85 , 78));
        list.add(new Player("ЦАП","Попов И.", 71 , 100 , 85 , 78));
        list.add(new Player("ЛФД","Промес К.", 10 , 100 , 85 , 78));
        list.add(new Player("ПФД","Мельгарехо Л.", 25 , 100 , 85 , 78));
        list.add(new Player("ЦФ","Адриано Л.", 12 , 100 , 85 , 78));
        list.add(new Player("ВР","Ребров А.", 32 , 100 , 85 , 78));
        list.add(new Player("ЦЗ","Кутепов И.", 29 , 100 , 85 , 78));
        list.add(new Player("ЦЗ","Бокетти С.", 16 , 100 , 85 , 78));
        list.add(new Player("ПЗ","Петкович М.", 3 , 100 , 85 , 78));
        list.add(new Player("ЛЗ","Тигиев Г.", 17 , 100 , 85 , 78));
        list.add(new Player("ЦП","Пашалич М.", 50 , 100 , 85 , 78));
        list.add(new Player("ЛП","Самедов А.", 19 , 100 , 85 , 78));
        list.add(new Player("ЦАП","Джано", 7 , 100 , 85 , 78));
        list.add(new Player("ОПЗ","Тимофеев А.", 40 , 100 , 85 , 78));
        list.add(new Player("ЦФ","Зе Луиш", 9 , 100 , 85 , 78));
        list.add(new Player("ЛФД","Педро Роша", 99 , 100 , 85 , 78));
        list.add(new Player("ЦП","Зобнин Р.", 47 , 100 , 85 , 78));
        list.add(new Player("ПП","Бакаев З.", 78 , 100 , 85 , 78));

//        for(Player player : list)
//        {
//            AddNewPlayer(player);
//        }
        //AddNew();
        RefreshSquad();



    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.squad_back_btn:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.squad_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.squad_btn_chahge:
                if(InSelected&&OutSelected)
                {
                    swapPlayers(selected1,selected2);

                    Animation anim1 = null;
                    anim1 = AnimationUtils.loadAnimation(this, R.anim.my_trans1);
                    Animation anim2 = null;
                    anim2 = AnimationUtils.loadAnimation(this, R.anim.my_trans2);
                    anim1.setAnimationListener(animation1Listener);

                    textViewOut.startAnimation(anim2);
                    textViewIn.startAnimation(anim1);

                    RefreshSquad();

                    //textViewIn.setText(list.get(selected2).name);
                    //textViewOut.setText(list.get(selected1).name);
                    selected1 = -1;
                    selected2 = -1;
//                    try {
//                        Thread.currentThread().sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    OutSelected = false;
                    InSelected = false;
                    change_btn.setPressed(true);
                    //relativeLayout.setVisibility(View.INVISIBLE);

                }
                break;
            default:
                switch ((int)v.getTag())
                {
                    case 1000:
                        //Toast.makeText(this,"Это заголовок", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        //Toast.makeText(this,"Это состав", Toast.LENGTH_SHORT).show();
                        if(!OutSelected)
                        {
                            setColors();
                            v.setBackgroundColor(getResources().getColor(R.color.sanye));
                            selected1 = (int) v.getTag();
                            OutSelected = true;
                            relativeLayout.setVisibility(View.VISIBLE);
                            textViewOut.setText(list.get(selected1).name);
                            textViewIn.setText("");
                        }
                        else
                        {
                            if(selected1 == (int)v.getTag())
                            {
                                selected1 = -1;
                                setColors();
                                textViewOut.setText("");
                                textViewIn.setText("");
                                InSelected = false;
                                relativeLayout.setVisibility(View.INVISIBLE);
                                OutSelected = false;
                            }
                            else
                            {

                                if(!InSelected)
                                {
                                    InSelected = true;
                                    selected2 = (int) v.getTag();
                                    textViewIn.setText(list.get(selected2).name);

                                    v.setBackgroundColor(getResources().getColor(R.color.sanye));
                                    change_btn.setEnabled(true);
                                }
                                else
                                {
                                    if((int)v.getTag()==selected2)
                                    {
                                        InSelected = false;
                                        setColor(selected2);
                                        selected2 = -1;
                                        textViewIn.setText("");

                                    }
                                }

                            }

                        }
                }

        }




    }

    Animation.AnimationListener animation1Listener = new Animation.AnimationListener() {

        @Override
        public void onAnimationEnd(Animation arg0) {
            //textViewIn.setText(list.get(selected2).name);
            //textViewOut.setText(list.get(selected1).name);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            change_btn.setEnabled(false);
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onAnimationStart(Animation animation) {
            // TODO Auto-generated method stub
        }
    };




    void AddNewPlayer(Player player)
    {


        LayoutInflater ltInflater = getLayoutInflater();
        if(true)
        {
            //Log.d("myLogs", "i = " + i);
            color++;
            View item = ltInflater.inflate(R.layout.item_squad, linLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.tvPos);
            tvPos.setText(player.position);
            TextView tvName = (TextView) item.findViewById(R.id.tvName);
            tvName.setText(player.name);
            TextView tvNum = (TextView) item.findViewById(R.id.tvNum);
            tvNum.setText(String.valueOf(player.number));
            TextView tvPhisics = (TextView) item.findViewById(R.id.tvPhisics);
            tvPhisics.setText(String.valueOf(player.phisics));
            TextView tvMoral = (TextView) item.findViewById(R.id.tvMoral);
            tvMoral.setText(String.valueOf(player.moral));
            TextView tvMast = (TextView) item.findViewById(R.id.tvMast);
            tvMast.setText(String.valueOf(player.skill));


            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            //if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            //else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            if(player.position.equals("ВР"))item.setBackgroundColor(getResources().getColor(R.color.goalKeepers));
            if(player.position.equals("ЛЗ") || player.position.equals("ЦЗ") || player.position.equals("ПЗ"))
                item.setBackgroundColor(getResources().getColor(R.color.defenders));
            if(player.position.equals("ЦП") || player.position.equals("ОПЗ")|| player.position.equals("ЛП")|| player.position.equals("ПП")|| player.position.equals("ЦАП"))
                item.setBackgroundColor(getResources().getColor(R.color.midldeffenders));
            if(player.position.equals("ЦФ")|| player.position.equals("ЛФД")|| player.position.equals("ПФД"))
                item.setBackgroundColor(getResources().getColor(R.color.forwards));

            item.setOnClickListener(this);

            item.setTag(viewIndex);
            viewIndex++;



            linLayout.addView(item);
        }
    }

    void AddTitle()
    {
        LayoutInflater ltInflater = getLayoutInflater();
        if(true)
        {
            //Log.d("myLogs", "i = " + i);
            color++;

            View item = ltInflater.inflate(R.layout.item_squad, linLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.tvPos);
            tvPos.setText("Поз");
            TextView tvName = (TextView) item.findViewById(R.id.tvName);
            tvName.setText("Имя");
            TextView tvNum = (TextView) item.findViewById(R.id.tvNum);
            tvNum.setText("№");
            TextView tvPhisics = (TextView) item.findViewById(R.id.tvPhisics);
            tvPhisics.setText("Физ");
            TextView tvMoral = (TextView) item.findViewById(R.id.tvMoral);
            tvMoral.setText("Мор");
            TextView tvMast = (TextView) item.findViewById(R.id.tvMast);
            tvMast.setText("Маст");

            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            item.setTag(1000);
            item.setOnClickListener(this);
            linLayout.addView(item);
        }
    }


    void swapPlayers(int i ,int j)
    {
        if(i >= list.size() || j >= list.size())
        {
            return;
        }

        Player player = list.get(i);
        list.set(i, list.get(j));
        list.set(j, player);
    }

    void setColors()
    {
        //Toast.makeText(this,"Охуеть", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,String.valueOf(linLayout.getChildCount()), Toast.LENGTH_SHORT).show();
        for(int i = 1; i < linLayout.getChildCount(); i++)
        {
            if(list.size()-1<i) break;
            //Toast.makeText(this,String.valueOf(list.get(i).number), Toast.LENGTH_SHORT).show();
            //Toast.makeText(this,"перед свичем", Toast.LENGTH_SHORT).show();
            switch (list.get(i-1).position)
            {
                case "ВР":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.goalKeepers));
                    //Toast.makeText(this,list.get(i-1).name, Toast.LENGTH_SHORT).show();
                    break;
                case "ЦЗ":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.defenders));
                    break;
                case "ЛЗ":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.defenders));
                    break;
                case "ПЗ":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.defenders));
                    break;
                case "ЦП":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    break;
                case "ОПЗ":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    break;
                case "ЦАП":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    break;
                case "ЛП":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    break;
                case "ПП":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    break;
                case "ЦФ":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forwards));
                    break;
                case "ЛФД":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forwards));
                    break;
                case "ПФД":
                    linLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forwards));
                    break;
                default:
                    //Toast.makeText(this,list.get(i).name, Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }


    void setColor(int position)
    {
        //Toast.makeText(this,list.get(position).name, Toast.LENGTH_SHORT).show();
        switch (list.get(position).position)
        {
            case "ВР":
                linLayout.getChildAt(position+1).setBackgroundColor(Color.RED);
                //Toast.makeText(this,list.get(position).name, Toast.LENGTH_SHORT).show();
                break;
            case "ЦЗ":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.defenders));
                break;
            case "ЛЗ":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.defenders));
                break;
            case "ПЗ":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.defenders));
                break;
            case "ЦП":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                break;
            case "ОПЗ":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                break;
            case "ЦАП":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                break;
            case "ЛП":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                break;
            case "ПП":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                break;
            case "ЦФ":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.forwards));
                break;
            case "ЛФД":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.forwards));
                break;
            case "ПФД":
                linLayout.getChildAt(position+1).setBackgroundColor(getResources().getColor(R.color.forwards));
                break;
            default:
                //Toast.makeText(this,list.get(i).name, Toast.LENGTH_SHORT).show();
                break;

        }
    }


    void RefreshSquad()
    {
        linLayout.removeAllViews();
        viewIndex = 0;
        AddTitle();
        for(Player player : list)
        {
            AddNewPlayer(player);
        }

    }


    public static class Player
    {
        String position;
        String name;
        int number;
        int phisics;
        int moral;
        int skill;

        Player(String pos, String name, int num, int phis, int mor, int skill)
        {
            this.position = pos;
            this.name = name;
            this.number = num;
            this.phisics = phis;
            this.moral = mor;
            this.skill = skill;
        }



    }
}

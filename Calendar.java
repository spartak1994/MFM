package ru.pabloidoid.mfm;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Calendar extends AppCompatActivity implements View.OnClickListener {
    Button back_btn;
    Button home_btn;
    Button btnLeft;
    Button btnRight;

    TextView textView;

    RelativeLayout rl_1;
    RelativeLayout rl_2;
    RelativeLayout rl_3;
    RelativeLayout rl_4;
    RelativeLayout rl_5;
    RelativeLayout rl_6;
    RelativeLayout rl_7;
    RelativeLayout rl_8;
    RelativeLayout rl_9;
    RelativeLayout rl_10;
    RelativeLayout rl_11;
    RelativeLayout rl_12;
    RelativeLayout rl_13;
    RelativeLayout rl_14;
    RelativeLayout rl_15;
    RelativeLayout rl_16;
    RelativeLayout rl_17;
    RelativeLayout rl_18;
    RelativeLayout rl_19;
    RelativeLayout rl_20;
    RelativeLayout rl_21;
    RelativeLayout rl_22;
    RelativeLayout rl_23;
    RelativeLayout rl_24;
    RelativeLayout rl_25;
    RelativeLayout rl_26;
    RelativeLayout rl_27;
    RelativeLayout rl_28;
    RelativeLayout rl_29;
    RelativeLayout rl_30;
    RelativeLayout rl_31;
    RelativeLayout rl_32;
    RelativeLayout rl_33;
    RelativeLayout rl_34;
    RelativeLayout rl_35;
    RelativeLayout rl_36;
    RelativeLayout rl_37;
    RelativeLayout rl_38;
    RelativeLayout rl_39;
    RelativeLayout rl_40;
    RelativeLayout rl_41;
    RelativeLayout rl_42;

    RelativeLayout rl_info;
    RelativeLayout rl_info_training;
    RelativeLayout rl_info_add_training;

    ArrayList<RelativeLayout> list;

    ArrayList<Integer> months;
    ArrayList<Integer> years;
    ArrayList<String> monthsNames;


    int monthNamesIndex;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        back_btn = (Button)findViewById(R.id.calendar_back_btn);
        home_btn = (Button)findViewById(R.id.calendar_home_btn);
        btnLeft = (Button)findViewById(R.id.calendar_btn_left);
        btnRight = (Button)findViewById(R.id.calendar_btn_right);

        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);
        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);

        textView = (TextView)findViewById(R.id.calendar_tvText);

        list = new ArrayList<>();
        months = new ArrayList<>();
        years = new ArrayList<>();
        monthsNames = new ArrayList<>();
        months.add(7);
        months.add(8);
        months.add(9);
        months.add(10);
        months.add(11);
        months.add(0);
        months.add(1);
        months.add(2);
        months.add(3);
        months.add(4);

        years.add(2018);
        years.add(2018);
        years.add(2018);
        years.add(2018);
        years.add(2018);
        years.add(2019);
        years.add(2019);
        years.add(2019);
        years.add(2019);
        years.add(2019);

        monthsNames.add("Август 2018");
        monthsNames.add("Сентабрь 2018");
        monthsNames.add("Октябрь 2018");
        monthsNames.add("Ноябрь 2018");
        monthsNames.add("Декабрь 2018");
        monthsNames.add("Январь 2019");
        monthsNames.add("Февраль 2019");
        monthsNames.add("Март 2019");
        monthsNames.add("Апрель 2019");
        monthsNames.add("Май 2019");

        monthNamesIndex = 0;
        textView.setText(monthsNames.get(monthNamesIndex));

        rl_1 = (RelativeLayout)findViewById(R.id.calender_rl_1);
        rl_2 = (RelativeLayout)findViewById(R.id.calender_rl_2);
        rl_3 = (RelativeLayout)findViewById(R.id.calender_rl_3);
        rl_4 = (RelativeLayout)findViewById(R.id.calender_rl_4);
        rl_5 = (RelativeLayout)findViewById(R.id.calender_rl_5);
        rl_6 = (RelativeLayout)findViewById(R.id.calender_rl_6);
        rl_7 = (RelativeLayout)findViewById(R.id.calender_rl_7);
        rl_8 = (RelativeLayout)findViewById(R.id.calender_rl_8);
        rl_9 = (RelativeLayout)findViewById(R.id.calender_rl_9);
        rl_10 = (RelativeLayout)findViewById(R.id.calender_rl_10);
        rl_11 = (RelativeLayout)findViewById(R.id.calender_rl_11);
        rl_12 = (RelativeLayout)findViewById(R.id.calender_rl_12);
        rl_13 = (RelativeLayout)findViewById(R.id.calender_rl_13);
        rl_14 = (RelativeLayout)findViewById(R.id.calender_rl_14);
        rl_15 = (RelativeLayout)findViewById(R.id.calender_rl_15);
        rl_16 = (RelativeLayout)findViewById(R.id.calender_rl_16);
        rl_17 = (RelativeLayout)findViewById(R.id.calender_rl_17);
        rl_18 = (RelativeLayout)findViewById(R.id.calender_rl_18);
        rl_19 = (RelativeLayout)findViewById(R.id.calender_rl_19);
        rl_20 = (RelativeLayout)findViewById(R.id.calender_rl_20);
        rl_21 = (RelativeLayout)findViewById(R.id.calender_rl_21);
        rl_22 = (RelativeLayout)findViewById(R.id.calender_rl_22);
        rl_23 = (RelativeLayout)findViewById(R.id.calender_rl_23);
        rl_24 = (RelativeLayout)findViewById(R.id.calender_rl_24);
        rl_25 = (RelativeLayout)findViewById(R.id.calender_rl_25);
        rl_26 = (RelativeLayout)findViewById(R.id.calender_rl_26);
        rl_27 = (RelativeLayout)findViewById(R.id.calender_rl_27);
        rl_28 = (RelativeLayout)findViewById(R.id.calender_rl_28);
        rl_29 = (RelativeLayout)findViewById(R.id.calender_rl_29);
        rl_30 = (RelativeLayout)findViewById(R.id.calender_rl_30);
        rl_31 = (RelativeLayout)findViewById(R.id.calender_rl_31);
        rl_32 = (RelativeLayout)findViewById(R.id.calender_rl_32);
        rl_33 = (RelativeLayout)findViewById(R.id.calender_rl_33);
        rl_34 = (RelativeLayout)findViewById(R.id.calender_rl_34);
        rl_35 = (RelativeLayout)findViewById(R.id.calender_rl_35);
        rl_36 = (RelativeLayout)findViewById(R.id.calender_rl_36);
        rl_37 = (RelativeLayout)findViewById(R.id.calender_rl_37);
        rl_38 = (RelativeLayout)findViewById(R.id.calender_rl_38);
        rl_39 = (RelativeLayout)findViewById(R.id.calender_rl_39);
        rl_40 = (RelativeLayout)findViewById(R.id.calender_rl_40);
        rl_41 = (RelativeLayout)findViewById(R.id.calender_rl_41);
        rl_42 = (RelativeLayout)findViewById(R.id.calender_rl_42);

        rl_info = (RelativeLayout)findViewById(R.id.calendar_rl_info);
        rl_info_training = (RelativeLayout)findViewById(R.id.calendar_rl_info_training);
        rl_info_add_training = (RelativeLayout)findViewById(R.id.calendar_rl_info__add_training);
        rl_info.setOnClickListener(this);
        rl_info_training.setOnClickListener(this);
        rl_info_add_training.setOnClickListener(this);
        //rl_info.setVisibility(View.INVISIBLE);

        list.add(rl_1);
        list.add(rl_2);
        list.add(rl_3);
        list.add(rl_4);
        list.add(rl_5);
        list.add(rl_6);
        list.add(rl_7);
        list.add(rl_8);
        list.add(rl_9);
        list.add(rl_10);
        list.add(rl_11);
        list.add(rl_12);
        list.add(rl_13);
        list.add(rl_14);
        list.add(rl_15);
        list.add(rl_16);
        list.add(rl_17);
        list.add(rl_18);
        list.add(rl_19);
        list.add(rl_20);
        list.add(rl_21);
        list.add(rl_22);
        list.add(rl_23);
        list.add(rl_24);
        list.add(rl_25);
        list.add(rl_26);
        list.add(rl_27);
        list.add(rl_28);
        list.add(rl_29);
        list.add(rl_30);
        list.add(rl_31);
        list.add(rl_32);
        list.add(rl_33);
        list.add(rl_34);
        list.add(rl_35);
        list.add(rl_36);
        list.add(rl_37);
        list.add(rl_38);
        list.add(rl_39);
        list.add(rl_40);
        list.add(rl_41);
        list.add(rl_42);




        if(false)
        {
            LayoutInflater ltInflater = getLayoutInflater();
            View item = ltInflater.inflate(R.layout.calendar_day_event,rl_info,false);
            TextView tvDay = (TextView) item.findViewById(R.id.cal_day_event_day);
            TextView tvOpponent = (TextView) item.findViewById(R.id.cal_day_event_opponent);
            TextView tvField = (TextView) item.findViewById(R.id.cal_day_event_field);
            TextView tvEvent = (TextView) item.findViewById(R.id.cal_day_event_event);
            TextView tvTO = (TextView) item.findViewById(R.id.cal_day_event_to);
            TextView tvTournament = (TextView) item.findViewById(R.id.cal_day_event_tournament);
            rl_info.addView(item);

        }

        if(true)
        {
            LayoutInflater ltInflater = getLayoutInflater();
            View item = ltInflater.inflate(R.layout.calendar_day_event_add_training,rl_info_add_training,false);
            rl_info_add_training.addView(item);
        }

        for(int  i = 0; i< list.size(); i++)
        {
            LayoutInflater ltInflater = getLayoutInflater();

            View item = ltInflater.inflate(R.layout.item_day2,list.get(i),false);
            TextView tvDay = (TextView) item.findViewById(R.id.item_day_day);
            tvDay.setText("");
            TextView tvDayIndex = (TextView) item.findViewById(R.id.item_day_index);
            tvDayIndex.setText(String.valueOf(i+1));
            tvDayIndex.setTextColor(getResources().getColor(R.color.tansfers_day));
            TextView tvTournament = (TextView) item.findViewById(R.id.item_clubs_tourn_wins_club);
            tvTournament.setText("");
            TextView tvField = (TextView) item.findViewById(R.id.item_day_field);
            tvField.setText("");
            ImageView club = (ImageView) item.findViewById(R.id.item_day_image);
            //club.setBackground(getResources().getDrawable(R.drawable.fscm));



            //item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            //if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            //else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            //item.setTag(1000);
            //item.setOnClickListener(this);
            list.get(i).addView(item);
            list.get(i).setOnClickListener(this);
        }


        int day = getFirrstDayOfMonth(2020, 1);
        int count = getCountDayOfMonth(2020, 1);


        //Toast.makeText(this,"Первый день это " + String.valueOf(day), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,"Всего дней  " + String.valueOf(count), Toast.LENGTH_SHORT).show();
        //CreateCalendar(2018,1);
        CreateCalendar(years.get(monthNamesIndex),months.get(monthNamesIndex));
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.calendar_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.calendar_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.calendar_btn_left:
                monthNamesIndex--;
                if(monthNamesIndex<0)monthNamesIndex=monthsNames.size()-1;
                textView.setText(monthsNames.get(monthNamesIndex));
                CreateCalendar(years.get(monthNamesIndex),months.get(monthNamesIndex));
                break;
            case R.id.calendar_btn_right:
                monthNamesIndex++;
                if(monthNamesIndex>=monthsNames.size())monthNamesIndex = 0;
                textView.setText(monthsNames.get(monthNamesIndex));
                CreateCalendar(years.get(monthNamesIndex),months.get(monthNamesIndex));
                break;
            case R.id.calendar_rl_info:
                rl_info.setVisibility(View.INVISIBLE);

                break;
            case R.id.calendar_rl_info_training:
                rl_info_training.setVisibility(View.INVISIBLE);
                break;
            case R.id.calendar_rl_info__add_training:
                rl_info_add_training.setVisibility(View.INVISIBLE);
                break;
            default:
                String s = "";
                //v.setVisibility(View.INVISIBLE);
                rl_info_add_training.setVisibility(View.VISIBLE);
                s+=((TextView)((RelativeLayout)v).getChildAt(0).findViewById(R.id.item_day_index)).getText();
                Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
                break;

        }
    }




    int getFirrstDayOfMonth(int year, int month)
    {
        //воскресенье 1, понедельник 2
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(year, month, 1);
        int dayOfWeek = c.get(java.util.Calendar.DAY_OF_WEEK);
        dayOfWeek-=2;
        if(dayOfWeek==-1)dayOfWeek=6;
        //воскресенье 6, понедельник 0
        return dayOfWeek;
    }

    int getDayOfWeek(int year, int month, int day)
    {
        //воскресенье 1, понедельник 2
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(year, month, day);
        int dayOfWeek = c.get(java.util.Calendar.DAY_OF_WEEK);
        dayOfWeek-=2;
        if(dayOfWeek==-1)dayOfWeek=6;
        //воскресенье 6, понедельник 0
        return dayOfWeek;
    }

    int getCountDayOfMonth(int year, int month)
    {
        //январь 0, февраль 1
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(year, month, 1);
        int count = c.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        return count;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    void CreateCalendar(int year, int month)
    {
        int day = getFirrstDayOfMonth(year, month);
        int count = getCountDayOfMonth(year, month);
        for(int i = 0; i<list.size(); i++)
        {
            list.get(i).setVisibility(View.INVISIBLE);

        }


        for(int i = (0+day); i<count + day; i++)
        {
            list.get(i).setVisibility(View.VISIBLE);
            list.get(i).setBackgroundColor(getResources().getColor(R.color.calendar_day));
            //list.get(i).getChildAt(0).findViewById(R.id.item_day_index).setBackgroundColor(Color.RED);
            ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_index)).setText(String.valueOf(i+1-day));
            //Toast.makeText(this,list.get(i).getChildCount(), Toast.LENGTH_SHORT).show();
            //((TextView)list.get(i).findViewById(R.id.item_day_index)).setText(String.valueOf(i+1));
            int current_day = getDayOfWeek(year, month , i+1-day);
            switch (current_day)
            {
                case 0:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Пн");
                    break;
                case 1:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Вт");
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_clubs_tourn_wins_club)).setText("ЛЧ");
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setText("Гос");
                    ((ImageView)list.get(i).getChildAt(0).findViewById(R.id.item_day_image)).setBackground(getResources().getDrawable(R.drawable.bayern));
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_tournament)).setBackgroundColor(getResources().getColor(R.color.goalKeepers));
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setBackgroundColor(getResources().getColor(R.color.goalKeepers));
                    list.get(i).setBackgroundColor(getResources().getColor(R.color.LCH));
                    break;
                case 2:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Ср");
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_clubs_tourn_wins_club)).setText("Тр");
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_tournament)).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_tournament)).setWidth(500);
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setText("Нап");
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setBackgroundColor(getResources().getColor(R.color.midldeffenders));
                    list.get(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
                    break;
                case 3:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Чт");
                    ((ImageView)list.get(i).getChildAt(0).findViewById(R.id.item_day_image)).setBackground(getResources().getDrawable(R.drawable.madrid));
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_clubs_tourn_wins_club)).setText("ЛЕ");
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setText("Гос");
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_tournament)).setBackgroundColor(getResources().getColor(R.color.LE));
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setBackgroundColor(getResources().getColor(R.color.LE));
                    list.get(i).setBackgroundColor(getResources().getColor(R.color.LE));
                    break;
                case 4:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Пт");
                    break;
                case 5:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Сб");
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_clubs_tourn_wins_club)).setText("ЧР");
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_tournament)).setBackgroundColor(getResources().getColor(R.color.forwards));
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setText("Дом");
                    ((ImageView)list.get(i).getChildAt(0).findViewById(R.id.item_day_image)).setBackground(getResources().getDrawable(R.drawable.fscm));
                    //((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_field)).setBackgroundColor(getResources().getColor(R.color.forwards));
                    list.get(i).setBackgroundColor(getResources().getColor(R.color.Champ));

                    break;
                case 6:
                    ((TextView)list.get(i).getChildAt(0).findViewById(R.id.item_day_day)).setText("Вс");
                    break;

            }
        }

    }




}

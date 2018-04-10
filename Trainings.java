package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Trainings extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;
    Button calend_btn;

    Spinner coach_spinner;
    Spinner type_training_spinner;
    Spinner day_of_week_spinner;
    Spinner  training_start_day;
    Spinner  training_end_day;
    Spinner  training_start_month;
    Spinner  training_end_month;
    Spinner  training_start_year;
    Spinner  training_end_year;


    String[] to_coach_spinner = {"Тренер нападающих ", "Тренер полузащитников           ","Тренер защитников   ","Тренер вратарей  "};
    String[] to_type_training = {"Голевая тренеровка    ","Владение ","Силовая тренировка   "};
    String[] to_training_start_day = {" 1    "," 2    "," 3    "," 4    "," 5    "," 6    "," 7    "," 8    "," 9    ","10    ","11    ","12    ","13    ","14    ","15    ","16    ","17    ","18    ","19    ","20    ","21    ","22    ","23    ","24    ","25    ","26    ","27    ","28    ","29    ","30    ","31    "};
    String[] to_training_end_day = {" 1    "," 2    "," 3    "," 4    "," 5    "," 6    "," 7    "," 8    "," 9    ","10    ","11    ","12    ","13    ","14    ","15    ","16    ","17    ","18    ","19    ","20    ","21    ","22    ","23    ","24    ","25    ","26    ","27    ","28    ","29    ","30    ","31    "};
    String[] to_training_start_month = {"01    ","02    ","03    ","04    ","05    ","06    ","07    ","08    ","09    ","10    ","11    ","12    "};
    String[] to_training_end_month = {"01    ","02    ","03    ","04    ","05    ","06    ","07    ","08    ","09    ","10    ","11    ","12    "};
    String[] to_training_start_year = {"2017    ","2018    "};
    String[] to_training_end_year = {"2017    ","2018    "};
    String[] to_day_of_week = {"Понедельник", "Вторник","Среда", "Четверг","Пятница","Суббота", "Воскресенье"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainings);

        for(int i = 0; i< to_training_start_day.length; i++)
        {
            to_training_start_day[i] += "       " ;
            to_training_end_day[i] += "       " ;

        }

        for(int i = 0; i< to_training_start_month.length; i++)
        {
            to_training_start_month[i] += "       " ;
            to_training_end_month[i] += "       " ;

        }

        for(int i = 0; i < to_training_start_year.length; i++)
        {
            to_training_start_year[i] += "       " ;
            to_training_end_year[i] += "       " ;

        }

        for(int i = 0; i<to_day_of_week.length; i++)
        {
            to_day_of_week[i]+= "     ";

        }


        back_btn = (Button)findViewById(R.id.trainings_back_btn);
        home_btn = (Button)findViewById(R.id.trainings_home_btn);
        calend_btn = (Button)findViewById(R.id.training_calend_btn);
        coach_spinner = (Spinner)findViewById(R.id.coach_spinner);
        type_training_spinner =(Spinner)findViewById(R.id.type_training_spinner);
        training_start_day = (Spinner)findViewById(R.id.training_start_date_day);
        training_end_day = (Spinner)findViewById(R.id.training_end_date_day);
        training_start_month = (Spinner)findViewById(R.id.training_start_date_month);
        training_end_month = (Spinner)findViewById(R.id.training_end_date_month);
        training_start_year = (Spinner)findViewById(R.id.training_start_date_year);
        training_end_year = (Spinner)findViewById(R.id.training_end_date_year);
        day_of_week_spinner = (Spinner)findViewById(R.id.day_of_week_spinner);



        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);
        calend_btn.setOnClickListener(this);


        // адаптер
        final ArrayAdapter<String> adapter_coach = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_coach_spinner);//ArrayAdapter.createFromResource(this, R.array.choose_type_coach, R.layout.my_spinner_item);
        adapter_coach.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // адаптер
        final ArrayAdapter<String> adapter_type_training = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_type_training);
        adapter_type_training.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_start_day = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_start_day);
        adapter_training_start_day.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_end_day = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_end_day);
        adapter_training_end_day.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_end_month = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_end_month);
        adapter_training_end_month.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_end_year = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_end_year);
        adapter_training_end_year.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_start_month = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_start_month);
        adapter_training_start_month.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_training_start_year = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_training_start_year);
        adapter_training_start_year.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> adapter_day_of_week_spinner = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_day_of_week);
        adapter_day_of_week_spinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        coach_spinner.setAdapter(adapter_coach);
        coach_spinner.setSelection(0);
        coach_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {
                    //to_type_training = null;
                    to_type_training[0] = "Голевая тренеровка        ";
                    to_type_training[1] ="Владение мячем";
                    to_type_training[2] ="Силовые упражнения         ";
                    //adapter_type_training.clear();
                    adapter_type_training.notifyDataSetChanged();
                    type_training_spinner.setSelection(0);


                }
                if(position == 1)
                {
                    to_type_training[0] = "Владение мячем";
                    to_type_training[1] = "Тренировка паса";
                    to_type_training[2] = "Силовые упражнения         ";
                    adapter_type_training.notifyDataSetChanged();
                    type_training_spinner.setSelection(0);

                }
                if(position == 2)
                {
                    to_type_training[0] = "Отбор мяча";
                    to_type_training[1] ="Владение мячем";
                    to_type_training[2] = "Силовые упражнения         ";
                    adapter_type_training.notifyDataSetChanged();
                    type_training_spinner.setSelection(0);

                }
                if(position == 3)
                {
                    to_type_training[0] = "Тренировка реацкии       ";
                    to_type_training[1] ="Выбор позиции    ";
                    to_type_training[2] = "Силовые упражнения         ";
                    adapter_type_training.notifyDataSetChanged();
                    type_training_spinner.setSelection(0);

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        type_training_spinner.setAdapter(adapter_type_training);
        type_training_spinner.setSelection(0);
        type_training_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


        training_start_day.setAdapter(adapter_training_start_day);
        training_start_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


        training_end_day.setAdapter(adapter_training_end_day);
        training_end_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


        training_start_month.setAdapter(adapter_training_start_month);
        training_start_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        training_end_month.setAdapter(adapter_training_end_month);
        training_end_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        training_start_year.setAdapter(adapter_training_start_year);
        training_start_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        training_end_year.setAdapter(adapter_training_end_year);
        training_end_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


        day_of_week_spinner.setAdapter(adapter_day_of_week_spinner);
        day_of_week_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {

                }
                if(position == 1)
                {

                }
                if(position == 2)
                {

                }
                if(position == 3)
                {

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.trainings_back_btn:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.trainings_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.training_calend_btn:
                intent = new Intent(this, Calendar.class);
                startActivity(intent);
                break;

        }
    }
}

package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectClub extends AppCompatActivity implements View.OnClickListener{
    TextView select_club_club;
    Button select_club_club_btn_left;
    Button select_club_club_btn_right;

    TextView select_club_country;
    Button select_club_country_btn_left;
    Button select_club_country_btn_right;

    Button sign_Contract_with_club;

    ArrayList <String> country ;
    ArrayList <String> russian;
    ArrayList <String> english;
    ArrayList <String> french;
    ArrayList <String> italian;
    ArrayList <String> german;
    ArrayList <String> spanish;

    ArrayList <String> temp;

    int country_index = 0;
    int club_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_club);
        sign_Contract_with_club = (Button)findViewById(R.id.btn_select_club_sign_contract);
        sign_Contract_with_club.setOnClickListener(this);

        select_club_club_btn_left = (Button)findViewById(R.id.select_club_club_btn_left);
        select_club_club_btn_right = (Button)findViewById(R.id.select_club_club_btn_right);
        select_club_country_btn_right = (Button)findViewById(R.id.select_club_country_btn_right);
        select_club_country_btn_left = (Button)findViewById(R.id.select_club_country_btn_left);

        select_club_club_btn_left.setOnClickListener(this);
        select_club_club_btn_right.setOnClickListener(this);
        select_club_country_btn_right.setOnClickListener(this);
        select_club_country_btn_left.setOnClickListener(this);


        select_club_club = (TextView)findViewById(R.id.select_club_club);
        select_club_country = (TextView)findViewById(R.id.select_club_country);

        country = new ArrayList<>();
        russian = new ArrayList<>();
        english = new ArrayList<>();
        french = new ArrayList<>();
        italian = new ArrayList<>();
        german = new ArrayList<>();
        spanish = new ArrayList<>();
        temp = new ArrayList<>();


        country.add("Россия");
        country.add("Англия");
        country.add("Франция");
        country.add("Испания");
        country.add("Германия");
        country.add("Италия");


        russian.add("Спартак Москва");
        russian.add("Зенит СпБ");
        russian.add("ЦСКА Москва");
        russian.add("Краснодар");
        russian.add("Ростов");
        russian.add("Ахмат Грозный");
        russian.add("Рубин Казань");
        russian.add("СКА-Хабаровск");
        russian.add("Динамо Москва");
        russian.add("Урал Екатеренбург");
        russian.add("Арсенал Тула");
        russian.add("Локомотив Москва");
        russian.add("Анжи Махачкала");
        russian.add("Амкар Пермь");
        russian.add("Тосно");
        russian.add("Уфа");

        english.add("Ливерпуль");
        english.add("Челси");
        english.add("Манчестер Юнайтед");
        english.add("Манчестер Сити");
        english.add("Тоттентхэм");
        english.add("Арсенал");
        english.add("Лестер");
        english.add("Суонси");
        english.add("Бернли");
        english.add("Брайтон");
        english.add("Хаддерсфилд");
        english.add("Саутгемптон");
        english.add("Сток Сити");
        english.add("Вест Хэм");
        english.add("Эвертон");
        english.add("Ньюкасл");
        english.add("Кристал Пелас");
        english.add("Уотфорд");
        english.add("Вест Бромвич");
        english.add("Борнмут");

        spanish.add("Барселона");
        spanish.add("Aтлетик Бильбао");
        spanish.add("Атлетико Мадрид");
        spanish.add("Реал Мадрид");
        spanish.add("Вильяреал");
        spanish.add("Валенсия");
        spanish.add("Севилья");
        spanish.add("Депортиво");
        spanish.add("Лас-Пальмас");
        spanish.add("Жирона");
        spanish.add("Реал Сосьедад");
        spanish.add("Леванте");
        spanish.add("Алавес");
        spanish.add("Сельта");
        spanish.add("Реал Бетис");
        spanish.add("Эйбар");
        spanish.add("Леванте");
        spanish.add("Леванте");
        spanish.add("Леванте");
        spanish.add("Леванте");

        french.add("ПСЖ");
        french.add("Монако");
        french.add("Лион");
        french.add("Марсель");
        french.add("Нант");
        french.add("Ницца");
        french.add("Бордо");
        french.add("Лиль");
        french.add("Сент-Этьен");
        french.add("Монпелье");
        french.add("");


        italian.add("Ювентус");//
        italian.add("Наполи");//
        italian.add("Милан");//
        italian.add("Интер");//
        italian.add("Лацио");//
        italian.add("Рома");//
        italian.add("Сампдория");//
        italian.add("Дженоа");
        italian.add("Удинезе");//
        italian.add("Болонья");
        italian.add("Фиорентина");//
        italian.add("СПАЛ");//
        italian.add("Бенневито");//
        italian.add("Кротоне");
        italian.add("Сасуолло");
        italian.add("Аталанта");//
        italian.add("Торино");//
        italian.add("Верона");//
        italian.add("");
        italian.add("");

        german.add("Бавария");
        german.add("Боруссия Дортмунд");
        german.add("Боррусия Менхенгладбах");
        german.add("РБ Лейпциг");
        german.add("Шальке 04");
        german.add("Штутгарт");
        german.add("Гамбург");
        german.add("Вердер");
        german.add("Герта");
        german.add("Кельн");
        german.add("Хоффенхайм");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");
        german.add("");


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_select_club_sign_contract:
                intent = new Intent(this, SelectSponsor.class);
                startActivity(intent);
                break;
            case R.id.select_club_country_btn_right:
                country_index++;
                if(country_index>=country.size()-1) country_index=0;
                select_club_country.setText(country.get(country_index));
                updateClubAfterChangeCountry();
                break;
            case R.id.select_club_country_btn_left:
                country_index--;
                if(country_index<0) country_index=country.size()-1;
                select_club_country.setText(country.get(country_index));
                updateClubAfterChangeCountry();
                break;
            case R.id.select_club_club_btn_left:
                club_index--;
                temp = getCountry(select_club_country.getText().toString());
                if(club_index < 0) club_index = getCountry(select_club_country.getText().toString()).size()-1;
                select_club_club.setText(temp.get(club_index));
                break;
            case R.id.select_club_club_btn_right:
                club_index++;
                //Toast.makeText(this, select_club_country.getText().toString(), Toast.LENGTH_SHORT).show();
                temp = getCountry(select_club_country.getText().toString());
                if(club_index >= temp.size()-1) club_index = 0;
                //Toast.makeText(this, String.valueOf(temp.size()), Toast.LENGTH_SHORT).show();
                select_club_club.setText(temp.get(club_index));

                break;
            default:
                break;
        }
    }



    void updateClubAfterChangeCountry()
    {
        if(country.get(country_index)== "Россия")
        {
            select_club_club.setText(russian.get(0));
            club_index = 0;
        }
        if(country.get(country_index)== "Англия")
        {
            select_club_club.setText(english.get(0));
            club_index = 0;
        }
        if(country.get(country_index)== "Германия")
        {
            select_club_club.setText(german.get(0));
            club_index = 0;
        }
        if(country.get(country_index)== "Италия")
        {
            select_club_club.setText(italian.get(0));
            club_index = 0;
        }
        if(country.get(country_index)== "Франция")
        {
            select_club_club.setText(french.get(0));
            club_index = 0;
        }
        if(country.get(country_index)== "Испания")
        {
            select_club_club.setText(spanish.get(0));
            club_index = 0;
        }
    }

    ArrayList<String> getCountry(String text)
    {
        ArrayList <String>temp = new ArrayList<>();
        if(text.equals("Россия"))
        {
            //Toast.makeText(this, "Ща верну Россию", Toast.LENGTH_SHORT).show();
            return russian;
        }
        if(text.equals("Англия"))
        {
            //Toast.makeText(this, "Ща верну Англию", Toast.LENGTH_SHORT).show();
            return english;
        }
        if(text.equals("Италия"))
        {
            //Toast.makeText(this, "Ща верну Италию", Toast.LENGTH_SHORT).show();
            return italian;
        }
        if(text.equals("Германия"))
        {
            //Toast.makeText(this, "Ща верну Германию", Toast.LENGTH_SHORT).show();
            return german;
        }
        if(text.equals("Франция"))
        {
            //Toast.makeText(this, "Ща верну Францию", Toast.LENGTH_SHORT).show();
            return french;
        }

        if(text.equals("Испания"))
        {
            //Toast.makeText(this, "Ща верну Францию", Toast.LENGTH_SHORT).show();
            return spanish;
        }

        Toast.makeText(this, "Ща верну пустой и это плохо", Toast.LENGTH_SHORT).show();

        return temp;
    }



}

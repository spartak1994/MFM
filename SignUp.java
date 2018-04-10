package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    Button sign_up_next;
    EditText sign_up_birthday;
    Spinner sign_up_country;


    String[] to_country = {"Россия", "Белоруссия","Украина", "Казахстан","Азербайджан","Армения", "Грузия", "Узбекистан", "Кыргазстан"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sign_up_next = (Button) findViewById(R.id.sign_up_next);
        sign_up_next.setOnClickListener(this);

        sign_up_birthday = (EditText)findViewById(R.id.sign_up_birthday);
        sign_up_birthday.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                // Прописываем то, что надо выполнить после изменения текста

                if(s.length()==2)s.append("/");
                if(s.length()==5)s.append("/");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


        sign_up_country = (Spinner)findViewById(R.id.sign_up_country);
        // адаптер
        final ArrayAdapter<String> adapter_country = new ArrayAdapter<String>(this, R.layout.my_spinner_item, to_country);//ArrayAdapter.createFromResource(this, R.array.choose_type_coach, R.layout.my_spinner_item);
        adapter_country.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sign_up_country.setAdapter(adapter_country);
        sign_up_country.setSelection(0);
        sign_up_country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
            case R.id.sign_up_next:
                intent = new Intent(this, SelectClub.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

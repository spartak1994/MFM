package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Office extends AppCompatActivity implements View.OnClickListener {
    Button calendar_btn;
    Button control_personal_btn;
    Button sovet_directorov_btn;
    Button financial_prediction_btn;
    Button about_sponsor_btn;
    Button sport_school_btn;
    Button coach_history_btn;
    Button office_back_btn;
    Button office_home_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

         calendar_btn= (Button) findViewById(R.id.calendar_btn);
         control_personal_btn= (Button) findViewById(R.id.control_personal_btn);
         sovet_directorov_btn= (Button) findViewById(R.id.sovet_directorov_btn);
         financial_prediction_btn= (Button) findViewById(R.id.financail_prediction_btn);
         about_sponsor_btn= (Button) findViewById(R.id.about_sponsor_btn);
         sport_school_btn= (Button) findViewById(R.id.spotr_school_btn);
         coach_history_btn= (Button) findViewById(R.id.coach_history_btn);
         office_back_btn= (Button) findViewById(R.id.office_back_btn);
         office_home_btn= (Button) findViewById(R.id.office_home_btn);

        calendar_btn.setOnClickListener(this);
        control_personal_btn.setOnClickListener(this);
        sovet_directorov_btn.setOnClickListener(this);
        financial_prediction_btn.setOnClickListener(this);
        about_sponsor_btn.setOnClickListener(this);
        sport_school_btn.setOnClickListener(this);
        coach_history_btn.setOnClickListener(this);
        office_back_btn.setOnClickListener(this);
        office_home_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.calendar_btn:
                intent = new Intent(this, Calendar.class);
                startActivity(intent);
                break;
            case R.id.control_personal_btn:
                intent = new Intent(this, ControlPersonal.class);
                startActivity(intent);
                break;
            case R.id.sovet_directorov_btn:
                intent = new Intent(this, SovetDirectorov.class);
                startActivity(intent);
                break;
            case R.id.financail_prediction_btn:
                intent = new Intent(this, FinancialPrediction.class);
                startActivity(intent);
                break;
            case R.id.about_sponsor_btn:
                intent = new Intent(this, AboutSponsor.class);
                startActivity(intent);
                break;
            case R.id.spotr_school_btn:
                intent = new Intent(this, SportSchool.class);
                startActivity(intent);
                break;
            case R.id.coach_history_btn:
                intent = new Intent(this, CoachHistory.class);
                startActivity(intent);
                break;
            case R.id.office_back_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.office_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

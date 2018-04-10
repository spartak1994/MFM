package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectSponsor extends AppCompatActivity implements View.OnClickListener {
    Button signSponsor;
    Button selectSponsorBtnRight;
    Button selectSponsorBtnLeft;
    TextView selectSponsorName;

    ArrayList<String> sponsors;

    int sponsorIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sponsor);

        selectSponsorBtnLeft = (Button) findViewById(R.id.select_sponsor_btn_left);
        selectSponsorBtnLeft.setOnClickListener(this);

        selectSponsorBtnRight = (Button) findViewById(R.id.select_sponsor_btn_right);
        selectSponsorBtnRight.setOnClickListener(this);

        selectSponsorName = (TextView)findViewById(R.id.select_sponsor_name);

        signSponsor = (Button) findViewById(R.id.signSponsor_btn);
        signSponsor.setOnClickListener(this);

        sponsorIndex = 0;

        sponsors = new ArrayList<>();
        sponsors.add("Лукойл");
        sponsors.add("Газпром");
        sponsors.add("БК ЛЕОН");
        sponsors.add("КФС");
        sponsors.add("Адидас");
        sponsors.add("ВТБ");
        sponsors.add("РЖД");
        sponsors.add("ВЕГА");
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.signSponsor_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.select_sponsor_btn_left:
                sponsorIndex--;
                if(sponsorIndex<0)sponsorIndex = sponsors.size()-1;
                selectSponsorName.setText(sponsors.get(sponsorIndex));
                break;
            case  R.id.select_sponsor_btn_right:
                sponsorIndex++;
                if(sponsorIndex>sponsors.size()-1)sponsorIndex=0;
                selectSponsorName.setText(sponsors.get(sponsorIndex));
                break;
            default:
                break;
        }
    }
}

package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Tactics extends AppCompatActivity implements View.OnClickListener {
    Button back_btn;
    Button home_btn;
    RadioButton rb_style_deff;
    RadioButton rb_style_norm;
    RadioButton rb_style_attack;
    RadioButton rb_shoots_sometimes;
    RadioButton rb_shoots_often;
    RadioButton rb_shoots_rarely;
    RadioButton rb_pas_short;
    RadioButton rb_pas_long;
    RadioButton rb_pas_mixed;
    RadioButton rb_temp_low;
    RadioButton rb_temp_midle;
    RadioButton rb_temp_high;
    RadioButton rb_otbor_careful;
    RadioButton rb_otbor_normal;
    RadioButton rb_otbor_hard;
    RadioButton rb_attack_direction_flanks;
    RadioButton rb_attack_direction_center;
    RadioButton rb_attack_direction_mixed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tactics);

        back_btn = (Button)findViewById(R.id.tactics_back_btn);
        home_btn = (Button)findViewById(R.id.tactics_home_btn);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);

        rb_style_attack = (RadioButton)findViewById(R.id.tactics_rb_style_attacking);
        rb_style_norm = (RadioButton)findViewById(R.id.tactics_rb_style_neutral);
        rb_style_deff = (RadioButton)findViewById(R.id.tactics_rb_style_defensive);

        rb_shoots_rarely = (RadioButton)findViewById(R.id.tactics_rb_long_shoots_rarely);
        rb_shoots_sometimes = (RadioButton)findViewById(R.id.tactics_rb_long_shoots_sometimes);
        rb_shoots_often = (RadioButton)findViewById(R.id.tactics_rb_long_shoots_often);

        rb_pas_short = (RadioButton)findViewById(R.id.tactics_rb_pas_short);
        rb_pas_mixed = (RadioButton)findViewById(R.id.tactics_rb_pas_mixed);
        rb_pas_long = (RadioButton)findViewById(R.id.tactics_rb_pas_long);

        rb_temp_low = (RadioButton)findViewById(R.id.tactics_rb_temp_low);
        rb_temp_midle = (RadioButton)findViewById(R.id.tactics_rb_temp_middle);
        rb_temp_high = (RadioButton)findViewById(R.id.tactics_rb_temp_high);

        rb_otbor_careful = (RadioButton)findViewById(R.id.tactics_rb_otbor_careful);
        rb_otbor_normal = (RadioButton)findViewById(R.id.tactics_rb_otbor_normal);
        rb_otbor_hard = (RadioButton)findViewById(R.id.tactics_rb_otbor_hard);

        rb_attack_direction_flanks = (RadioButton)findViewById(R.id.tactics_rb_atack_direction_flanks);
        rb_attack_direction_center = (RadioButton)findViewById(R.id.tactics_rb_atack_direction_center);
        rb_attack_direction_mixed = (RadioButton)findViewById(R.id.tactics_rb_atack_direction_mixed);

        rb_style_deff.setOnClickListener(this);
        rb_style_norm.setOnClickListener(this);
        rb_style_attack.setOnClickListener(this);
        rb_shoots_rarely.setOnClickListener(this);
        rb_shoots_sometimes.setOnClickListener(this);
        rb_shoots_often.setOnClickListener(this);
        rb_pas_short.setOnClickListener(this);
        rb_pas_mixed.setOnClickListener(this);
        rb_pas_long.setOnClickListener(this);
        rb_temp_low.setOnClickListener(this);
        rb_temp_midle.setOnClickListener(this);
        rb_temp_high.setOnClickListener(this);
        rb_otbor_careful.setOnClickListener(this);
        rb_otbor_normal.setOnClickListener(this);
        rb_otbor_hard.setOnClickListener(this);
        rb_attack_direction_flanks.setOnClickListener(this);
        rb_attack_direction_mixed.setOnClickListener(this);
        rb_attack_direction_center.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.tactics_back_btn:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.tactics_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.tactics_rb_atack_direction_center:
                rb_attack_direction_center.setChecked(true);
                rb_attack_direction_mixed.setChecked(false);
                rb_attack_direction_flanks.setChecked(false);
                break;
            case R.id.tactics_rb_atack_direction_flanks:
                rb_attack_direction_center.setChecked(false);
                rb_attack_direction_mixed.setChecked(false);
                rb_attack_direction_flanks.setChecked(true);
                break;
            case R.id.tactics_rb_atack_direction_mixed:
                rb_attack_direction_center.setChecked(false);
                rb_attack_direction_mixed.setChecked(true);
                rb_attack_direction_flanks.setChecked(false);
                break;
            case R.id.tactics_rb_pas_long:
                rb_pas_long.setChecked(true);
                rb_pas_mixed.setChecked(false);
                rb_pas_short.setChecked(false);
                break;
            case R.id.tactics_rb_pas_mixed:
                rb_pas_long.setChecked(false);
                rb_pas_mixed.setChecked(true);
                rb_pas_short.setChecked(false);
                break;
            case R.id.tactics_rb_pas_short:
                rb_pas_long.setChecked(false);
                rb_pas_mixed.setChecked(false);
                rb_pas_short.setChecked(true);
                break;
            case R.id.tactics_rb_otbor_careful:
                rb_otbor_hard.setChecked(false);
                rb_otbor_careful.setChecked(true);
                rb_otbor_normal.setChecked(false);
                break;
            case R.id.tactics_rb_otbor_normal:
                rb_otbor_hard.setChecked(false);
                rb_otbor_careful.setChecked(false);
                rb_otbor_normal.setChecked(true);
                break;
            case R.id.tactics_rb_otbor_hard:
                rb_otbor_hard.setChecked(true);
                rb_otbor_careful.setChecked(false);
                rb_otbor_normal.setChecked(false);
                break;
            case R.id.tactics_rb_style_defensive:
                rb_style_attack.setChecked(false);
                rb_style_deff.setChecked(true);
                rb_style_norm.setChecked(false);
                break;
            case R.id.tactics_rb_style_neutral:
                rb_style_attack.setChecked(false);
                rb_style_deff.setChecked(false);
                rb_style_norm.setChecked(true);
                break;
            case R.id.tactics_rb_style_attacking:
                rb_style_attack.setChecked(true);
                rb_style_deff.setChecked(false);
                rb_style_norm.setChecked(false);
                break;
            case R.id.tactics_rb_long_shoots_rarely:
                rb_shoots_rarely.setChecked(true);
                rb_shoots_sometimes.setChecked(false);
                rb_shoots_often.setChecked(false);
                break;
            case R.id.tactics_rb_long_shoots_sometimes:
                rb_shoots_rarely.setChecked(false);
                rb_shoots_sometimes.setChecked(true);
                rb_shoots_often.setChecked(false);
                break;
            case R.id.tactics_rb_long_shoots_often:
                rb_shoots_rarely.setChecked(false);
                rb_shoots_sometimes.setChecked(false);
                rb_shoots_often.setChecked(true);
                break;
            case R.id.tactics_rb_temp_high:
                rb_temp_high.setChecked(true);
                rb_temp_midle.setChecked(false);
                rb_temp_low.setChecked(false);
                break;
            case R.id.tactics_rb_temp_middle:
                rb_temp_high.setChecked(false);
                rb_temp_midle.setChecked(true);
                rb_temp_low.setChecked(false);
                break;
            case R.id.tactics_rb_temp_low:
                rb_temp_high.setChecked(false);
                rb_temp_midle.setChecked(false);
                rb_temp_low.setChecked(true);
                break;


        }
    }
}

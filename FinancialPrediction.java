package ru.pabloidoid.mfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FinancialPrediction extends AppCompatActivity implements View.OnClickListener{
    Button back_btn;
    Button home_btn;
    Button fin_pred_btn_left;
    Button fin_pred_btn_right;

    TextView fin_pred_price;

    ArrayList<String> prices;
    int priceIndex;


    TextView finPred1;
    TextView finPred2;
    TextView finPred3;
    TextView finPred4;
    TextView finPred5;
    TextView finPred6;
    TextView finPred7;
    TextView finPred8;
    TextView finPred9;
    TextView finPred10;
    TextView finPred11;
    TextView finPred12;
    TextView finPred13;
    TextView finPred14;
    TextView finPred15;
    TextView finPred16;

    ArrayList<TextView> list1;
    ArrayList<TextView> list2;
    ArrayList<TextView> list3;
    ArrayList<TextView> list4;
    ArrayList<TextView> list5;
    ArrayList<TextView> list6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_prediction);
        back_btn = (Button)findViewById(R.id.fin_pred_back_btn);
        home_btn = (Button)findViewById(R.id.fin_pred_home_btn);
        fin_pred_btn_left = (Button)findViewById(R.id.financial_prediction_btn_left);
        fin_pred_btn_right = (Button)findViewById(R.id.financial_prediction_btn_right);

        fin_pred_price = (TextView)findViewById(R.id.finncial_prediction_price);

        back_btn.setOnClickListener(this);
        home_btn.setOnClickListener(this);
        fin_pred_btn_left.setOnClickListener(this);
        fin_pred_btn_right.setOnClickListener(this);

        prices = new ArrayList<>();

        priceIndex = 1;

        prices.add("Низкая");
        prices.add("Средняя");
        prices.add("Высокая");

        fin_pred_price.setText(prices.get(priceIndex));


        finPred1 = (TextView)findViewById(R.id.fin_pred_1);
        finPred2 = (TextView)findViewById(R.id.fin_pred_2);
        finPred3 = (TextView)findViewById(R.id.fin_pred_3);
        finPred4 = (TextView)findViewById(R.id.fin_pred_4);
        finPred5 = (TextView)findViewById(R.id.fin_pred_5);
        finPred6 = (TextView)findViewById(R.id.fin_pred_6);
        finPred7 = (TextView)findViewById(R.id.fin_pred_7);
        finPred8 = (TextView)findViewById(R.id.fin_pred_8);
        finPred9 = (TextView)findViewById(R.id.fin_pred_9);
        finPred10 = (TextView)findViewById(R.id.fin_pred_10);
        finPred11 = (TextView)findViewById(R.id.fin_pred_11);
        finPred12 = (TextView)findViewById(R.id.fin_pred_12);
        finPred13 = (TextView)findViewById(R.id.fin_pred_13);
        finPred14 = (TextView)findViewById(R.id.fin_pred_14);
        finPred15 = (TextView)findViewById(R.id.fin_pred_15);
        finPred16 = (TextView)findViewById(R.id.fin_pred_16);



        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();

        list1.add(finPred1);
        list1.add(finPred2);
        list1.add(finPred3);

        list2.add(finPred4);
        list2.add(finPred5);
        list2.add(finPred6);

        list3.add(finPred7);
        list3.add(finPred8);
        list3.add(finPred9);

        list4.add(finPred10);
        list4.add(finPred11);
        list4.add(finPred12);

        list5.add(finPred13);
        list5.add(finPred14);

        list6.add(finPred15);
        list6.add(finPred16);

        setColor();

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.fin_pred_back_btn:
                intent = new Intent(this, Office.class);
                startActivity(intent);
                break;
            case R.id.fin_pred_home_btn:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.financial_prediction_btn_left:
                priceIndex--;
                if(priceIndex<0)priceIndex = prices.size()-1;
                fin_pred_price.setText(prices.get(priceIndex));
                break;
            case R.id.financial_prediction_btn_right:
                priceIndex++;
                if(priceIndex>prices.size()-1)priceIndex = 0;
                fin_pred_price.setText(prices.get(priceIndex));
                break;

        }
    }

    void setColor()
    {
        int i = 0;
        for(TextView tw : list1)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list2)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list3)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list4)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list5)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

        i = 0;

        for(TextView tw : list6)
        {
            if(i%2 == 0) tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else tw.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            i++;
        }

    }
}

package ru.pabloidoid.mfm;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.LabelFormatter;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
//import com.jjoe64.graphview.GraphViewSeries;
//import com.jjoe64.graphview.GraphView.GraphViewData;
//import com.jjoe64.graphview.LineGraphView;

import java.util.ArrayList;

/**
 * Created by user on 25.01.2018.
 */

public class ProspectsPlayers extends AppCompatActivity implements View.OnClickListener {
    Button btn_home;
    Button btn_back;

    LinearLayout linearLayout;
    LinearLayout llGraph;

    ArrayList<Squad.Player> list;
    int color;




    //@TargetApi(Build.VERSION_CODES.M)
    //@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prospects_payers);

        color =0;



        btn_back = (Button)findViewById(R.id.prospects_payers_btn_back);
        btn_home = (Button)findViewById(R.id.prospects_payers_btn_home);

        btn_back.setOnClickListener(this);
        btn_home.setOnClickListener(this);

        linearLayout = (LinearLayout)findViewById(R.id.prospects_players_ll_squad);
        linearLayout.setOnClickListener(this);
        llGraph = (LinearLayout)findViewById(R.id.prospects_players_ll_graph);

//        // Линейный график
//        GraphViewSeries exampleSeries = new GraphViewSeries(
//                new GraphViewData[] { new GraphViewData(1, 3.0d),
//                        new GraphViewData(2, 1.5d), new GraphViewData(3, 2.5d),
//                        new GraphViewData(4, 1.0d), new GraphViewData(5, 1.3d) });
//
//        GraphView graphView = new LineGraphView(this, "График каких-то данных");
//        graphView.addSeries(exampleSeries);
//
//        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
//        layout.addView(graphView);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        //GraphView graph = new LineGraphView(this, "График каких-то данных");;
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(2017, 77),
                new DataPoint(2018, 79),
                //new DataPoint(1.25, 80),
                //new DataPoint(1.5, 81),
                //new DataPoint(1.75, 82),
                new DataPoint(2019, 83),
                new DataPoint(2020, 83),
                new DataPoint(2021, 82)
        });


        series.setColor(Color.YELLOW);
        series.setThickness(4);



        //series2.setColor(Color.BLUE);
        //series.setBackgroundColor(Color.RED);
        //graph.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
        //graph.setBackgroundColor(getResources().getColor(R.color.sanye));
        //graph.setBackgroundColor(Color.WHITE);
        graph.addSeries(series);
        //graph.setTitleColor(Color.RED);
        //graph.getSecondScale().mVerticalAxisTitleColor = Color.RED;
        //graph.getSecondScale().setVerticalAxisTitleColor(Color.RED);
        //graph.addSeries(series2);
        //graph.getGridLabelRenderer().setGridColor(getResources().getColor(R.color.forAllocationTables2));
        graph.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.BOTH);
        graph.getGridLabelRenderer().setHighlightZeroLines(false);
        graph.getGridLabelRenderer().setHumanRounding(true);
        //graph.getGridLabelRenderer().setHorizontalAxisTitle("Сезон");
        graph.getGridLabelRenderer().setHorizontalAxisTitleColor(Color.WHITE);
        graph.getGridLabelRenderer().setHorizontalAxisTitleTextSize(20);

        graph.getGridLabelRenderer().setLabelFormatter(new LabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                String s = "";
                //if(value==2017.0)return s;
                //if(value==2021.0)return s;
                if(!isValueX) s = String.valueOf((int)value);
                else
                {
                    int a = (int) (value%100);
                    int b = a+1;
                    s+=String.valueOf(a);
                    s+="/";
                    s+=String.valueOf(b);
                }
                return s;
            }

            @Override
            public void setViewport(Viewport viewport) {

            }
        });

        graph.getGridLabelRenderer().setPadding(25);
        graph.getGridLabelRenderer().setLabelHorizontalHeight(12);
        graph.getGridLabelRenderer().setLabelVerticalWidth(10);


        //graph.getGridLabelRenderer().setVerticalAxisTitle("Мастерство");
        graph.getGridLabelRenderer().setVerticalAxisTitleColor(Color.WHITE);
        graph.getGridLabelRenderer().setVerticalAxisTitleTextSize(20);
        //graph.getLegendRenderer().setTextColor(Color.RED);
        //graph.getLegendRenderer().setVisible(true);
        //graph.getLegendRenderer().setBackgroundColor(Color.RED);
        //graph.getGridLabelRenderer().setTextSize(50);
        graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.WHITE);
        graph.getGridLabelRenderer().setVerticalLabelsColor(Color.WHITE);

        AddTitle();
        list = new ArrayList<>();
        list.add(new Squad.Player("ВР","Селихов А.", 57 , 100 , 85 , 78));
        list.add(new Squad.Player("ПЗ","Ещенко А.", 32 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦЗ","Таски С.", 5 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦЗ","Джикия Г.", 14 , 100 , 85 , 78));
        list.add(new Squad.Player("ЛЗ","Комбаров Д.", 23 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦП","Глушаков Д.", 8 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦП","Фернандо", 11 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦАП","Попов И.", 71 , 100 , 85 , 78));
        list.add(new Squad.Player("ЛФД","Промес К.", 10 , 100 , 85 , 78));
        list.add(new Squad.Player("ПФД","Мельгарехо Л.", 25 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦФ","Адриано Л.", 12 , 100 , 85 , 78));
        list.add(new Squad.Player("ВР","Ребров А.", 32 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦЗ","Кутепов И.", 29 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦЗ","Бокетти С.", 16 , 100 , 85 , 78));
        list.add(new Squad.Player("ПЗ","Петкович М.", 3 , 100 , 85 , 78));
        list.add(new Squad.Player("ЛЗ","Тигиев Г.", 17 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦП","Пашалич М.", 50 , 100 , 85 , 78));
        list.add(new Squad.Player("ЛП","Самедов А.", 19 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦАП","Джано", 7 , 100 , 85 , 78));
        list.add(new Squad.Player("ОПЗ","Тимофеев А.", 40 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦФ","Зе Луиш", 9 , 100 , 85 , 78));
        list.add(new Squad.Player("ЛФД","Педро Роша", 99 , 100 , 85 , 78));
        list.add(new Squad.Player("ЦП","Зобнин Р.", 47 , 100 , 85 , 78));
        list.add(new Squad.Player("ПП","Бакаев З.", 78 , 100 , 85 , 78));
        AddPlayers();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.prospects_payers_btn_back:
                intent = new Intent(this, Team_control.class);
                startActivity(intent);
                break;
            case R.id.prospects_payers_btn_home:
                intent = new Intent(this, MainGameMenu.class);
                startActivity(intent);
                break;
            case R.id.prospects_players_ll_squad:
                //setColor();
                //v.setBackgroundColor(getResources().getColor(R.color.sanye));
                break;
            default:
                setColor();
                v.setBackgroundColor(getResources().getColor(R.color.sanye));
        }
    }

    void AddTitle()
    {
        LayoutInflater ltInflater = getLayoutInflater();

        View item = ltInflater.inflate(R.layout.item_prospects_handler, linearLayout, false);
        TextView tvPos = (TextView) item.findViewById(R.id.tvPos);
        tvPos.setText("Поз");
        TextView tvName = (TextView) item.findViewById(R.id.tvName);
        tvName.setText("Имя");
        TextView tvCountry = (TextView) item.findViewById(R.id.tvCountry);
        tvCountry.setText("Страна");
        TextView tvAge = (TextView) item.findViewById(R.id.tvAge);
        tvAge.setText("Возр");
        TextView tvMast = (TextView) item.findViewById(R.id.tvMast);
        tvMast.setText("Маст");

        item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
        if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
        else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));

        color++;
        item.setTag(1000);
        //item.setOnClickListener(this);
        linearLayout.addView(item);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    void AddPlayers()
    {
        boolean isFirst = true;
        for(Squad.Player p:list)
        {
            LayoutInflater ltInflater = getLayoutInflater();

            View item = ltInflater.inflate(R.layout.item_prospects, linearLayout, false);
            TextView tvPos = (TextView) item.findViewById(R.id.tvPos);
            tvPos.setText(p.position);
            TextView tvName = (TextView) item.findViewById(R.id.tvName);
            tvName.setText(p.name);
            ImageView tvCountry = (ImageView) item.findViewById(R.id.ivCountry);
            tvCountry.setBackground(getResources().getDrawable(R.drawable.russia));
            TextView tvAge = (TextView) item.findViewById(R.id.tvAge);
            tvAge.setText("23");
            TextView tvMast = (TextView) item.findViewById(R.id.tvMast);
            tvMast.setText(String.valueOf(p.skill));

            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            if(color%2 == 0)item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else item.setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            color++;
            if(isFirst)
            {
                item.setBackgroundColor(getResources().getColor(R.color.sanye));
                isFirst = false;
            }
            item.setTag(1000);
            item.setOnClickListener(this);
            linearLayout.addView(item);
        }

    }


    void setColor()
    {
        color = 0;
        for(int i = 0; i<linearLayout.getChildCount(); i++ )
        {
            if(color%2 == 0)linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables1));
            else linearLayout.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.forAllocationTables2));
            color++;
        }

    }

}

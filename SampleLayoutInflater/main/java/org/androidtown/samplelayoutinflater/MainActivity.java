package org.androidtown.samplelayoutinflater;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        inflateLayout();
    }

    private void inflateLayout() {

        LinearLayout contentsLayout = (LinearLayout) findViewById(R.id.contentsLayout);

        //인플레이션 수행
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, contentsLayout, true);

        //새로 추가된 레이아웃 안에 들어있는 버튼 객체 참조
        Button btnSelect = (Button) findViewById(R.id.selectButton);
        final CheckBox allDay = (CheckBox) findViewById(R.id.allDay);

        btnSelect.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(allDay.isChecked()){
                    allDay.setChecked(false);
                } else {
                    allDay.setChecked(true);
                }
            }
        });
    }


}



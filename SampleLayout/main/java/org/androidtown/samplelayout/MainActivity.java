package org.androidtown.samplelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button02);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "두번째 버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
                setContentView(R.layout.table_layout);
            }
        });
    }

    public void onButton1Clicked(View v){
        setContentView(R.layout.linear_layout);

        Button button1 = (Button) findViewById(R.id.button01);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onButton3Clicked(View v){
        setContentView(R.layout.table_layout2);
    }
}

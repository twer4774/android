package org.androidtown.samplelayoutinflater;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by NCL on 2016-01-06.
 */
public class SampleInflationErrorActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        setContentView(R.layout.activity_main);
    }
}

package org.androidtown.sampleflagintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by NCL on 2016-01-11.
 */
public class AnotherActivity extends Activity{
    Button backBtn;
    TextView txtMsg;
    String msg;

    int startCount;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);

        txtMsg = (TextView) findViewById(R.id.txtMsg);
        backBtn = (Button) findViewById(R.id.backBtn);

        //버튼을 눌렀을 때 메인 액티비티를 다시 한번 띄워줍니다.
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //객체를 만들고 메인 액티비티를 지정합니다.
                Intent newIntent = new Intent(getBaseContext(), MainActivity.class);
                newIntent.putExtra("startCount", startCount);
                newIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);

                //메인 액티비티를 다시 띄웁니다.
                startActivity(newIntent);
            }
        });

        //전달받은 인텐트를 처리합니다.
        processIntent();
    }
    //전달받은 인텐트를 처리하는 메소드 정의
    private void processIntent(){
        //인텐트 객체를 확인합니다.
        Intent receivedIntent = getIntent();
        startCount = receivedIntent.getIntExtra("startCount", 0);

        //텍스트뷰에 startCount 값을 보여줍니다.
        msg = "전달된 startCount : " + startCount;
        txtMsg.setText(msg);

    }
}

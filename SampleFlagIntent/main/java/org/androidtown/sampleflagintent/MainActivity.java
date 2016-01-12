package org.androidtown.sampleflagintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtMsg;
    String msg;

    public static final int REQUEST_CODE_ANOTHER = 1001;

    //시작횟수
    public static int startCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = (TextView)findViewById(R.id.txtMsg);

        //전달받은 인텐트를 처리합니다.
        processIntent();
    }

    public void onButton1Clicked(View v){
        startCount++;

        //인텐트 객체를 만듭니다.
        Intent intent = new Intent(getBaseContext(), AnotherActivity.class);

        //startCount 값을 넣어줍니다.
        intent.putExtra("startCount", startCount);

        //액티비티를 띄워주도록 startActivityForResult() 메소드를 호출합니다.
        startActivityForResult(intent, REQUEST_CODE_ANOTHER);
    }

    @Override //onCreate는 한번만 호출 되므로 getIntent()를 사용할수 없다. 따라서 onNewIntent로 재정의 해줘야 액티비티를 불러올 수 있다.(Flag와 관련된 내용)
    protected void onNewIntent(Intent intent) {
        //전달받은 인텐트를 처리합니다.
        processIntent();

        super.onNewIntent(intent);
    }

    //전달받은 인텐트를 처리하는 메소드 정의

    private void processIntent() {
        //인텐트 객체를 확인합니다.
        Intent receviedIntent = getIntent();
        startCount = receviedIntent.getIntExtra("startCount", 0);

        //텍스트뷰에 startCount 값을 보여줍니다.
        msg = "전달된 startCount : " + startCount;
        txtMsg.setText(msg);
    }

    //새로운 액티비티에서 돌아올 때 자동 호출되는 메소드
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_ANOTHER) {
            Toast toast = Toast.makeText(this, "onActivityResult() 메소드가 호출됨. 요청코드 : " + requestCode + ", 결과코드 : " + resultCode, Toast.LENGTH_LONG);
            toast.show();
        }
    }
}

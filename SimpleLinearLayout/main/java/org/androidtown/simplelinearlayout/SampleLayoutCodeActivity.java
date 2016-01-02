package org.androidtown.simplelinearlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

//자바 코드를 이용해 레이아웃을 만드는 방법


public class SampleLayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);

        //new 연산자로 리니어 레이아웃을 만들고 방향 설정
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //new 연산자로 레이아웃 안에 추가 될 뷰들에 설정할 파라미터 생성
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //버튼에 파라미터 설정하고 레이아웃에 추가
        Button button01 = new Button(this);
        button01.setText("Button01");
        button01.setLayoutParams(params);
        mainLayout.addView(button01);

        setContentView(mainLayout); //새로 만든 레이아웃을 화면에 설정 -- 앱을 실행했을 때 처음 보이는 화면 : 메인액티비티. 매니패스트에서 코드 수정 해야 이 화면 뜸.
    }
}

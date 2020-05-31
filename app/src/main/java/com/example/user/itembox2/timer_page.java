package com.example.user.itembox2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class timer_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_page);

        Intent intent4 = getIntent(); //이전 액티비티에서 수신할 데이터를 받기위해 선언
        int ha = intent4.getIntExtra("image",0);
        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        switch (ha) {
            case R.id.animal:
                imageview.setImageResource(R.drawable.elephant);
                break;
            case R.id.animal2:
                imageview.setImageResource(R.drawable.cat);
                break;
        }

        String Receive = intent4.getStringExtra("String");       //호출한 액티비티에서 String 이라는 키 값을 가진 데이터 로드
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(Receive);

    }
}

package com.example.user.itembox2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class failed extends AppCompatActivity {
    //파일이름 win 말고 failed
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.failed);

    }
    public void onBackPressed() {
//뒤로가기 금지
    }
    public void back_home(View view) {
        Toast.makeText(getApplicationContext(),"홈으로 가게해줘억!",Toast.LENGTH_LONG).show();//임시
    }
}


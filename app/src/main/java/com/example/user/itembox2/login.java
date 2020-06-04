package com.example.user.itembox2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginbutton = (Button) findViewById(R.id.logbutton) ;
        loginbutton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"홈으로 가게해줘억!",Toast.LENGTH_LONG).show();//임시
                Intent start = new Intent(login.this,Itembox.class);
                startActivity(start);
            }
        });

        Button timerbutton = (Button) findViewById(R.id.timerbutton) ;
        timerbutton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"홈으로 가게해줘억!",Toast.LENGTH_LONG).show();//임시
                Intent start1 = new Intent(login.this,store.class);
                startActivity(start1);

            }
        });
    }
}
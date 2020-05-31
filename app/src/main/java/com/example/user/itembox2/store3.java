package com.example.user.itembox2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class store3 extends Activity implements View.OnClickListener{

    Button button;
    Button button2;
    Button button3;
    ImageView extra;
    ImageView extra2;
    ImageView extra3;
    ImageView extra4;
    ImageView extra5;
    ImageView extra6;
    ImageView extra7;
    ImageView extra8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store3);

        // 버튼 변수
        button = (Button)findViewById(R.id.tab_first);
        button2 = (Button)findViewById(R.id.tab_second);
        button3 = (Button)findViewById(R.id.tab_third);
        extra = (ImageView)findViewById(R.id.extra);
        extra2 = (ImageView)findViewById(R.id.extra2);
        extra3 = (ImageView)findViewById(R.id.extra3);
        extra4 = (ImageView)findViewById(R.id.extra4);
        extra5 = (ImageView)findViewById(R.id.extra5);
        extra6 = (ImageView)findViewById(R.id.extra6);
        extra7 = (ImageView)findViewById(R.id.extra7);
        extra8 = (ImageView)findViewById(R.id.extra8);

        // 버튼에 이벤트 지정
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        extra.setOnClickListener(this);
        extra2.setOnClickListener(this);
        extra3.setOnClickListener(this);
        extra4.setOnClickListener(this);
        extra5.setOnClickListener(this);
        extra6.setOnClickListener(this);
        extra7.setOnClickListener(this);
        extra8.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.extra:
            case R.id.extra2:
            case R.id.extra3:
            case R.id.extra4:
            case R.id.extra5:
            case R.id.extra6:
            case R.id.extra7:
            case R.id.extra8:

                final EditText etEdit = new EditText(this);
                AlertDialog.Builder dialog = new AlertDialog.Builder(store3.this);
                dialog.setTitle("입력");
                dialog.setView(etEdit);
                // OK 버튼 이벤트
                dialog.setPositiveButton("시작", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        String inputValue = etEdit.getText().toString();
                        Intent intent4 = new Intent(getApplicationContext(), timer_page.class);
                        intent4.putExtra("String",inputValue);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog.show();
                break;
            case R.id.tab_first:
                Intent intent = new Intent(getApplicationContext(), store.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0, 0);
                break;

            case R.id.tab_second:
                Intent intent2 = new Intent(getApplicationContext(), store2.class);
                startActivity(intent2);
                finish();
                overridePendingTransition(0, 0);
                break;

            case R.id.tab_third:
                Intent intent3 = new Intent(getApplicationContext(), store3.class);
                startActivity(intent3);
                finish();
                overridePendingTransition(0, 0);
                break;

        }
    }
}

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


public class store2 extends Activity implements View.OnClickListener{

    Button button;
    Button button2;
    Button button3;
    ImageView plant;
    ImageView plant2;
    ImageView plant3;
    ImageView plant4;
    ImageView plant5;
    ImageView plant6;
    ImageView plant7;
    ImageView plant8;
    ImageView plant9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store2);

        // 버튼 변수
        button = (Button)findViewById(R.id.tab_first);
        button2 = (Button)findViewById(R.id.tab_second);
        button3 = (Button)findViewById(R.id.tab_third);
        plant = (ImageView)findViewById(R.id.plant);
        plant2 = (ImageView)findViewById(R.id.plant2);
        plant3 = (ImageView)findViewById(R.id.plant3);
        plant4 = (ImageView)findViewById(R.id.plant4);
        plant5 = (ImageView)findViewById(R.id.plant5);
        plant6 = (ImageView)findViewById(R.id.plant6);
        plant7 = (ImageView)findViewById(R.id.plant7);
        plant8 = (ImageView)findViewById(R.id.plant8);
        plant9 = (ImageView)findViewById(R.id.plant9);
        // 버튼에 이벤트 지정
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        plant.setOnClickListener(this);
        plant2.setOnClickListener(this);
        plant3.setOnClickListener(this);
        plant4.setOnClickListener(this);
        plant5.setOnClickListener(this);
        plant6.setOnClickListener(this);
        plant7.setOnClickListener(this);
        plant8.setOnClickListener(this);
        plant9.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plant:
            case R.id.plant2:
            case R.id.plant3:
            case R.id.plant4:
            case R.id.plant5:
            case R.id.plant6:
            case R.id.plant7:
            case R.id.plant8:
            case R.id.plant9:

                final EditText etEdit = new EditText(this);
                AlertDialog.Builder dialog = new AlertDialog.Builder(store2.this);
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

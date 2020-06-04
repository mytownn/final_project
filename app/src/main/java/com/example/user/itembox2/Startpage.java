package com.example.user.itembox2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Startpage extends AppCompatActivity implements View.OnTouchListener {
    TextView textView;
    ImageView ImageView;
    ImageButton ImageButton1,ImageButton2,ImageButton3,ImageButton4,ImageButton5,ImageButton6,ImageButton7,ImageButton8,ImageButton9,ImageButton10,ImageButton11,ImageButton12,ImageButton13,ImageButton14,ImageButton15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        ImageView useItemView = (ImageView)findViewById(R.id.item_picture);
        TextView useName = (TextView) findViewById(R.id.item_name);
        Intent intent = getIntent();
        String uName = intent.getStringExtra("name") ;

        switch (uName){
            case "cat":
                useItemView.setImageResource(R.drawable.cat);
                useItemView.setOnTouchListener(this);
                break;
            case "bush":
                useItemView.setImageResource(R.drawable.bush);
                useItemView.setOnTouchListener(this);
                break;
            case "dog":
                useItemView.setImageResource(R.drawable.dog);
                useItemView.setOnTouchListener(this);
                break;
            case "flower2":
                useItemView.setImageResource(R.drawable.flower2);
                useItemView.setOnTouchListener(this);
                break;
            case "forest":
                useItemView.setImageResource(R.drawable.forest);
                useItemView.setOnTouchListener(this);
                break;
            case "flower4":
                useItemView.setImageResource(R.drawable.flower4);
                useItemView.setOnTouchListener(this);
                break;
            case "tree":
                useItemView.setImageResource(R.drawable.tree);
                useItemView.setOnTouchListener(this);
                break;
            case "flower":
                useItemView.setImageResource(R.drawable.flower);
                useItemView.setOnTouchListener(this);
                break;
            case "duck":
                useItemView.setImageResource(R.drawable.duck);
                useItemView.setOnTouchListener(this);
                break;
            case "llama":
                useItemView.setImageResource(R.drawable.llama);
                useItemView.setOnTouchListener(this);
                break;
            case "flower3":
                useItemView.setImageResource(R.drawable.flower3);
                useItemView.setOnTouchListener(this);
                break;
            case "meerkat":
                useItemView.setImageResource(R.drawable.meerkat);
                useItemView.setOnTouchListener(this);
                break;
            case "owl":
                useItemView.setImageResource(R.drawable.owl);
                useItemView.setOnTouchListener(this);
                break;
            case "pig":
                useItemView.setImageResource(R.drawable.pig);
                useItemView.setOnTouchListener(this);
                break;
            case "rabbit":
                useItemView.setImageResource(R.drawable.rabbit);
                useItemView.setOnTouchListener(this);
                break;
        }

    }

    public void share_btnClick(View view) {
        Toast.makeText(getApplicationContext(),"공유버튼테스트",Toast.LENGTH_LONG).show();

    }

    public void camera_btnClick(View view) {
        Toast.makeText(getApplicationContext(),"카메라버튼테스트",Toast.LENGTH_LONG).show();

    }

    //Navigation 기능 부분
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {


        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

    float oldXvalue;
    float oldYvalue;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int width = ((ViewGroup) v.getParent()).getWidth() - v.getWidth();
        int height = ((ViewGroup) v.getParent()).getHeight() - v.getHeight();

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            oldXvalue = event.getX();
            oldYvalue = event.getY();
            Log.i("Tag1", "Action Down rX " + event.getRawX() + "," + event.getRawY());
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            v.setX(event.getRawX() - oldXvalue);
            v.setY(event.getRawY() - (oldYvalue + v.getHeight()));
        } else if (event.getAction() == MotionEvent.ACTION_UP) {

            if (v.getX() > width && v.getY() > height) {
                v.setX(width);
                v.setY(height);
            } else if (v.getX() < 0 && v.getY() > height) {
                v.setX(0);
                v.setY(height);
            } else if (v.getX() > width && v.getY() < 0) {
                v.setX(width);
                v.setY(0);
            } else if (v.getX() < 0 && v.getY() < 0) {
                v.setX(0);
                v.setY(0);
            } else if (v.getX() < 0 || v.getX() > width) {
                if (v.getX() < 0) {
                    v.setX(0);
                    v.setY(event.getRawY() - oldYvalue - v.getHeight());
                } else {
                    v.setX(width);
                    v.setY(event.getRawY() - oldYvalue - v.getHeight());
                }
            } else if (v.getY() < 0 || v.getY() > height) {
                if (v.getY() < 0) {
                    v.setX(event.getRawX() - oldXvalue);
                    v.setY(0);
                } else {
                    v.setX(event.getRawX() - oldXvalue);
                    v.setY(height);
                }
            }
        }
        return true;
    }
}
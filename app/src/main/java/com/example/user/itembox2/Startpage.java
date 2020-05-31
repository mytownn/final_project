package com.example.user.itembox2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class Startpage extends AppCompatActivity {



 //   @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        ImageView useItemView = (ImageView)findViewById(R.id.item_picture);
    //    useItemView.setImageResource(R.drawable.bush);

       // useItem = new ArrayList<>();
        Intent intent = getIntent(); //이전 액티비티에서 수신할 데이터를 받기위해 선언
        TextView useName = (TextView) findViewById(R.id.item_name) ;
        String uName = intent.getStringExtra("name") ;
      //  useName.setText(uName) ;

    //  Intent intent = getIntent();
     //  ArrayList<Item> useItem=(ArrayList<Item>)intent.getSerializableExtra("string");
     //   handleSendMultipleImages(intent);
    //    handleSendImage(intent);
        //ImageView useItemView = (ImageView)findViewById(R.id.item_picture);
       // useItemView.setImageResource(intent.getData());
       switch (uName){
           case "cat":
               useItemView.setImageResource(R.drawable.cat);
               break;
           case "bush":
               useItemView.setImageResource(R.drawable.bush);
               break;
           case "dog":
               useItemView.setImageResource(R.drawable.dog);
               break;
           case "flower2":
               useItemView.setImageResource(R.drawable.flower2);
               break;
           case "forest":
               useItemView.setImageResource(R.drawable.forest);
               break;
           case "flower4":
               useItemView.setImageResource(R.drawable.flower4);
               break;
           case "tree":
               useItemView.setImageResource(R.drawable.tree);
               break;
           case "flower":
               useItemView.setImageResource(R.drawable.flower);
               break;
           case "duck":
               useItemView.setImageResource(R.drawable.duck);
               break;
           case "llama":
               useItemView.setImageResource(R.drawable.llama);
               break;
           case "flower3":
               useItemView.setImageResource(R.drawable.flower3);
               break;
           case "meerkat":
               useItemView.setImageResource(R.drawable.meerkat);
               break;
           case "owl":
               useItemView.setImageResource(R.drawable.owl);
               break;
           case "pig":
               useItemView.setImageResource(R.drawable.pig);
               break;
           case "rabbit":
               useItemView.setImageResource(R.drawable.rabbit);
               break;
        }
        //     useItem = intent.getParcelableArrayListExtra("use");
       // Uri = getIntent().getParcelableExtra("imageUri");
     //   Intent passedIntent = getIntent();
   //     processIntent(passedIntent);
   //     ImageView iv = (ImageView)findViewById(R.id.item_picture);
     //   Intent intent = getIntent(); // 보내온 Intent를 얻는다
     //   iv.setImageResource(intent.getIntExtra("img",0));

       // Parcelable uri = getIntent().getParcelableExtra("imageUri");
 //   }
   /* void handleSendMultipleImages(Intent intent) {
        ArrayList<Uri> imageUris = intent.getParcelableArrayListExtra(Intent.EXTRA_STREAM);
        if (imageUris != null) {
            // Update UI to reflect multiple images being shared
            //setResult(RESULT_OK);
          // finish();
            imageUris = getIntent().getParcelableExtra("imageUri");

           useitem. setImageResource(imageUris);
        }
    }
    /*void handleSendImage(Intent intent) {
        Uri imageUri = (Uri) intent.getParcelableExtra(Intent.EXTRA_STREAM);
        if (imageUri != null) {
            // Update UI to reflect image being shared
            setResult(RESULT_OK);
            finish();
            //  ImageView useItemView = (ImageView)findViewById(R.id.item_picture);
           // useItemView.setImageResource(intent.getData());
        }
    }*/

    //   private void processIntent(Intent intent) {
 //       if(intent != null){
 //          Item data = (Item) intent.getParcelableExtra("img");
 //       }
 //   }
    }
}
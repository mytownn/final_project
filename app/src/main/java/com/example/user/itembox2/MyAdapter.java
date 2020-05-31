package com.example.user.itembox2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;

import static android.support.v4.app.ActivityCompat.startActivityForResult;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    private ArrayList<Item> itemArrayList;

    public class MyViewHolder extends RecyclerView.ViewHolder
            implements View.OnCreateContextMenuListener {

        ImageView itemPicture;
        TextView itemName;
        AdapterView.OnItemClickListener listenr; //클릭이벤트처리관련 변수

        MyViewHolder(View view){
            super(view);
            itemPicture = view.findViewById(R.id.item_picture);
            itemName = view.findViewById(R.id.item_name);
            view.setOnCreateContextMenuListener(this);//OnCreateContextMenuListener 리스너를 현재 클래스에서 구현
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            // 컨텍스트 메뉴를 생성하고 메뉴 항목 선택시 호출되는 리스너를 등록
            // ID 1001로 어떤 메뉴를 선택했는지 리스너에서 구분

            MenuItem Edit = menu.add(Menu.NONE, 1001, 1, "사용하기");
       ///     MenuItem Delete = menu.add(Menu.NONE, 1002, 2, "삭제");
            Edit.setOnMenuItemClickListener(onEditMenu);
       //     Delete.setOnMenuItemClickListener(onEditMenu);
        }

        //컨텍스트 메뉴에서 항목 클릭시 동작을 설정
        private final MenuItem.OnMenuItemClickListener onEditMenu = new MenuItem.OnMenuItemClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case 1001:  //사용하기
                        Intent intent = new Intent(itemView.getContext(),Startpage.class);
                        intent.putExtra("name", itemName.getText());
                       // intent.putExtra("picture", (Serializable) itemPicture.getDrawable());
                        //   intent.putExtra("string", (Serializable) itemName);
                ///        intent.putExtra("img",item.getItemId());
                  //      Intent intent = new Intent(itemView.getContext(), Startpage.class);
        //               Item data = new Item(0);
                   //     intent.putParcelableArrayListExtra("use",itemArrayList);
                      // intent.putExtra("img", Uri);
                        //
                        itemView.getContext().startActivity(intent);

                        //아이템사용처리
                        GradientDrawable drawable =
                                (GradientDrawable) itemView.getContext().getDrawable(R.drawable.background_rounding);
                        itemView.setBackground(drawable);
                        itemView.setClipToOutline(true);

                }
                return true;
            }
        };
    }

    MyAdapter(ArrayList<Item> itemArrayList){
        this.itemArrayList = itemArrayList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.itemPicture.setImageResource(itemArrayList.get(position).drawableId);
        myViewHolder.itemName.setText(itemArrayList.get(position).name);
    }
    /////아이템 추가
    public void addItem(Item item){
        itemArrayList.add(item);
    }
    //아이템 배열 추가
    public  void  addItems(ArrayList<Item> items){
        this.itemArrayList = items;
    }
    //아이템 가져오기
    public Item getItem(int position){
        return  itemArrayList.get(position);
    }

    public void setItem(Item item){
        item.setDrawableId(item.getDrawableId());

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }
}

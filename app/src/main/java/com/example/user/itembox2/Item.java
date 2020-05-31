package com.example.user.itembox2;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Item implements Serializable {
    public int drawableId;
    public String name;

    public Item(int drawableId, String name){//, String name
        this.drawableId = drawableId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}



/*

package com.example.user.itembox2;

public class Item {
    public int drawableId;

    public Item(int drawableId){//, String name
        this.drawableId = drawableId;
        //     this.name = name;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}
 * */
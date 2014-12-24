package com.example.samuyu.lolipop.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by toyamaosamuyu on 2014/11/30.
 */
public class Star implements Parcelable{
    private static final String TAG = Star.class.getSimpleName();
    public String imgUrl;
    public String title;
    public String description;

    public Star(String imgUrl, String title, String description) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private Star(Parcel in) {
        imgUrl = in.readString();
        title = in.readString();
        description = in.readString();
    }

    public static final Parcelable.Creator<Star> CREATOR
            = new Parcelable.Creator<Star>() {
        public Star createFromParcel(Parcel in) {
            return new Star(in);
        }

        public Star[] newArray(int size) {
            return new Star[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imgUrl);
        dest.writeString(title);
        dest.writeString(description);
    }
}



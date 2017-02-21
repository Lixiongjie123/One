package com.example.dell_user.one.other;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DELL-USER on 2017/2/17.
 */

public class StudentPar implements Parcelable {
    private String id;

   public StudentPar() {
       super();
    }
    public StudentPar(String id) {
        super();
        this.id=id;
    }

    public static final Creator<StudentPar> CREATOR = new Creator<StudentPar>() {
        @Override
        public StudentPar createFromParcel(Parcel in) {
            StudentPar stu=new StudentPar();
            stu.id=in.readString();
            return stu;
        }

        @Override
        public StudentPar[] newArray(int size) {
            return new StudentPar[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

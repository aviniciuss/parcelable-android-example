package br.com.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

public class Phone implements Parcelable {
    public String phone;

    public Phone(String phone) {
        this.phone = phone;
    }

    public Phone(Parcel in) {
        phone = in.readString();
    }

    public static final Creator<Phone> CREATOR = new Creator<Phone>() {
        @Override
        public Phone createFromParcel(Parcel in) {
            return new Phone(in);
        }

        @Override
        public Phone[] newArray(int size) {
            return new Phone[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(phone);
    }
}

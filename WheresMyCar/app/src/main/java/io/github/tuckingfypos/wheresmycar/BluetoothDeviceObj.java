package io.github.tuckingfypos.wheresmycar;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by TuckingFypos on 9/28/16.
 */

public class BluetoothDeviceObj {
    String mText1;
    double mText3;
    double mText4;
    String mText2;


    public BluetoothDeviceObj(){
        mText1 = "Device Name";
        mText2 = "Device ID";
        mText3 = 00.00;
        mText4 = 00.00;
    }

    public BluetoothDeviceObj(String mText1, String mText2, double mText3, double mText4) {
        this.mText1 = mText1;
        this.mText2 = mText2;
        this.mText3 = mText3;
        this.mText4 = mText4;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public double getmText3() {return mText3; }

    public void setmText3(double mText3) { this.mText3 = mText3;}

    public double getmText4() { return mText4; }

    public void setmText4(double mText4) { this.mText4 = mText4;}

}

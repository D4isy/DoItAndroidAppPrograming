package org.androidtown.mission09;

/**
 * Created by AndroidApp on 2017-07-15.
 */

public class CustomerItem {

    String name;
    String birth;
    String mobile;
    int resId;

    public CustomerItem(String name, String birth, String mobile) {
        this.name = name;
        this.birth = birth;
        this.mobile = mobile;
    }

    public CustomerItem(String name, String birth, String mobile, int resId) {
        this.name = name;
        this.birth = birth;
        this.mobile = mobile;
        this.resId = resId;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.pial.siam;

import java.util.ArrayList;

public class Model {
    String name;
    ArrayList<String> stringArrayList =new ArrayList<>();

    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public ArrayList<String> getStringArrayList() {
        return stringArrayList;
    }

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Translater {
    private String filename;

    private ArrayList <String> key;


    public Translater(String filenam) {
        this.filename=filenam;
        this.key=new ArrayList<>();
        loadKeys();
    }

    private void loadKeys() {
        key.add("menu");
        key.add("choice");
        key.add("address");
        key.add("comfort");
        key.add("area");
        key.add("price");
        key.add("addSucc");
        key.add("available");
        key.add("delete");
        key.add("deleteSucc");
        key.add("idError");
        key.add("budget");
        key.add("availableBudget");
    }

    public Dictionary getDictionary() {
        Dictionary dictionary=new Hashtable();
        ArrayList<String> values=FileLoader.getline(filename);
        for (int i=0;i< key.size();i++){
            dictionary.put(key.get(i),values.get(i));
        }
        return dictionary;
    }
}

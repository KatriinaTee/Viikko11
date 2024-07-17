package com.example.viikko11;

import java.util.ArrayList;

public class ListGrocery {
    public static ListGrocery getGroceries() {
        ListGrocery groceries;
        return groceries;
    }

    private ArrayList<Grocery> grocery = new ArrayList<>();

    private static ListGrocery storage = null;


    private ListGrocery() {
    }

    public static ListGrocery getInstance() {
        if(storage == null) {
            storage = new ListGrocery();
        }
        return storage;
    }

    public void addGrocery(Grocery grocery) {
        grocery.add(grocery);
    }

    public ArrayList<Grocery> getGrocery() {
        return grocery;
    }
}

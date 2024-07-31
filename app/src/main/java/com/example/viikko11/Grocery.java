package com.example.viikko11;

public class Grocery {

    protected String item;
    protected String note;

    public Grocery(String item, String note) {
        this.item = item;
        this.note = note;
    }

    public Grocery() {

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void add(Grocery grocery) {
    }
}
package com.example.viikko11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListGrocery {
    private ArrayList<Grocery> grocery = new ArrayList<>();
    private static ListGrocery INSTANCE = null;

    private ListGrocery() {
    }
    public static ListGrocery getInstance() {
        if(INSTANCE == null) INSTANCE = new ListGrocery();
        return INSTANCE;
    }
    public Grocery getGroceryByName(String name){
        Grocery grocery1 = null;
        for (int i = 0; i < grocery.size(); i++) {
            if(grocery.get(i).getItem().equals(name)){
                grocery1 = grocery.get(i);
                break;
            }
        }
        return grocery1;
    }
    public void removeGrocery(String name){
        for (int i = 0; i < grocery.size(); i++) {
            if(grocery.get(i).getItem().equals(name)){
                grocery.remove(i);
                break;
            }
        }
    }
    public void addGrocery(Grocery grocer) {
        grocery.add(grocer);
        grocery.size();
    }
    public ArrayList<Grocery> getGroceries() {
        return grocery;
    }
    public void sortGroceriesByAlphabet(){
        List<Grocery> grocery2 = grocery.stream()
                .sorted(Comparator.comparing(Grocery::getItem))
                .collect(Collectors.toList());
        grocery = (ArrayList<Grocery>) grocery2;
    }
    public void sortGroceriesByTime(){

    }
}

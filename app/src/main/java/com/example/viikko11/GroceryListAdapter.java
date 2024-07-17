package com.example.viikko11;

import android.view.View;

import androidx.annotation.NonNull;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryListAdapter extends GroceryViewHolder{

    private Context context;
    private ArrayList<Grocery> grocery = new ArrayList<>();

    public GroceryListAdapter(Context context, ArrayList<Grocery> grocery) {
        this.context = context;
        this.grocery = grocery;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_add_grocery, parent, false));
    }

}

}

package com.example.viikko11;

import androidx.annotation.NonNull;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder>{
    private Context context;
    private ArrayList<Grocery> grocery = new ArrayList<>();

    public GroceryListAdapter(Context context, ArrayList<Grocery> grocery) {
        this.context = context;
        this.grocery = grocery;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.grocery_view, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        ImageView removeImage, editImage;
        EditText editTextGroceryNote;
        holder.textGroceryName.setText(String.valueOf(grocery.get(position).getItem()));
        holder.textGroceryNote.setText(String.valueOf(grocery.get(position).getNote()));
    }
    @Override
    public int getItemCount() {
        return grocery.size();
    }
}


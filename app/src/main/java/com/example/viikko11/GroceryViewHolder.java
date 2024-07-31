package com.example.viikko11;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class GroceryViewHolder extends RecyclerView.ViewHolder {
        ImageView removeImage, editImage;
        TextView textGroceryName, textGroceryNote;
        EditText editTextGroceryNote;

        public GroceryViewHolder(@NonNull View itemView) {
            super(itemView);
            textGroceryName = itemView.findViewById(R.id.textGroceryName);
            textGroceryNote = itemView.findViewById(R.id.textGroceryNote);
            removeImage = itemView.findViewById(R.id.imageDelete);
            editImage = itemView.findViewById(R.id.imageEdit);
            editTextGroceryNote = itemView.findViewById(R.id.editTextGroceryNote);
            System.out.println("viewholder");
        }
    }



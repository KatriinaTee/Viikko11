package com.example.viikko11;

import android.os.Bundle;

import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvGroceries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GroceryListAdapter mla = new GroceryListAdapter(this, ListGrocery.getInstance().getGroceries());
        recyclerView.setAdapter(mla);
    }

    public void addGrocery(View view) {
        Intent intent = new Intent(this, AddGroceryActivity.class);
        startActivity(intent);
    }

    public void listGroceryInRecycleView(View view) {
        //Intent intent = new Intent(this, ListGrocery.class);
        //startActivity(intent);


    }
}
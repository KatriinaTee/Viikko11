package com.example.viikko11;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddGroceryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_grocery);
    }
    public void addGrocery(View view) {
        String item = ((EditText) findViewById(R.id.editGroceryName)).getText().toString();
        String note = ((EditText) findViewById(R.id.editGroceryNote)).getText().toString();

        Grocery grocery = new Grocery(item, note);
        ListGrocery.getInstance().addGrocery(grocery);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}


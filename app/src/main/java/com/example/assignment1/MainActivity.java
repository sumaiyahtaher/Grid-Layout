package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);

        // Set onClickListener for the button
        button.setOnClickListener(view -> {
            // Display a toast
            Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();

            // Update the TextView
            textView.setText("Button was clicked!");

            // Optionally update the ImageView (replace with a new image)
            imageView.setImageResource(R.drawable.logo);
        });
    }
}

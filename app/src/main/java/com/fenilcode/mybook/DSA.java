package com.fenilcode.mybook;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DSA extends AppCompatActivity {

    // Initializing the ImageView
    ImageView rImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa);

        // getting ImageView by its id
        rImage = findViewById(R.id.rImage);

        // we will get the default FirebaseDatabase instance
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        // we will get a DatabaseReference for the database root node
        DatabaseReference databaseReference = firebaseDatabase.getReference();

        // Get the current date in the format "yyyy-MM-dd"
        String currentDate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        // Create a reference to the image node for the current date
        DatabaseReference getImage = databaseReference.child("images").child(currentDate);

        // Adding listener for a single change
        getImage.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Get the "imageURL" child node
                DataSnapshot imageUrlSnapshot = dataSnapshot.child("imageURL");

                // Check if the "imageURL" node exists
                if (imageUrlSnapshot.exists()) {
                    // Get the image URL as a String
                    String link = imageUrlSnapshot.getValue(String.class);

                    // Load the image using Picasso
                    Picasso.get().load(link).into(rImage);
                } else {
                    // Handle the case when the "imageURL" node doesn't exist
                    Toast.makeText(DSA.this, "No image found for the specified date", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle any errors
                Toast.makeText(DSA.this, "Error Loading Image", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.fenilcode.mybook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ComputerSem_2 extends AppCompatActivity {
    ImageButton cbtn2;
    private FirebaseStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem2);
        storage = FirebaseStorage.getInstance();
        cbtn2 = findViewById(R.id.Math_2);
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Math_2AndDisplayPDF();
            }
        });
        cbtn2 = findViewById(R.id.pps);
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PPSAndDisplayPDF();
            }
        });
        cbtn2 = findViewById(R.id.es);
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ESAndDisplayPDF();
            }
        });
        cbtn2 = findViewById(R.id.egd);
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EGDAndDisplayPDF();
            }
        });

    }
    private void EGDAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("EGD.pdf");

        // Download PDF file into a local file
        pdfRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Open the PDF file using an Intent
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setDataAndType(uri, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // Handle any errors
                e.printStackTrace();
            }
        });
    }

    private void ESAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("ES.pdf");

        // Download PDF file into a local file
        pdfRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Open the PDF file using an Intent
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setDataAndType(uri, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // Handle any errors
                e.printStackTrace();
            }
        });
    }

    private void PPSAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("PPS.pdf");

        // Download PDF file into a local file
        pdfRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Open the PDF file using an Intent
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setDataAndType(uri, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // Handle any errors
                e.printStackTrace();
            }
        });

    }

    private void Math_2AndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("Maths_2.pdf");

        // Download PDF file into a local file
        pdfRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Open the PDF file using an Intent
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setDataAndType(uri, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // Handle any errors
                e.printStackTrace();
            }
        });
    }
}
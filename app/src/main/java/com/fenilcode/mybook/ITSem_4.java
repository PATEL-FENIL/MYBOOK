package com.fenilcode.mybook;

import android.annotation.SuppressLint;
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

public class ITSem_4 extends AppCompatActivity {
    ImageButton btn4;
    private FirebaseStorage storage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsem4);
        storage = FirebaseStorage.getInstance();

        btn4=findViewById(R.id.os);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OSAndDisplayPDF();
            }
        });
        btn4=findViewById(R.id.coa);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                COAAndDisplayPDF();
            }
        });
        btn4=findViewById(R.id.discrete_mathematics);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DMAndDisplayPDF();
            }
      });
        btn4=findViewById(R.id.oop);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OOPAndDisplayPDF();
            }
        });
        btn4=findViewById(R.id.pem);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PEMAndDisplayPDF();
            }
        });
    }

    private void PEMAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("PEM.pdf");

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
    private void COAAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("COA.pdf");

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
    private void OOPAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("OOP1_Java.pdf");

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
    private void DMAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("DM.pdf");

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
     private void OSAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("OS.pdf");

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

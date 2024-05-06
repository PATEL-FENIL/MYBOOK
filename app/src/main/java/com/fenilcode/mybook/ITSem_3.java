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

public class ITSem_3 extends AppCompatActivity {
  ImageButton btn3;
  private FirebaseStorage storage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsem3);
        storage = FirebaseStorage.getInstance();

        btn3=findViewById(R.id.ds);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call method to retrieve and display PDF
                DSAndDisplayPDF();
            }
        });
        btn3=findViewById(R.id.etc);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETCAndDisplayPDF();
            }
        });
        btn3=findViewById(R.id.dbms);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBMSAndDisplayPDF();
            }
        });
        btn3=findViewById(R.id.df);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call method to retrieve and display PDF
                DFAndDisplayPDF();
            }
        });
       btn3=findViewById(R.id.pas);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PASAndDisplayPDF();
            }
        });
        btn3= findViewById(R.id.ic);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ICAndDisplayPDF();
            }
        });
    }
    private void DBMSAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("DBMS.pdf");

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
    private void ETCAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("ETC.pdf");

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
private void DSAndDisplayPDF() {
    // Get a reference to the PDF file in Firebase Storage
    StorageReference pdfRef = storage.getReference().child("DS.pdf");

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
private void ICAndDisplayPDF() {
    // Get a reference to the PDF file in Firebase Storage
    StorageReference pdfRef = storage.getReference().child("IC.pdf");

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
private void DFAndDisplayPDF() {
    // Get a reference to the PDF file in Firebase Storage
    StorageReference pdfRef = storage.getReference().child("DF.pdf");

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
    private void PASAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("P&S.pdf");

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
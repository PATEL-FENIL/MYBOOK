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

public class ITSem_6 extends AppCompatActivity {
    ImageButton btn6;
    private FirebaseStorage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsem6);
        storage = FirebaseStorage.getInstance();
     btn6 = findViewById(R.id.ipdc_2);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             IPDC_2AndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.ai);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             AIAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.awp);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             AWPAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.bda);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             BDAAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.dav);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             DAVAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.cns);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             CNSAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.mad);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             MADAndDisplayPDF();
         }
     });
     btn6 = findViewById(R.id.se);
     btn6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             SEAndDisplayPDF();
         }
     });
    }
    private void IPDC_2AndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("IPDC_2.pdf");
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
    private void AIAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("AI.pdf");
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
    private void AWPAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("AWP.pdf");
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
    private void BDAAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("BDA.pdf");
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
    private void DAVAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("DAV.pdf");
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
    private void CNSAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("CNS.pdf");
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
    private void MADAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("MAD.pdf");
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
    private void SEAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("SE.pdf");
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
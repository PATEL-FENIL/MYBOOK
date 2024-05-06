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

public class ITSem_7 extends AppCompatActivity {
    ImageButton btn7;
    private FirebaseStorage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsem7);
        storage = FirebaseStorage.getInstance();
        btn7 = findViewById(R.id.aml);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AMLAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.agile);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AGILEAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.bc);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BCAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.cv);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CVAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.spm);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SPMAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.ir);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.iot);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IOTAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.iswa);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISWAAndDisplayPDF();
            }
        });
        btn7 = findViewById(R.id.wc);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WCAndDisplayPDF();
            }
        });
    }

    private void WCAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("WC.pdf");

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

    private void ISWAAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("ISWA.pdf");

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

    private void IOTAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("IOT.pdf");

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

    private void IRAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("IR.pdf");

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

    private void SPMAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("SPM.pdf");

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

    private void CVAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("CV.pdf");

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

    private void BCAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("BC.pdf");

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

    private void AGILEAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("Agile.pdf");

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

    private void AMLAndDisplayPDF() {
        // Get a reference to the PDF file in Firebase Storage
        StorageReference pdfRef = storage.getReference().child("AML.pdf");

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
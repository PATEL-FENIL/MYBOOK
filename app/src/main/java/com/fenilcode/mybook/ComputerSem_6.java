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

public class ComputerSem_6 extends AppCompatActivity {
    ImageButton cbtn6;
    private FirebaseStorage storage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem6);
        storage = FirebaseStorage.getInstance();
        cbtn6 = findViewById(R.id.ipdc_2);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IPDC_2AndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.ajp);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AJPAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.mpi);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MPIAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.cpdp);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CPDPAndDisplay();
            }
        });
        cbtn6 = findViewById(R.id.data_mining);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DATAMININGAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.dv);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DVAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.tc);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TCAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.wp);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPAndDisplayPDF();
            }
        });
        cbtn6 = findViewById(R.id.c_iot);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CIOTAndDisplayPDF();
            }
        });
    }

    private void CIOTAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("C_IOT.pdf");
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

    private void WPAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("WP.pdf");
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

    private void TCAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("TC.pdf");
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

    private void DVAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("DV.pdf");
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

    private void DATAMININGAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("DataMining.pdf");
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

    private void CPDPAndDisplay() {
        StorageReference pdfRef = storage.getReference().child("CPDP.pdf");
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

    private void MPIAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("MPI.pdf");
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

    private void AJPAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("AJP.pdf");
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

    private void IPDC_2AndDisplayPDF() {
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
}
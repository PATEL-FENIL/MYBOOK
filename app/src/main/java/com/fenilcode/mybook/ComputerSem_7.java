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

public class ComputerSem_7 extends AppCompatActivity {

    ImageButton cbtn7;
    private FirebaseStorage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem7);
        storage = FirebaseStorage.getInstance();
        cbtn7 = findViewById(R.id.ir);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cbda);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BDAAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cai);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AIAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cd);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CDAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cc);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CCAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.is);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.nlp);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NLPAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cml);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CMLAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.cmad);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CMADAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.mcwc);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MCWCAndDisplayPDF();
            }
        });
        cbtn7 = findViewById(R.id.distributed_system);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DistributedSystemAndDisplayPDF();
            }
        });
    }

    private void DistributedSystemAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("DistributedSystem.pdf");
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

    private void MCWCAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("MCWC.pdf");
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

    private void CMADAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("CMAD.pdf");
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

    private void CMLAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("CML.pdf");
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

    private void NLPAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("NLP.pdf");
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

    private void ISAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("IS.pdf");
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

    private void CCAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("CC.pdf");
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

    private void CDAndDisplayPDF() {
        StorageReference pdfRef = storage.getReference().child("CD.pdf");
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

    private void BDAAndDisplayPDF() {
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

    private void IRAndDisplayPDF() {
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
}
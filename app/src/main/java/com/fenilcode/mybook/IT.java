package com.fenilcode.mybook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IT extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        button = (Button) findViewById(R.id.sem_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_1();
            }
        });
        button = (Button) findViewById(R.id.sem_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_2();
            }
        });
        button = (Button) findViewById(R.id.sem_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_3();
            }
        });
        button = (Button) findViewById(R.id.sem_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_4();
            }
        });
        button = (Button) findViewById(R.id.sem_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_5();
            }
        });
        button = (Button) findViewById(R.id.sem_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_6();
            }
        });
        button = (Button) findViewById(R.id.sem_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSem_7();
            }
        });
    }

    public void openSem_1() {
        Intent intent = new Intent(this, ITSem_1.class);
        startActivity(intent);
    }
    public void openSem_2()
    {
        Intent intent = new Intent(this, ITSem_2.class);
        startActivity(intent);
    }
    public void openSem_3()
    {
        Intent intent = new Intent(this,ITSem_3.class);
        startActivity(intent);
    }
    public void openSem_4()
    {
        Intent intent = new Intent(this,ITSem_4.class);
        startActivity(intent);
    }
    private void openSem_5() {
        Intent intent = new Intent(this, ITSem_5.class);
        startActivity(intent);
    }
    private void openSem_6() {
        Intent intent = new Intent(this, ITSem_6.class);
        startActivity(intent);
    }
    private void openSem_7() {
        Intent intent = new Intent(this, ITSem_7.class);
        startActivity(intent);
    }
}

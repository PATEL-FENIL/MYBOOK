package com.fenilcode.mybook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ComputerEngineering extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering);
        button = (Button) findViewById(R.id.c_sem_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_1();
            }
        });
        button = (Button) findViewById(R.id.c_sem_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_2();
            }
        });
        button = (Button) findViewById(R.id.c_sem_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_3();
            }
        });
        button = (Button) findViewById(R.id.c_sem_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_4();
            }
        });
        button = (Button) findViewById(R.id.c_sem_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_5();
            }
        });
        button = (Button) findViewById(R.id.c_sem_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_6();
            }
        });
        button = (Button) findViewById(R.id.c_sem_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_CE_Sem_7();
            }
        });
    }

    private void open_CE_Sem_7() {
        Intent intent = new Intent(this, ComputerSem_7.class);
        startActivity(intent);
    }

    private void open_CE_Sem_6() {
        Intent intent = new Intent(this, ComputerSem_6.class);
        startActivity(intent);
    }

    private void open_CE_Sem_5() {
        Intent intent = new Intent(this, ComputerSem_5.class);
        startActivity(intent);
    }

    private void open_CE_Sem_4() {
        Intent intent = new Intent(this, ComputerSem_4.class);
        startActivity(intent);
    }

    private void open_CE_Sem_3() {
        Intent intent = new Intent(this, ComputerSem_3.class);
        startActivity(intent);
    }

    private void open_CE_Sem_2() {
        Intent intent = new Intent(this, ComputerSem_2.class);
        startActivity(intent);
    }

    private void open_CE_Sem_1() {
        Intent intent = new Intent(this, ComputerSem_1.class);
        startActivity(intent);
    }
}
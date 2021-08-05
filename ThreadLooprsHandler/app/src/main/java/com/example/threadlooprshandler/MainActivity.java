package com.example.threadlooprshandler;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mbtn1;
    private Button mbtn2;
     WorkerThread workerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        workerThread=new WorkerThread();
        workerThread.start();
        mbtn1 = findViewById(R.id.btn1);
        mbtn2 = findViewById(R.id.btn2);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workerThread.AddtaskToMessageQueue(taskone);
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            workerThread.AddtaskToMessageQueue(TaskTwo);
            }
        });
    }

    private Runnable taskone = new Runnable() {
        @Override
        public void run() {
            Log.d("prachi","Task One "+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable TaskTwo = new Runnable() {
        @Override
        public void run() {
            Log.d("prachi","Task Two "+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}

package com.example.handlingthreadmessaging;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import com.google.android.material.progressindicator.CircularProgressIndicator;

public class MainActivity extends AppCompatActivity {
private CircularProgressIndicator circularProgressIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circularProgressIndicator=findViewById(R.id.progressbar);
        WorkThread workThread=new WorkThread("Async",mainThreadHandler);
        workThread.start();
    }
    private Handler mainThreadHandler=new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            int progress=(int) msg.obj;
            circularProgressIndicator.setProgress(progress);
        }
    };

}
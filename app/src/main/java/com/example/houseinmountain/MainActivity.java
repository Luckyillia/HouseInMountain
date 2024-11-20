package com.example.houseinmountain;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int LikeCount;
    private TextView LikeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LikeView = findViewById(R.id.polubView);
        Button polub = findViewById(R.id.polub);
        Button usun = findViewById(R.id.usun);

        polub.setOnClickListener(v -> {
            addLike();
        });

        usun.setOnClickListener(v -> {
            removeLike();
        });
    }
    private void addLike(){
        LikeCount++;
        LikeView.setText(LikeCount+" polubien");
    }
    private void removeLike(){
        if(LikeCount == 0){
            LikeView.setText(LikeCount+" polubien");
        }else{
            LikeCount--;
            LikeView.setText(LikeCount+" polubien");
        }

    }
}

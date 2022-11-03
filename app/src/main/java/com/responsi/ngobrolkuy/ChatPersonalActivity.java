package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChatPersonalActivity extends AppCompatActivity {
    private ImageView backbtn;
    private ImageView sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_personal);
        backbtn = findViewById(R.id.backtochat);
        sendBtn = findViewById(R.id.sendButton);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatPersonalActivity.this, HomechatActivity.class);
                startActivity(intent);
            }
        });
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChatPersonalActivity.this, "Pesan berhasil terkirim", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomechatActivity extends AppCompatActivity {
    private ImageView settingicon;
    private LinearLayout bubblechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homechat);
        bubblechat = findViewById(R.id.firstchat);
        settingicon = findViewById(R.id.setting);


        String uname = getIntent().getExtras().getString("username");
        String pass = getIntent().getExtras().getString("password");


        settingicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomechatActivity.this, SettingActivity.class);
                intent.putExtra("username", uname);
                intent.putExtra("password", pass);

                startActivity(intent);
            }
        });

        bubblechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomechatActivity.this, ChatPersonalActivity.class);
                startActivity(intent);
            }
        });
        /*for (int i = 1; i <= 7; i++) {
            int id = getResources().getIdentifier("chat" + Integer.toString(i), "id", "com.responsi.ngobrolkuy");
            View view = findViewById(id);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(HomechatActivity.this, ChatPersonalActivity.class);
                    startActivity(intent);
                }
            });
        }*/
        /*keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomechatActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingActivity extends AppCompatActivity {
    private TextView ganti_password;
    private TextView nama, email, password;
    private ImageView ppp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ganti_password = findViewById(R.id.changePassBtn);
        nama = findViewById(R.id.usernametext);
        email = findViewById(R.id.emailtext);
        password = findViewById(R.id.passtext);
        ppp = findViewById(R.id.profpicsetting);
        String usname = getIntent().getExtras().getString("username");
        String pass = getIntent().getExtras().getString("password");
        String uri = getIntent().getExtras().getString("profilepic");

        nama.setText(usname);
        password.setText(pass);
        email.setText(usname +"@email.com");
        ppp.setImageURI(Uri.parse(uri));
        /*mundur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, HomeChatActivity.class);
                startActivity(intent);
            }
        });*/

        ganti_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viee) {
                Intent intent = new Intent(SettingActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
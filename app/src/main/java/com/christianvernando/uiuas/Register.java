package com.christianvernando.uiuas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {

    Button callLogin,register_btn;
    ImageView image;
    TextView logo_text;
    TextInputLayout email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        callLogin = findViewById(R.id.login_screen);
        image = findViewById(R.id.logoImage);
        logo_text = findViewById(R.id.logo_text);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register_btn = findViewById(R.id.register_btn);

        callLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);

                Pair[] pairs = new Pair[6];
                pairs[0] = new Pair<View,String>(image, "logo_image");
                pairs[1] = new Pair<View,String>(logo_text, "logo_text");
                pairs[2] = new Pair<View,String>(email, "email_tran");
                pairs[3] = new Pair<View,String>(password, "pass_tran");
                pairs[4] = new Pair<View,String>(register_btn, "but_tran");
                pairs[5] = new Pair<View,String>(callLogin, "login_reg_tran");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Register.this, pairs);
                startActivity(intent,options.toBundle());
            }
        });
    }
}
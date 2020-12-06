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

public class Login extends AppCompatActivity {

    //Variables
    Button callRegister,login_btn;
    ImageView image;
    TextView logo_text;
    TextInputLayout email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hooks
        callRegister = findViewById(R.id.register_screen);
        image = findViewById(R.id.logoImage);
        logo_text = findViewById(R.id.logo_text);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_btn);



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Dashboard.class));
            }
        });


        callRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);

                Pair[] pairs = new Pair[6];
                pairs[0] = new Pair<View,String>(image, "logo_image");
                pairs[1] = new Pair<View,String>(logo_text, "logo_text");
                pairs[2] = new Pair<View,String>(email, "email_tran");
                pairs[3] = new Pair<View,String>(password, "pass_tran");
                pairs[4] = new Pair<View,String>(login_btn, "but_tran");
                pairs[5] = new Pair<View,String>(callRegister, "login_reg_tran");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });

    }
}
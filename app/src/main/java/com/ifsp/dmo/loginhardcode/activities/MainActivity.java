package com.ifsp.dmo.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ifsp.dmo.loginhardcode.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLoggin = (Button) findViewById(R.id.button_login);
        btnLoggin.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textLogin = (TextView) findViewById(R.id.edittext_usuario);
                TextView textPassword = (TextView) findViewById(R.id.editext_password);
                String login = textLogin.getText().toString();
                String password = textPassword.getText().toString();
                Intent intent = new Intent(getContext(), BemVindo.class);
                Bundle params = new Bundle();
                params.putString("login", login);
                params.putString("password", password);
                intent.putExtras(params);
                startActivity(intent);
            }
        };
    }

    private Context getContext(){
        return this;
    }
}

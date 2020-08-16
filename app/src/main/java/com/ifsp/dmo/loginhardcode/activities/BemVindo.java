package com.ifsp.dmo.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.ifsp.dmo.loginhardcode.R;
import com.ifsp.dmo.loginhardcode.auth.AuthenticateUser;
import com.ifsp.dmo.loginhardcode.constants.Constantes;
import com.ifsp.dmo.loginhardcode.models.UserLogin;

public class BemVindo extends AppCompatActivity {

    private UserLogin userLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        Bundle args = getIntent().getExtras();
        userLogin = new UserLogin(args.getString("login"), args.getString("password"));
        inicio();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void inicio(){
        TextView textoSaida = (TextView) findViewById(R.id.textview_boas_vindas);
        if(AuthenticateUser.isUserAuthenticate(userLogin)){
            textoSaida.setText(Constantes.BEM_VINDO + userLogin.getUser());
        }else{
            textoSaida.setText(Constantes.ERRO_LOGIN);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

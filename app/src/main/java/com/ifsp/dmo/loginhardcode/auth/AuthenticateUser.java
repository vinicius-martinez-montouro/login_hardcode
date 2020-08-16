package com.ifsp.dmo.loginhardcode.auth;

import com.ifsp.dmo.loginhardcode.constants.Constantes;
import com.ifsp.dmo.loginhardcode.models.UserLogin;

public class AuthenticateUser {

    public static boolean isUserAuthenticate(UserLogin userLogin){
        if(userLogin == null)
            return  false;
        return Constantes.USER_LOGIN.equals(userLogin.getUser())
                && Constantes.USER_PASSWORD.equals(userLogin.getPassword());
    }
}

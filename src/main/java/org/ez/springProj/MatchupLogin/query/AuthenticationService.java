package org.ez.springProj.MatchupLogin.query;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.ez.springProj.MatchupLogin.model.UserModel;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class AuthenticationService {
    public String getToken(UserModel user) {
        String token = "";
        try {
            token = JWT.create()
                    .withAudience(user.getUserId())          // save user id into token
                    .sign(Algorithm.HMAC256(user.getPassWord()));   // password will be the key of token
        } catch (UnsupportedEncodingException ignore) {
        }
        return token;
    }
}

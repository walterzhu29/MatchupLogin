package org.ez.springProj.MatchupLogin.query;

import org.ez.springProj.MatchupLogin.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostgreSQLJDBCService {
    @Autowired
    UserModelRepository repository;

    public UserModel findUser(String userId) {
        Optional<UserModel> result = repository.findById(userId);
        if(result.equals(Optional.empty()))
            return null;
        else
            return result.get();
    }
}


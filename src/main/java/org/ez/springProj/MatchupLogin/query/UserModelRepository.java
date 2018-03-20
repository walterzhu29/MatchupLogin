package org.ez.springProj.MatchupLogin.query;

import org.ez.springProj.MatchupLogin.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserModelRepository extends CrudRepository<UserModel, String> {
}

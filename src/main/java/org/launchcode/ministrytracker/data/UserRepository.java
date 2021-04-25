package org.launchcode.ministrytracker.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}

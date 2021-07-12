
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author firzagustama
 * @version $Id: UsersRepository.java, v 0.1 2021-07-10 23.49 firzagustama Exp $$
 */
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByEmail(String email);

}
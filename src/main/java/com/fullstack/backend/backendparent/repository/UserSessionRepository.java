
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.UserSession;
import org.springframework.data.repository.CrudRepository;

/**
 * @author firzagustama
 * @version $Id: UserSessionRepository.java, v 0.1 2021-07-11 17.49 firzagustama Exp $$
 */
public interface UserSessionRepository extends CrudRepository<UserSession, String> {
}

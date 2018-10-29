package com.example.authservice.repository;

import com.example.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Rim vibol
 * Date : 10/29/2018, 9:02 AM
 * Email : vi.rim@gl-f.com
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

    @Query("SELECT DISTINCT user FROM User user " +
            " INNER JOIN FETCH user.authorities AS authorities " +
            " WHERE user.Username = :username")
    User findByUsername(@Param("username") String username);

}

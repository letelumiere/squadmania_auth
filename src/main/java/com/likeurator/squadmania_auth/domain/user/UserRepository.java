package com.likeurator.squadmania_auth.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Userinfo, Long>{

    @Query(value = "select * from userinfo where email_id = ?",
        nativeQuery = true)
    public Optional<Userinfo> findByEmail(String emailId);

}

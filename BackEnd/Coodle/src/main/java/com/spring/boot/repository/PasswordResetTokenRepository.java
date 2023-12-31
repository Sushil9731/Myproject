
package com.spring.boot.repository;

import com.spring.boot.entities.PasswordResetToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer>{
    
    Optional<PasswordResetToken> findByToken(String token);
}

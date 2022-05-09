package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByName(String name);
}

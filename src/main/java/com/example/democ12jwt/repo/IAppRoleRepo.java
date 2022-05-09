package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepo extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}

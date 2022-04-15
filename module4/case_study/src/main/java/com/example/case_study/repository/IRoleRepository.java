package com.example.case_study.repository;

import com.example.case_study.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    @Query(value = "select * from role where role_name=?1", nativeQuery = true)
    Role findByName(String name);
}

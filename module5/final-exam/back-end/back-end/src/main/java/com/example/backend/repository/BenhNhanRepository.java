package com.example.backend.repository;

import com.example.backend.model.BenhNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenhNhanRepository extends JpaRepository<BenhNhan, Integer> {
    @Query(value = "select * from benhnhan where name like concat('%' , ?1 , '%')", nativeQuery = true)
    List<BenhNhan> getBenhNhanByName(String name);
}

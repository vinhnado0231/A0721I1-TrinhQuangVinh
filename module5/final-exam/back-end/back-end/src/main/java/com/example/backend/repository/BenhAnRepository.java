package com.example.backend.repository;

import com.example.backend.model.BenhAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenhAnRepository extends JpaRepository<BenhAn, Integer> {
    @Query(value = "select * from BenhAn  where idBenhAn like concat('%' , ?1 , '%')" , nativeQuery = true)
    List<BenhAn> getBenhAnByIdBenhAn(String id);

    @Query("select b from BenhAn b  where b.benhNhan.idBenhNhan like concat('%' , ?1 , '%')")
    List<BenhAn> getBenhAnByIdBenhNhan(String id);
}
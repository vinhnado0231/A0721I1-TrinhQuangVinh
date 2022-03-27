package com.example.blogajax.repository;

import com.example.blogajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAll(Pageable pageable);

    @Query(value = "select * from blog where title like concat('%',?1,'%')",nativeQuery = true)
    List<Blog> searchByTitle(String title);
}
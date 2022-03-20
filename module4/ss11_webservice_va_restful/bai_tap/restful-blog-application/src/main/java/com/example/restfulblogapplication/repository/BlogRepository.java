package com.example.restfulblogapplication.repository;

import com.example.restfulblogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAll(Pageable pageable);

    @Query(value = "select * from blog where title order by asc", nativeQuery = true)
    Page<Blog> sortByName(Pageable pageable);

    @Query(value = "select * from blog where title like %?%", nativeQuery = true)
    Page<Blog> findByTitle(String title, Pageable pageable);

    @Query(value = " select * from blog where category_id = ?1", countQuery = "select count(*) from blog where category_id = ?1", nativeQuery = true)
    Page<Blog> findBlogById(int id, Pageable pageable);

}

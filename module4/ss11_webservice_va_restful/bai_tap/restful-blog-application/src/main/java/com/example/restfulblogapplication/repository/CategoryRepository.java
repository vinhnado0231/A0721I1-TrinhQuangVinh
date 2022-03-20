package com.example.restfulblogapplication.repository;


import com.example.restfulblogapplication.model.Blog;
import com.example.restfulblogapplication.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Page<Category> findAll(Pageable pageable);

    @Query(value = " select * from blog where category_id = ?1", nativeQuery = true)
    List<Blog> findBlogByCategoryId(int id);
}

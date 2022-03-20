package com.example.validatemusicinfomation.repository;


import com.example.validatemusicinfomation.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Integer> {
}

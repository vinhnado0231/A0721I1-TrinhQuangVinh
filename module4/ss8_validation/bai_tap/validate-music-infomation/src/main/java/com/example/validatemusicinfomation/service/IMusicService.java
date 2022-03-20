package com.example.validatemusicinfomation.service;

import com.example.validatemusicinfomation.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    void delete(int id);

    Music findById(int id);

}

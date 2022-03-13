package com.example.musicapplication.service;

import com.example.musicapplication.model.Music;

import java.util.List;
import java.util.Optional;

public interface MusicService {
    List<Music> findAll();

    Music findById(Long id);

    void save(Music music);

    void remove(Long id);
}

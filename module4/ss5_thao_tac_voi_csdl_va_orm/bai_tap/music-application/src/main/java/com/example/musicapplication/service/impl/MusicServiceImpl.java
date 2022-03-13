package com.example.musicapplication.service.impl;

import com.example.musicapplication.model.Music;
import com.example.musicapplication.repository.MusicRepository;
import com.example.musicapplication.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(Long id) {
        return musicRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(Long id) {
        musicRepository.deleteById(id);
    }
}

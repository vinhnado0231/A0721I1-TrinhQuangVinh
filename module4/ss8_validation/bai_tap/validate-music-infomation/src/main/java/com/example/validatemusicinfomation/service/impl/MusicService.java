package com.example.validatemusicinfomation.service.impl;

import com.example.validatemusicinfomation.model.Music;
import com.example.validatemusicinfomation.repository.MusicRepository;
import com.example.validatemusicinfomation.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private MusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void delete(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id).orElse(null);
    }
}

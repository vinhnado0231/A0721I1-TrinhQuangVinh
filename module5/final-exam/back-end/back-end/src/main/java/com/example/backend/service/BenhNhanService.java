package com.example.backend.service;

import com.example.backend.model.BenhNhan;
import com.example.backend.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhNhanService {
    @Autowired
    private BenhNhanRepository benhNhanRepository;

    public List<BenhNhan> getAll() {
        return benhNhanRepository.findAll();
    }

    public BenhNhan getBenhNhanById(int id) {
        return benhNhanRepository.findById(id).orElse(null);
    }

    public BenhNhan saveBenhNhan(BenhNhan benhNhan) {
        return benhNhanRepository.save(benhNhan);
    }

    public List<BenhNhan> getBenhNhanByName(String name) {
        return benhNhanRepository.getBenhNhanByName(name);
    }

}

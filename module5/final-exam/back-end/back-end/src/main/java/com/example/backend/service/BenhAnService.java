package com.example.backend.service;

import com.example.backend.model.BenhAn;
import com.example.backend.repository.BenhAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhAnService {
    @Autowired
    private BenhAnRepository benhAnRepository;

    public List<BenhAn> getAll() {
        return benhAnRepository.findAll();
    }

    public BenhAn getBenhAnById(int id) {
        return benhAnRepository.findById(id).orElse(null);
    }

    public BenhAn updateBenhAn(BenhAn benhAn) {
        return benhAnRepository.save(benhAn);
    }

    public List<BenhAn> getBenhAnByIdBenhAn(String id) {
        return benhAnRepository.getBenhAnByIdBenhAn(id);
    }

    public List<BenhAn> getBenhAnByIdBenhNhan(String id) {
        return benhAnRepository.getBenhAnByIdBenhNhan(id);
    }
}
package com.example.backend.controller;

import com.example.backend.model.BenhAn;
import com.example.backend.service.BenhAnService;
import com.example.backend.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/benh-an")
public class BenhAnController {
    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private BenhAnService benhAnService;

    @GetMapping("")
    public ResponseEntity<List<BenhAn>> showListBenhAn() {
        List<BenhAn> benhAnList = benhAnService.getAll();
        if (benhAnList.isEmpty()) {
            return new ResponseEntity<List<BenhAn>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<BenhAn>>(benhAnList, HttpStatus.OK);
    }


}

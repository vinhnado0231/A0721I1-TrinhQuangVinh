package com.example.case_study.service.service;

import com.example.case_study.model.Service;
import com.example.case_study.service.IGeneralService;


import java.util.List;

public interface IServiceService extends IGeneralService<Service> {
    List<Service> findAll();
}
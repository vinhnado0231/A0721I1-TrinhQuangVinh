package com.example.case_study.service.contract;

import com.example.case_study.model.Contract;
import com.example.case_study.service.IGeneralService;

import java.util.List;

public interface IContractService extends IGeneralService<Contract> {
    List<Contract> findAll();
}

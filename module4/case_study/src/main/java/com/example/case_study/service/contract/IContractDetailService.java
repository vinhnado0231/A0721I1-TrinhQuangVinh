package com.example.case_study.service.contract;

import com.example.case_study.model.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAll();

    void save(ContractDetail contractDetail);
}

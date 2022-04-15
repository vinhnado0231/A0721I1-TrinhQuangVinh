package com.example.case_study.model;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int contract_detail_id;
    int quantity;

    public ContractDetail() {
    }

    public AttachService getAttachServices() {
        return attachServices;
    }

    public void setAttachServices(AttachService attachServices) {
        this.attachServices = attachServices;
    }

    public Contract getContracts() {
        return contracts;
    }

    public void setContracts(Contract contracts) {
        this.contracts = contracts;
    }

    @ManyToOne(targetEntity = AttachService.class)
    @JoinColumn(name="attach_service_id")
    private AttachService attachServices;

    @ManyToOne(targetEntity = Contract.class)
    @JoinColumn(name = "contract_id")
    private Contract contracts;

    public int getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(int contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

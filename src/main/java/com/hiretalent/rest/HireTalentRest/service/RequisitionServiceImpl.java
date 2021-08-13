package com.hiretalent.rest.HireTalentRest.service;

import com.hiretalent.rest.HireTalentRest.domain.Requisition;
import com.hiretalent.rest.HireTalentRest.repository.RequisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("requisitionService")
public class RequisitionServiceImpl implements RequisitionService{

    @Autowired
    RequisitionRepository requisitionRepository;

    @Override
    public Requisition saveRequisition(Requisition requisition) {
        return requisitionRepository.save(requisition);
    }

    @Override
    public List<Requisition> getAllRequisitions() {
        return requisitionRepository.findAll();
    }

    @Override
    public Requisition getRequisitionById(int requisitionId) {
        return requisitionRepository.findById(requisitionId).get();
    }

}

package com.hiretalent.rest.HireTalentRest.service;

import com.hiretalent.rest.HireTalentRest.domain.Requisition;

import java.util.List;

public interface RequisitionService {
    public Requisition saveRequisition(Requisition requisition);
    public List<Requisition> getAllRequisitions();
    public Requisition getRequisitionById(int requisitionId);

}

package com.hiretalent.rest.HireTalentRest.service;

import com.hiretalent.rest.HireTalentRest.domain.Requisition;
import java.util.List;
import java.util.Optional;

public interface RequisitionService {
     Requisition saveRequisition(Requisition requisition);
     List<Requisition> getAllRequisitions();
     Optional<Requisition> getRequisitionById(int requisitionId);

}

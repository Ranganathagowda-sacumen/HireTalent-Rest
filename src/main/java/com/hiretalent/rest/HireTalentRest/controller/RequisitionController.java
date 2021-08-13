package com.hiretalent.rest.HireTalentRest.controller;

import com.hiretalent.rest.HireTalentRest.domain.Requisition;
import com.hiretalent.rest.HireTalentRest.service.RequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequisitionController {

    @Autowired
    RequisitionService reqService;

    @PostMapping("/saveRequisition")
    public Requisition saveRequisition(@RequestBody Requisition requisition) {
        return reqService.saveRequisition(requisition);
    }

    @GetMapping("/getRequisitions")
    public List<Requisition> getAllRequisitions() {
        return reqService.getAllRequisitions();
    }

    @GetMapping("/getRequisition/{requisitionId}")
    public Requisition getRequisitionById(@PathVariable int requisitionId) {
        return reqService.getRequisitionById(requisitionId);
    }

    @PutMapping("/updateRequisition")
    public Requisition updateRequisition(@RequestBody Requisition requisition) {
        return reqService.saveRequisition(requisition);
    }

}

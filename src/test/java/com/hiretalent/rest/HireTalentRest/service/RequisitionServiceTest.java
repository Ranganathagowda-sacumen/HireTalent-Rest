package com.hiretalent.rest.HireTalentRest.service;

import com.hiretalent.rest.HireTalentRest.domain.Requisition;
import com.hiretalent.rest.HireTalentRest.repository.RequisitionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RequisitionServiceTest {

    @MockBean
    RequisitionRepository requisitionRepository;

    @Autowired
    RequisitionService requisitionService;

    @Test
    public void getAllRequisitionsTest() {
        List<Requisition> requisitions = new ArrayList<>();
        Requisition requisition1 = new Requisition(1, "Hiretalent", "developer", "3-5", "java", "spring", "html", "sql", null);
        Requisition requisition2 = new Requisition(2, "BigId", "qa", "5-8", "phython", "flask", "django", "sql", null);
        requisitions.add(requisition1);
        requisitions.add(requisition2);
        when(requisitionRepository.findAll()).thenReturn(requisitions);
        assertEquals(2, requisitionService.getAllRequisitions().size());
        assertEquals(requisitions, requisitionService.getAllRequisitions());
    }

    @Test
    public void saveRequisitionTest() {
        Requisition requisition = new Requisition(1, "Hiretalent", "developer", "3-5", "java", "spring", "html", "sql", null);
        when(requisitionRepository.save(requisition)).thenReturn(requisition);
        assertEquals(requisition, requisitionService.saveRequisition(requisition));
    }

    @Test
    public void getRequisitionById() {
        int requisitionId = 1;
        Optional<Requisition> requisition = Optional.of(new Requisition(1, "Hiretalent", "developer", "3-5", "java", "spring", "html", "sql", null));
        when(requisitionRepository.findById(requisitionId)).thenReturn(requisition);
        assertEquals(requisition, requisitionService.getRequisitionById(requisitionId));
    }
}
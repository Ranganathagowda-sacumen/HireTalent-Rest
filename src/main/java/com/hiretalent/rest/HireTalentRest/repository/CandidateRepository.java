package com.hiretalent.rest.HireTalentRest.repository;

import com.hiretalent.rest.HireTalentRest.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}

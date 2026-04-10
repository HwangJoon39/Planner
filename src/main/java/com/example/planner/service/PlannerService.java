package com.example.planner.service;


import com.example.planner.dto.CreatePlannerRequest;
import com.example.planner.dto.CreatePlannerResponse;
import com.example.planner.entity.Planner;
import com.example.planner.repository.PlannerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PlannerService {

    private final PlannerRepository plannerRepository;

    //저장
    @Transactional
    public CreatePlannerResponse save(CreatePlannerRequest request) {
        Planner planner = new Planner(
                request.getTitle(),
                request.getContents(),
                request.getUsername(),
                request.getPassword()
        );
        Planner savedPlanner = plannerRepository.save(planner);
        return new CreatePlannerResponse(
                savedPlanner.getId(),
                savedPlanner.getTitle(),
                savedPlanner.getContents(),
                savedPlanner.getUsername(),
                savedPlanner.getCreatedAt(),
                savedPlanner.getModifiedAt()
        );
    }
}



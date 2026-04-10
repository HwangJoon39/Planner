package com.example.planner.controller;


import com.example.planner.dto.CreatePlannerRequest;
import com.example.planner.dto.CreatePlannerResponse;
import com.example.planner.service.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PlannerController {
    private final PlannerService plannerService;

    @PostMapping("/planners")
    public CreatePlannerResponse createPlanner(@RequestBody CreatePlannerRequest request) {
        return plannerService.save(request);
    }
}



package com.example.planner.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreatePlannerResponse {
    private final long id;
    private final String title;
    private final String contents;
    private final String username;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public CreatePlannerResponse(long id, String title, String contents, String username, LocalDateTime creatAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.username = username;
        this.createdAt = creatAt;
        this.modifiedAt = modifiedAt;
    }
}

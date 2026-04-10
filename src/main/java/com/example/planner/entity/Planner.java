package com.example.planner.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "planners")
@NoArgsConstructor
public class Planner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;
    private String username;
    private String password;

    public Planner(String title, String contents, String username, String password) {
        this.title = title;
        this.contents = contents;
        this.username = username;
        this.password = password;
    }

    public void update(String title, String contents, String username, String password) {
        this.title = title;
        this.contents = contents;
        this.username = username;
        this.password = password;
    }
}
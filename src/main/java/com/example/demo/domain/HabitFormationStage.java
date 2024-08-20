package com.example.demo.domain;

import java.util.List;
import lombok.Getter;

@Getter
public class HabitFormationStage {

    private Long id;
    private int stage;
    private Habit habit;
    private List<String> questions;
    private List<String> answers;
    private String feedback;
}

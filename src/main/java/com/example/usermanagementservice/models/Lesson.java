package com.example.usermanagementservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "lessons")
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @Column(name = "lesson_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lessonId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "time_to_watch")
    private int timeToWatch;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "video_path")
    private String videoPath;

    @Column(name = "text_information")
    private String textInformation;
}

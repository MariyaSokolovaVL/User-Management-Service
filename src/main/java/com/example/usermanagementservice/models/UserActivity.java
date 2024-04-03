package com.example.usermanagementservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "users_activity")
@NoArgsConstructor
@AllArgsConstructor
public class UserActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Внешний ключ для пользователя
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Внешний ключ для курса
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "is_end")
    private boolean isEnd;
}

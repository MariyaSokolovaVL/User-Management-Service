package com.example.usermanagementservice.repositories;

import com.example.usermanagementservice.models.Lesson;
import com.example.usermanagementservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}

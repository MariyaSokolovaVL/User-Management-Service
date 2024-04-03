package com.example.usermanagementservice.repositories;

import com.example.usermanagementservice.models.User;
import com.example.usermanagementservice.models.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityRepository extends JpaRepository<UserActivity, Long> {
}

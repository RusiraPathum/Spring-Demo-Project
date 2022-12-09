package com.example.sprin_demo_project.repo;

import com.example.sprin_demo_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}

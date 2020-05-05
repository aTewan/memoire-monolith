package com.antoinepoirier.memoiremonolith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antoinepoirier.memoiremonolith.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

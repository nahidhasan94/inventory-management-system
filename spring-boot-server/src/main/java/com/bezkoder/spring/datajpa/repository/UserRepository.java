package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Long> {
    List<User> findByUsername(boolean published);
}

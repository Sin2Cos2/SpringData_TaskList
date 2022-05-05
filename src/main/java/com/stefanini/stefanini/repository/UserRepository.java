package com.stefanini.stefanini.repository;

import com.stefanini.stefanini.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String userName);
}

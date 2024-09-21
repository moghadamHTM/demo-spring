package com.moghadam.demo_spring.repository;

import com.moghadam.demo_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author h.Moghadam
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

package com.moghadam.demo_spring;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author h.Moghadam
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

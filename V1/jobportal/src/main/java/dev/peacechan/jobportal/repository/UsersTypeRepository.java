package dev.peacechan.jobportal.repository;

import dev.peacechan.jobportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType,Integer> {
}
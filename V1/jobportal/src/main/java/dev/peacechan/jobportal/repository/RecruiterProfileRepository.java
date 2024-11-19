package dev.peacechan.jobportal.repository;

import dev.peacechan.jobportal.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile,Integer> {
}

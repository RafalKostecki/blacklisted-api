package com.example.blacklisted.blacklisted;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlacklistedRepository extends JpaRepository<Blacklisted, String> {
}

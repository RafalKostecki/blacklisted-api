package com.example.blacklisted.blacklisted;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class BlacklistedService {

    private final BlacklistedRepository blacklistedRepository;

    @Autowired
    public BlacklistedService(BlacklistedRepository blacklistedRepository) {
        this.blacklistedRepository = blacklistedRepository;
    }

    public Page<Blacklisted> getBlacklistedMembers(Pageable pageable) {
        return blacklistedRepository.findAll(pageable);
    }

    public Optional<Blacklisted> getBlacklistedMember(UUID id) {
        return blacklistedRepository.findById(id);
    }

    public Blacklisted createBlacklisted(Blacklisted blacklisted) {
        return blacklistedRepository.save(blacklisted);
    }
}

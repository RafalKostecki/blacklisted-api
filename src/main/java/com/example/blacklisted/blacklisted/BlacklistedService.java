package com.example.blacklisted.blacklisted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlacklistedService {

    private final BlacklistedRepository blacklistedRepository;

    @Autowired
    public BlacklistedService(BlacklistedRepository blacklistedRepository) {
        this.blacklistedRepository = blacklistedRepository;
    }
    public List<Blacklisted> getBlacklistedMembers() {
        return blacklistedRepository.findAll();
    }

    public Optional<Blacklisted> getBlacklistedMember(String id) {
        return blacklistedRepository.findById(id);
    }
}

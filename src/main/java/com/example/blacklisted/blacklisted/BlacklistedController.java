package com.example.blacklisted.blacklisted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(path = "/api/blacklisted")
@CrossOrigin(origins = "http://localhost:4200")
public class BlacklistedController {

    private final BlacklistedService blacklistedService;

    @Autowired
    public BlacklistedController(BlacklistedService blacklistedService) {
        this.blacklistedService = blacklistedService;
    }

    @GetMapping
    public Page<Blacklisted> getBlacklistedMembers(Pageable pageable) {
        return this.blacklistedService.getBlacklistedMembers(pageable);
    }

    @GetMapping("/{id}")
    public Optional<Blacklisted> getBlacklistedMember(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        return this.blacklistedService.getBlacklistedMember(uuid);
    }

    @PostMapping
    public Blacklisted createBlacklisted(@RequestBody Blacklisted blacklisted) {
        return this.blacklistedService.createBlacklisted(blacklisted);
    }
}

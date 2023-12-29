package com.example.blacklisted.blacklisted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/blacklisted")
public class BlacklistedController {

    private final BlacklistedService blacklistedService;

    @Autowired
    public BlacklistedController(BlacklistedService blacklistedService) {
        this.blacklistedService = blacklistedService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Blacklisted> getBlacklistedMembers() {
        return this.blacklistedService.getBlacklistedMembers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Optional<Blacklisted> getBlacklistedMember(@PathVariable String id) {
        return this.blacklistedService.getBlacklistedMember(id);
    }
}

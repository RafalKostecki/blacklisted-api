package com.example.blacklisted.blacklisted;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "Blacklisted")
public class Blacklisted {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "id")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private String surname;
    private String content;
    private String city;
    private Boolean verified = false;

    private ZonedDateTime createdAt = ZonedDateTime.now();

    public Blacklisted() {}

    public Blacklisted(UUID id, String name, String surname, String content, String city, Boolean verified, ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.content = content;
        this.city = city;
        this.verified = verified;
        this.createdAt = createdAt;
    }

    @PrePersist
    public void prePersist() {
        this.createdAt = ZonedDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

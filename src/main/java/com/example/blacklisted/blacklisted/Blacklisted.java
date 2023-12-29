package com.example.blacklisted.blacklisted;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "Blacklisted")
public class Blacklisted {
    @Id
    private String id;
    private String name;
    private String surname;
    private String content;
    private String city;
    private Boolean verified;

    private ZonedDateTime createdAt;

    public Blacklisted() {}

    public Blacklisted(String id, String name, String surname, String content, String city, Boolean verified, ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.content = content;
        this.city = city;
        this.verified = verified;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

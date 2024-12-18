package com.globalcontrols.processimprovement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ElementCollection;

import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long empNo;
    private String username;
    private String password;

    @ElementCollection
    private Set<String> roles;  // Set of role names (e.g., "USER", "ADMIN")

    // Getters and Setters
    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}

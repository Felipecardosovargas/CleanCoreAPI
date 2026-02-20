package com.github.felipecardosovargas.cleancore_erp.infra.persistence;

import com.github.felipecardosovargas.cleancore_erp.core.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private Boolean status;
    private LocalDateTime lastLoginAt;
    private LocalDateTime createdAt;

    @ManyToMany
    @JoinTable(
            name = "user_companies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id")
    )
    private Set<Company> companies;
}

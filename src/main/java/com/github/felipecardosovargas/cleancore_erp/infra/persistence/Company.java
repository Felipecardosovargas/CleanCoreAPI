package com.github.felipecardosovargas.cleancore_erp.infra.persistence;

import com.github.felipecardosovargas.cleancore_erp.core.enums.CompanyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "companies")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String legalName;
    private String tradeName;
    private String taxId;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private CompanyStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToMany(mappedBy = "companies")
    private Set<User> users;
}

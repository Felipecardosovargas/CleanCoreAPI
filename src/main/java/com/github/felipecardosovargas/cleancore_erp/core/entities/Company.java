package com.github.felipecardosovargas.cleancore_erp.core.entities;

import com.github.felipecardosovargas.cleancore_erp.core.enums.CompanyStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record Company(
                    UUID id,
                    String legalName,
                    String tradeName,
                    String taxId,
                    String email,
                    String phone,
                    CompanyStatus status,
                    LocalDateTime createdAt,
                    LocalDateTime updatedAt
) {
}

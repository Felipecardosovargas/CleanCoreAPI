package com.github.felipecardosovargas.cleancore_erp.core.entities;

import com.github.felipecardosovargas.cleancore_erp.core.enums.UserRole;

import java.time.LocalDateTime;
import java.util.UUID;

public record User(
                    UUID id,
                    String name,
                    String email,
                    String passwordHash,
                    UserRole role,
                    Boolean status,
                    LocalDateTime lastLoginAt,
                    LocalDateTime createdAt
) {
}

package tech.saintbassanaga.usermanagementservice.dtos;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.usermanagementservice.entities.Profile}
 */
public record CreateProfileDto(String username, String password) implements Serializable {
}
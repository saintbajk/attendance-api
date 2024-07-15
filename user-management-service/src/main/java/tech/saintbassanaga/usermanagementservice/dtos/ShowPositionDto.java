package tech.saintbassanaga.usermanagementservice.dtos;

import lombok.Value;
import tech.saintbassanaga.usermanagementservice.entities.Category;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.usermanagementservice.entities.Position}
 */
public record ShowPositionDto(String name, Category category) implements Serializable {
}
package tech.saintbassanaga.usermanagementservice.dtos;

import tech.saintbassanaga.usermanagementservice.entities.Category;
import tech.saintbassanaga.usermanagementservice.entities.Designation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * DTO for {@link tech.saintbassanaga.usermanagementservice.entities.Employee}
 */
public record ShowEmployeeDto(UUID uuid, LocalDateTime createdDate, LocalDateTime lastModifiedDate, String name,
                              String surname, String username, Date bornDate, Designation designation, String idCard,
                              String email, UUID profileUuid, String profileUsername, String positionName,
                              Category positionCategory, BigDecimal positionSalary,
                              LocalDate positionStartDate) implements Serializable {
}
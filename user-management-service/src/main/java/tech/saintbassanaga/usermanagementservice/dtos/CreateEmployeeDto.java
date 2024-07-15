package tech.saintbassanaga.usermanagementservice.dtos;

import tech.saintbassanaga.usermanagementservice.entities.Designation;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link tech.saintbassanaga.usermanagementservice.entities.Employee}
 */
public record CreateEmployeeDto(String name, String surname, String username, Date bornDate, Designation designation,
                                String idCard, String email, CreateProfileDto profile) implements Serializable {
}
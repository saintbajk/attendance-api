package tech.saintbassanaga.usermanagementservice.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Embeddable
public class Position {
    private String name ;
    @Enumerated(EnumType.STRING)
    private Category category;
    private BigDecimal salary;
    private LocalDate startDate;
}
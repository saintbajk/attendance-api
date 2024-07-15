package tech.saintbassanaga.usermanagementservice.repository;

import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;
import tech.saintbassanaga.usermanagementservice.entities.Employee;

import java.math.BigDecimal;

public class EmployeeSpecifications {
    public static Specification<Employee> salaryBetween(BigDecimal minSalary, BigDecimal maxSalary){
        return (root, query, criteriaBuilder) -> {
            if (minSalary != null && maxSalary != null) {
                return criteriaBuilder.between(root.get("position").get("salary"), minSalary, maxSalary);
            } else if (minSalary != null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("salary"), minSalary);
            } else if (maxSalary != null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("salary"), maxSalary);
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }
}

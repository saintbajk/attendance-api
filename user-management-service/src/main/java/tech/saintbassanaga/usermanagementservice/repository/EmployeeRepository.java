package tech.saintbassanaga.usermanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import tech.saintbassanaga.usermanagementservice.entities.Employee;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>, JpaSpecificationExecutor<Employee> {
    Optional<Employee> findEmployeeByNameContaining(String name);
    Optional<Employee> findEmployeeByPositionName(String position);
}
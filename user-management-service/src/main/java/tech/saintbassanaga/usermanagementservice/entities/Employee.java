package tech.saintbassanaga.usermanagementservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {

    private String name;
    private String surname;
    private String username;
    private Date bornDate;
    @Enumerated(EnumType.STRING)
    private Designation designation;
    private String idCard;
    private String email;

    @OneToOne(cascade = CascadeType.REMOVE, optional = false)
    @JoinColumn(name = "profile_uuid", nullable = false, unique = true)
    private Profile profile;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "position_name")),
            @AttributeOverride(name = "category", column = @Column(name = "position_category")),
            @AttributeOverride(name = "salary", column = @Column(name = "position_salary")),
            @AttributeOverride(name = "startDate",column = @Column(name = "position_start_date"))
    })
    private Position position;

}
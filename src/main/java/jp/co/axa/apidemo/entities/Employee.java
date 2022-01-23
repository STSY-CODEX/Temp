package jp.co.axa.apidemo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE;

@Entity
@Table(name = "EMPLOYEE")
@Cacheable
@org.hibernate.annotations.Cache(usage = READ_WRITE, region = "Entity")
@EqualsAndHashCode
public class Employee {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMPLOYEE_NAME")
    private String name;

    @Getter
    @Setter
    @NotNull
    @Column(name = "EMPLOYEE_SALARY")
    private Integer salary;

    @Getter
    @Setter
    @NotNull
    @Column(name = "DEPARTMENT")
    private String department;
}

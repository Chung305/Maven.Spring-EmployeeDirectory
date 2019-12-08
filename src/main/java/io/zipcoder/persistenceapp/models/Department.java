package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEPARTMENT_KEY")
    private Long department_key;

    @Column(name = "DEPARTMENT_NAME")
    private String department_name;

    @Column(name = "MANAGER")
    @Transient
    private Employee manager;

    public Department() {
    }

    public Long getDepartment_key() {
        return department_key;
    }

    public void setDepartment_key(Long department_key) {
        this.department_key = department_key;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}

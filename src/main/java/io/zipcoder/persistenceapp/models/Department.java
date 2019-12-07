package io.zipcoder.persistenceapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer department_key;
    private String department_name;
    private Integer manager_id;

    public Department() {
    }

    public Department(Integer department_key, String department_name, Integer manager_id) {
        this.department_key = department_key;
        this.department_name = department_name;
        this.manager_id = manager_id;
    }

    public Integer getDepartment_key() {
        return department_key;
    }

    public void setDepartment_key(Integer department_key) {
        this.department_key = department_key;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getManager() {
        return manager_id;
    }

    public void setManager(Integer manager_id) {
        this.manager_id = manager_id;
    }
}

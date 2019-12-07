package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employee_id;
    private String first_name;
    private String last_name;
    private String title;
    private String phone_number;
    private String hire_date;
    private Integer manager_id;
    private Integer department_Key;

    public Employee() {
    }

    public Employee(Integer employee_id, String first_name, String last_name, String title,
                    String phone_number, String hire_date, Integer manager_id, Integer department_Key) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.manager_id = manager_id;
        this.department_Key = department_Key;
    }

    public Integer getEmployee_Number() {
        return employee_id;
    }

    public void setEmployee_Number(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public Integer getManager() {
        return manager_id;
    }

    public void setManager(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Integer getDepartment_Key() {
        return department_Key;
    }

    public void setDepartment_Key(Integer department_Key) {
        this.department_Key = department_Key;
    }
}

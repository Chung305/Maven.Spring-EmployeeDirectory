package io.zipcoder.persistenceapp.models;


import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "EMPLOYEE_ID")
    private Long employee_id;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PHONE_NUMBER")
    private String phone_number;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "HIRE_DATE")
    private String hire_date;

    @Column(name = "MANAGER")
    @Transient
    private Employee manager;

    @Column(name = "DEPARTMENT_KEY")
    private Integer department_Key;

    public Employee() {
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Integer getDepartment_Key() {
        return department_Key;
    }

    public void setDepartment_Key(Integer department_Key) {
        this.department_Key = department_Key;
    }
}

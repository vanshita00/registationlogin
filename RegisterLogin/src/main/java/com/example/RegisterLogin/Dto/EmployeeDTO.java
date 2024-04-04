package com.example.RegisterLogin.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedValue;

public class EmployeeDTO {

    private int employeeid;
    private String employeename;
    private String email;
    private String password;

    public EmployeeDTO(int employeeid,String employeename,String email,String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;

    }
    public EmployeeDTO() {
    }

    public String getEmployee(){
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmployeename() {

        return null;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
}


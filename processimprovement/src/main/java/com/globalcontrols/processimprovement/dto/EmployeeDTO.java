package com.globalcontrols.processimprovement.dto;

public class EmployeeDTO {
    private Long empNo;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hireDate;
    
    // Constructor
    public EmployeeDTO(Long empNo, String birthDate, String firstName, String lastName, String gender, String hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    // Getters and Setters
    public Long getEmpNo() {
        return empNo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getHireDate() {
        return hireDate;
    }
}
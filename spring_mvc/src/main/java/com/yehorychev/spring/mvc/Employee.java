package com.yehorychev.spring.mvc;

import com.yehorychev.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @NotBlank(message = "*Required field")
    @Size(min = 2, max = 32, message = "*The first name must be at least 2 characters long and no more than 32 characters.")
    private String firstName;

    @NotBlank(message = "*Required field")
    @Size(min = 2, max = 32, message = "*The last name must be at least 2 characters long and no more than 32 characters.")
    private String lastName;

    @Min(value = 1999L, message = "*Must be greater than $1999")
    @Max(value = 500000L, message = "*Must be less than $500000")
    private int salary;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "*Please use this pattern: XXX-XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "@gmail.com", message = "*The email address must end with: @gmail.com")
    private String email;

    private String department;
    private String carBrand;
    private String[] languages;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languagesList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("Sales", "Sales");
        departments.put("HR", "Human Resources");
        departments.put("Marketing", "Marketing");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("French", "FR");
        languagesList.put("Deutsch", "DE");
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", salary=" + salary + ", phoneNumber='" + phoneNumber + '\'' + ", email='" + email + '\'' + ", department='" + department + '\'' + ", carBrand='" + carBrand + '\'' + ", languages=" + Arrays.toString(languages) + ", departments=" + departments + ", carBrands=" + carBrands + ", languagesList=" + languagesList + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

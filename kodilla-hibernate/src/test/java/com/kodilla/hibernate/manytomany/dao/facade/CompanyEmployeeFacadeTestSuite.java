package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyEmployeeFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyEmployeeFacadeTestSuite {

    @Autowired
    private CompanyEmployeeFacade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindCompaniesByNameFragment() {
        // Given
        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Masters");
        Company company3 = new Company("Grey Matter");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        // When
        List<Company> companies = facade.findCompaniesByNameFragment("Ma");

        // Then
        assertEquals(3, companies.size());

        // CleanUp
        companyDao.deleteAll();
    }

    @Test
    void testFindEmployeesByLastNameFragment() {
        // Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Jane", "Doe");
        Employee employee3 = new Employee("Steve", "Johnson");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        // When
        List<Employee> employees = facade.findEmployeesByLastNameFragment("son");

        // Then
        assertEquals(1, employees.size());
        assertEquals("Johnson", employees.get(0).getLastname());

        // CleanUp
        employeeDao.deleteAll();
    }
}

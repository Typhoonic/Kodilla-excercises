package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    void testFindCompany(){
        //Given
        Company marvel = new Company("Marvel");
        Company mars = new Company("Mars");
        Company nokia = new Company("Nokia");

        companyDao.save(marvel);
        companyDao.save(mars);
        companyDao.save(nokia);

        //When
        List<Company> companies = searchFacade.searchCompany("%ar%");

        //Then
        assertEquals(2, companies.size());

        //CleanUp
        try{
            companyDao.deleteById(marvel.getId());
            companyDao.deleteById(mars.getId());
            companyDao.deleteById(nokia.getId());
        }catch(Exception e){}
    }

    @Test
    void shouldFindEmployees(){
        //Given
        Employee artur = new Employee("Artur", "Kowalski");
        Employee kamil = new Employee("Kamil", "Kowalczyk");
        Employee joanna = new Employee("Joanna", "Mroczek");

        employeeDao.save(artur);
        employeeDao.save(kamil);
        employeeDao.save(joanna);

        //When
        List<Employee> employees = searchFacade.searchEmployee("%Kow%");

        //Then
        assertEquals(2, employees.size());

        //CleanUp
        try{
            employeeDao.deleteById(artur.getId());
            employeeDao.deleteById(kamil.getId());
            employeeDao.deleteById(joanna.getId());
        }catch(Exception e){}
    }
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompany(final String name){
        LOGGER.info("Trying to find company...");
        List<Company> foundCompanies = companyDao.findByFragment(name);
        for (Company companies: foundCompanies)
            System.out.println("Companies: " + companies.getName());
        return foundCompanies;
    }

    public List<Employee> searchEmployee(final String name){
        LOGGER.info("Trying to find employee...");
        List<Employee> foundEmployees = employeeDao.findByFragment(name);
        for (Employee employees: foundEmployees)
            System.out.println("Employee: " + employees.getLastname());
        return foundEmployees;
    }
}

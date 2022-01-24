package service;


import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployeeList();

    void insertEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(Employee employee);

    Employee selectEmployeeById(int id);
}

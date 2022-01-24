package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployeeList();
    void insertEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee selectEmployeeById(int id);
}

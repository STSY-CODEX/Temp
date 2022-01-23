package jp.co.axa.apidemo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * All employee related endpoint is in this class
 */
@RestController
@RequestMapping("/api/v1")
@Api(tags = "Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    @ApiOperation("Get all employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.retrieveEmployees();
        return employees;
    }

    @GetMapping("/employees/{employeeId}")
    @ApiOperation("Get employee by ID")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/employees")
    @ApiOperation("Save new employee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
        return "Employee " + employee.getName() + " Saved Successfully";
    }

    @DeleteMapping("/employees/{employeeId}")
    @ApiOperation("Delete employee by ID")
    public String deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        System.out.println("Employee Deleted Successfully");
        return "Employee Id:" + employeeId.toString() + " Deleted Successfully";
    }

    @PutMapping("/employees/{employeeId}")
    @ApiOperation("Update employee by ID")
    public String updateEmployee(@RequestBody Employee employee,
                                 @PathVariable(name = "employeeId") Long employeeId) {
        Employee emp = employeeService.getEmployee(employeeId);
        if (emp != null) {
            employee.setId(employeeId);
            employeeService.updateEmployee(employee);
        }
        return "Employee " + employee.getName() + " Update Successfully";
    }

}

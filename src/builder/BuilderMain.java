package builder;

import builder.entity.Employee;

public class BuilderMain {
    public static void main(String[] args) {
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder().setEmployeeEmail("rounak@gmail.com").setEmployeeId("!23456").setEmployeeName("rounak");
        Employee employee = employeeBuilder.build();
        System.out.println(employee);
    }
}
package builder.entity;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeEmail;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.employeeId = employeeBuilder.employeeId;
        this.employeeName = employeeBuilder.employeeName;
        this.employeeEmail = employeeBuilder.employeeEmail;
    }

    public static class EmployeeBuilder {
        private String employeeId;
        private String employeeName;
        private String employeeEmail;
        public EmployeeBuilder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        public EmployeeBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }
        public EmployeeBuilder setEmployeeEmail(String employeeEmail) {
            this.employeeEmail = employeeEmail;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}

package Week6;

class CompanyEmployee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyEmployee e1 = new CompanyEmployee("Ravi", 50000);
        CompanyEmployee e2 = new CompanyEmployee("Anitha", 60000);
        CompanyEmployee e3 = new CompanyEmployee("Karthik", 55000);

        System.out.println(e1.empName);
        System.out.println(e2.empName);
        System.out.println(e3.empName);

        System.out.println("3 Employee objects created");

        CompanyEmployee.printCompanyInfo();
    }
}

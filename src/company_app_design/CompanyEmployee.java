package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {
        EmployeeInfo employee1 = new EmployeeInfo(1);
        EmployeeInfo employee2 = new EmployeeInfo("Bob", 1234 );

        System.out.println(employee1.calculateSalary(50));

       int pension = EmployeeInfo.calculateEmployeePension();
       System.out.println("The employee pension is: " + pension);

       System.out.println("The first employee id is: " + employee1.employeeId());
       System.out.println("The second employee name is: " + employee2.employeeName());



    }

}

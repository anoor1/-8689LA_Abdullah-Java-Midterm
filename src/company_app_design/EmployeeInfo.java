package company_app_design;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeInfo extends SuperEmployee {

    /**
     * INSTRUCTIONS
     * <p>
     * This class should implement the Employee interface, but you must do that without using the keyword `implements`
     * anywhere in this class.
     * <p>
     * HINT: Take a look at the collections framework diagram. Do you see how a class may implement an interface without
     * directly implementing it?
     * <p>
     * YOU MUST USE/DO:
     * OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every way possible
     * Use all kind of keywords (super, this, static, final, etc)
     * Implement nested class below (DateConversion)
     * Use Exception Handling
     * <p>
     * Once you're done with designing this EmployeeInfo class, go to the CompanyEmployee class to test
     */

    // Make sure to declare and use static, non-static & final fields
    static final String companyName = "Tesla";
    private static final Map<Integer, Double> bonusSign = new HashMap<>(){{
        put(1, 0.02);
        put(2, 0.05);
        put(3, 0.10);

    }};
    private int id;
    private String name;

    private String department;
    private String benefit;


    // You must have/use multiple constructors to initialize instance variables that you will create above
    public EmployeeInfo(int employeeId) {
    this.id = employeeId;
    this.name = "";
    }

    public EmployeeInfo(String name, int employeeId) {
        this.id = employeeId;
        this.name = name;
    }

    public EmployeeInfo() {

    }

    public int employeeId(){
        return this.id;

    }

   public String employeeName() {
       return this.name;
   }
    public void assignDepartment(String department){
        this.department = department;



    }

    public int calculateSalary(int rate){
        return rate*40*52;
    }

    public void benefits(String benefit){
        this.benefit = benefit;

    }


    /*
    You need to implement the logic of this method as such:

        It should calculate employee bonus based on salary and performance.
        It should return the total yearly bonus

        e.g. - Bonus = 10% of yearly salary for best performance
               Bonus = 6% of yearly salary for average performance, etc.
     */
    public static int calculateAnnualBonus(int salary, int performanceGrade) {

 try{
        double rate = bonusSign.get(performanceGrade);

        return (int) (salary* rate); }
 catch ( NullPointerException e) {

     System.out.println("The performance grade does not exist");
     return 0;
 }

    }

    /*
    You need to implement the logic of this method as such:

    It should calculate employee pension based on salary and numbers of years spent with the company.
    It should return the total pension amount.

    e.g. - Employee will receive 5% of salary as pension for every year they are with the company
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        if(convertedJoiningDate.isEmpty()){
            return 0;
        }
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        if(convertedTodaysDate.isEmpty()){
            return 0;
        }
        int salary = 0;
        System.out.println("Please enter your salary: ");
        try {
             salary = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("This is not a valid salary");
            return 0;
        }
        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        int difference = DateConversion.getNumberOfYears(convertedJoiningDate, convertedTodaysDate);
        // Calculate pension

        total = (int) (salary* difference* 0.05);
        return total;
    }

    private static class DateConversion {

        public static String convertDate(String date) {
            try{

            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);

            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;}
            catch(Exception e){
                System.out.println("The date you entered is invalid");
                return "";
            }

        }
        public static int getNumberOfYears(String date1, String date2){
            String[] extractDate1 = date1.split("/");
            String[] extractDate2 = date2.split("/");
            int month1 = Integer.parseInt(extractDate1[0]);
            int month2 = Integer.parseInt(extractDate2[0]);
            int year1 = Integer.parseInt(extractDate1[1]);
            int year2 = Integer.parseInt(extractDate2[1]);
            int yearDifference =  year2 - year1;
            if(month2 < month1)
                yearDifference -= 1;
            return yearDifference;
        }

        public static int whichMonth(String givenMonth) {
            Months month = Months.valueOf(givenMonth);
            int monthNumber;

            switch (month) {
                case January:
                    monthNumber = 1;
                    break;
                case February:
                    monthNumber = 2;
                    break;
                case March:
                    monthNumber = 3;
                    break;
                case April:
                    monthNumber = 4;
                    break;
                case May:
                    monthNumber = 5;
                    break;
                case June:
                    monthNumber = 6;
                    break;
                case July:
                    monthNumber = 7;
                    break;
                case August:
                    monthNumber = 8;
                    break;
                case September:
                    monthNumber = 9;
                    break;
                case October:
                    monthNumber = 10;
                    break;
                case November:
                    monthNumber = 11;
                    break;
                case December:
                    monthNumber = 12;
                    break;
                default:
                    monthNumber = -1;
                    break;
            }
            return monthNumber;
        }
    }
}

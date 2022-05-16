public class employeeWage {
    // constant variables
    static int DAILY_WORKING_HOURS = 8;
    static int PART_TIME_HOURS = 4;
    static int DAILY_WAGE = 20;
    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        int empDailyWage = DAILY_WAGE * DAILY_WORKING_HOURS;
        int empPartTimeWage = DAILY_WAGE * PART_TIME_HOURS;
        // Computation
        double empWage = Math.floor(Math.random() * 10) % 3;
        if (empWage == 1)
            System.out.println("Employee is Present Today"+ "\r\n" +"Total Wage for Today = " + empDailyWage);
        else if (empWage == 2)
            System.out.println("Employee is Working Part Time today = " + empPartTimeWage);
        else
            System.out.println("Employee is Absent Today");
    }
}

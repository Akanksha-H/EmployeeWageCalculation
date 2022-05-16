public class employeeWage {
    // constant variables
    static int DAY_CHECK = 1;
    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        // Computation
        double empDailyCheck = Math.floor(Math.random() * 10) % 2;
        if (empDailyCheck == DAY_CHECK)
            System.out.println("Employee is Present Today");
        else
            System.out.println("Employee is Absent Today");
    }
}

public class employeeWage {
    // constant variables
    static final int DAILY_WAGE = 20;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        int workingHours = 0;
        // Computation
        int dayCheck = (int) (Math.round(Math.random() * 10) % 3);
        switch (dayCheck) {
            case FULL_TIME:
                workingHours = 8;
                int empWage = DAILY_WAGE * workingHours;
                System.out.println("Employee is Working Full Time, Wage = " + empWage);
                break;

            case PART_TIME:
                workingHours = 4;
                int empWage1 = DAILY_WAGE * workingHours;
                System.out.println("Employee is Working Part Time, Wage  = " + empWage1);
                break;


            default:
                workingHours = 0;
                int empWage2 = DAILY_WAGE * workingHours;
                System.out.println("Employee is Absent, Wage = " + empWage2);
        }
    }
}

public class EmployeeWage {
    // constant variables
    static final int DAILY_WAGE = 20;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        int workingHours = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        // Computation
        while (totalWorkingDays < 20) {
            int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

            switch (dayCheck) {
                case FULL_TIME:
                    workingHours = 8;
                    int empWage = DAILY_WAGE * workingHours;

                    totalWorkingHours = workingHours + totalWorkingHours;
                    totalWorkingDays++;

                    System.out.println("Employee is Working Full Time, Wage = " + empWage );
                    System.out.println("Employee total working hours = " + totalWorkingHours );
                    break;

                case PART_TIME:
                    workingHours = 4;
                    int empWage1 = DAILY_WAGE * workingHours;

                    totalWorkingHours = workingHours + totalWorkingHours;
                    totalWorkingDays++;

                    System.out.println("Employee is Working Part Time, Wage  = " + empWage1);
                    System.out.println("Employee part time working hours  = " + totalWorkingHours);
                    break;


                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println(totalWorkingDays);
            int totalWage = totalWorkingHours * DAILY_WAGE;
            System.out.println("Wage for an month = " +totalWage);
        }
    }
}

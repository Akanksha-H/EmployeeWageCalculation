package EmployeeWage;

public class DayNine {
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    private final int workingHours;
    private final int totalWorkingDays;
    private final int totalWorkingHours;
    public final String company;
    private final int dailyWage;

    public DayNine(int workingHours, int totalWorkingDays, int totalWorkingHours, int dailyWage, String company) {
        this.workingHours = workingHours;
        this.totalWorkingDays = totalWorkingDays;
        this.totalWorkingHours = totalWorkingHours;
        this.company = company;
        this.dailyWage = dailyWage;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME EMPLOYEE TO DAILY WAGE COMPUTATION WITH OOPS");
        DayNine Company = new DayNine(7, 14, 50, 45, "Maza");
        System.out.println("Employee wage calculation for " + Company.company);
        int sumWorkingDays = 0;
        int sumWorkingHours = 0;
        int workHours = 0;

        // Computation
        while (sumWorkingHours < Company.totalWorkingHours && sumWorkingDays < Company.totalWorkingDays) {
            int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

            switch (dayCheck) {
                case FULL_TIME:
                    workHours = 7;
                    int empWage = Company.dailyWage * workHours;
                    System.out.println("Employee is Working Full Time, Wage = " + empWage);
                    sumWorkingHours = workHours + sumWorkingHours;
                    sumWorkingDays++;
                    break;

                case PART_TIME:
                    workHours = 4;
                    int empWage1 = Company.dailyWage * workHours;
                    System.out.println("Employee is Working Part Time, Wage  = " + empWage1);
                    sumWorkingHours = workHours + sumWorkingHours;
                    sumWorkingDays++;
                    break;

                    default:
                    System.out.println("Employee is Absent");
            }

            if (sumWorkingHours > Company.totalWorkingHours)
                sumWorkingHours = sumWorkingHours - workHours;
            System.out.println("Employee total working hours = " + sumWorkingHours);
            System.out.println("Employee working Day" + sumWorkingDays);
            int totalWage = sumWorkingHours * Company.dailyWage;
            System.out.println("Wage for an month = " + totalWage);
        }
    }
}
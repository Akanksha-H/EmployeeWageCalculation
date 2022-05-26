package EmployeeWage;

public class OOPSDay9 {
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;


    public static void main(String[] args) {
        System.out.println("WELCOME EMPLOYEE TO DAILY WAGE COMPUTATION WITH OOPS");
        OOPSDay9 Maza = new OOPSDay9();
        System.out.printf(Maza.empWageCalculation(14, 50, "Maza", 40));
    }

    public String empWageCalculation (int totalWorkingDays, int totalWorkingHours, String company, int dailyWage) {
        int sumWorkingDays = 0;
        int sumWorkingHours = 0;
        int workHours = 0;

        // Computation
        while (sumWorkingHours < totalWorkingHours && sumWorkingDays < totalWorkingDays) {
            int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

            switch (dayCheck) {
                case FULL_TIME:
                    workHours = 7;
                    int empWage = dailyWage * workHours;
                    System.out.println("Employee is Working Full Time, Wage = " + empWage);

                    sumWorkingHours = workHours + sumWorkingHours;
                    sumWorkingDays++;

                    break;

                case PART_TIME:
                    workHours = 4;
                    int empWage1 = dailyWage * workHours;
                    System.out.println("Employee is Working Part Time, Wage  = " + empWage1);

                    sumWorkingHours = workHours + sumWorkingHours;
                    sumWorkingDays++;

                    break;


                default:
                    System.out.println("Employee is Absent");
            }
            if (sumWorkingHours > totalWorkingHours)
                sumWorkingHours = sumWorkingHours - workHours;
            System.out.println("Employee total working hours = " + sumWorkingHours);

            System.out.println("Employee working Day" + sumWorkingDays);
            int totalWage = sumWorkingHours * dailyWage;
            System.out.println("Wage for an month = " + totalWage);

        }
        return company;
    }
}



import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_EMPLOYEES = 10;
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        // Input salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salaries[i] = Double.parseDouble(scanner.nextLine());
                    if (salaries[i] <= 0) {
                        System.out.println("Invalid salary! Enter again.");
                        continue;
                    }
                    
                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = Double.parseDouble(scanner.nextLine());
                    if (yearsOfService[i] < 0) {
                        System.out.println("Invalid years of service! Enter again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
		
        // Calculate bonuses, new salaries, and totals
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        // Output results
        System.out.println("\nEmployee Salary Details:");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Old Salary", "Years of Service", "Bonus", "New Salary");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f\n", salaries[i], yearsOfService[i], bonuses[i], newSalaries[i]);
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}

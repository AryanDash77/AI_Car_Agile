public class FinancingCalculator {
    public double calculateMonthlyPayment(double principal, double annualInterestRate, int months) {
        double monthlyRate = annualInterestRate / 12 / 100;
        double mathPower = Math.pow(1 + monthlyRate, months);
        return (principal * monthlyRate * mathPower) / (mathPower - 1);
    }
}



public class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    byte years;

    public MortgageCalculator(int principal, float annualInterest , byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
    public double calculateBalance(short numberOfPayments) {
        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments1 = getNumberOfPayments();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}

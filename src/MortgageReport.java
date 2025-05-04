import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    private final NumberFormat currency;
    private int years;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = this.calculator;
        this.currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }

    public void printMonthlyPayments() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= 12 * calculator.years; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(currency.format(balance));
        }
    }
}


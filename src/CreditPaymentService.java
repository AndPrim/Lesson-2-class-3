public class CreditPaymentService {
    public int calculate(int numberOfMonths, double interestRate, int loanAmountRub) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double degree = Math.pow((1 + monthlyInterestRate), numberOfMonths);
        double formula = loanAmountRub * (monthlyInterestRate + (monthlyInterestRate / (degree - 1)));
        return (int) formula;
    }
}

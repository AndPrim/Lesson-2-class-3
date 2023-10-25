// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int numberOfMonths = 36;
        double interestRate = 9.99;
        int loanAmountRub = 1_000_000;
        double anuitentPayment = service.calculate(numberOfMonths, interestRate, loanAmountRub);
        System.out.println("Ваш ежемесячный платёж: " + anuitentPayment);
    }
}
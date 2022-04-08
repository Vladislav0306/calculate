public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double interestRate) {
        double monthlyPayment = loanAmount * ((interestRate / 100 / 12)+(interestRate / 100 / 12)/(Math.pow((1+(interestRate / 100 / 12)), loanTerm)-1));
        return monthlyPayment;
    }
}

package _13_Heranca_Polimorfismo.exemploHeranca.entities;

public class BusinnesAccount extends Account{

    protected Double loanLimit;

    public BusinnesAccount(){
        super();
    }

    public BusinnesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(loanLimit <= amount){
            deposit(amount);
        }
    }

}
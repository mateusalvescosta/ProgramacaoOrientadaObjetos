package Account.Entities;

import Account.Exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double deposit(Double amount){
        return this.balance += amount;
    }

    public Double withdraw(Double amount) throws BusinessException {
        businessException(amount);
        return this.balance -= amount;
    }

    private void businessException(Double amount) throws BusinessException {
        if(amount > getBalance()){
            throw new BusinessException("ERROR: saldo da conta é inferior ao valor desejado de saque.");
        }
        if(amount > getWithdrawLimit()) {
            throw new BusinessException("ERROR: saque desejado é superior ao limite permitido.");
        }
    }

    @Override
    public String toString() {
        return "Novo saldo: R$" + getBalance();
    }
}

package Account.Aplication;

import Account.Entities.Account;
import Account.Exceptions.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações da conta:");
        System.out.print("Número da conta: ");
        Integer number = sc.nextInt();
        System.out.print("Títular da conta: ");
        String holder = sc.nextLine();
        sc.nextLine();
        System.out.print("Saldo inicial da conta: ");
        Double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double withdraw = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdraw);

        try {
            System.out.print("Insira o valor deseja de saque: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
        }
        catch(BusinessException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(account.toString());
            sc.close();
        }
    }
}


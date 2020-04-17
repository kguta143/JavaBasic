import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Account {
	private String accountName;
	private String accountNumber;
	private int balance;

	public Account(String accountName, String accountNumber, int balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// 입금
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
	}

	// 인
	public void withdraw(int money) {
		if (balance >= money) {
			System.out.println(money + "원이 인출되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	@Override
	public String toString() {
		return String.format("예금주:%s,계좌번호:%s,잔액:%d원", accountName, accountNumber, balance);
	}
}

public class First {
	public static void main(String[] args) {
		Account account = new Account("자바맨", "123-456", 10000);
		System.out.println(account);
		account.deposit(15000);
		System.out.println(account);
		account.withdraw(30000);
		System.out.println(account);
	}
}

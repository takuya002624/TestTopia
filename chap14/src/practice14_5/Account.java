package practice14_5;

public class Account {

	String accountNumber;
	int balance;

	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			String sh1 = this.accountNumber.trim();
			String sh2 = a.accountNumber.trim();
			if (sh1.equals(sh2)) {
				return true;
			}

		}
		return false;
	}
}

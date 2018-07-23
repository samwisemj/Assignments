
public class MMBankFactory extends BankFactory{

	private static int uniqueAcNo=10000;
	@Override
	
	protected CurrentAccount getNewCurrentAccount() {
		System.out.println("Open a new Current account in MoneyMoney Bank!!! Please furnish name, initial deposit, creditLimt");
		return null;
	}
}

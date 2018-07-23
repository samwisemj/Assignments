
public class MMBankFactory extends BankFactory{

	private static int uniqueAcNo=10000;
	@Override
	
	protected CurrentAccount getNewCurrentAccount(int accName,float accBal, float creditLimit ) { 
		CurrentAccount currentAccount = new CurrentAccount(uniqueAcNo,accName,accBal,creditLimit);
		uniqueAcNo++;
		
		
		return currentAccount;
	}
}

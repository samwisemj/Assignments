
public class MMBankFactory extends BankFactory{

	private static int uniqueCAcNo=10000;
	  private static int uniqueSAcNo=50000;
	@Override
	
	protected CurrentAccount getNewCurrentAccount(int accName,float accBal, float creditLimit ) { 
		CurrentAccount currentAccount = new CurrentAccount(uniqueCAcNo,accName,accBal,creditLimit);
		uniqueCAcNo++;
		
		
		return currentAccount;
	}
	
	
   @Override



        



        protected SavingsAccount getNewSavingsAccount(int accName,float accBal, boolean isSalaried ) { 



                SavingsAccount SavingsAccount = new SavingsAccount(uniqueSAcNo,accName,accBal,isSalaried);
			



uniqueSAcNo++;



                



                



                return savingsAcount;



        }
	
	
}

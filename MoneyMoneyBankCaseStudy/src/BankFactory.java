
public abstract class BankFactory {

	protected abstract SavingsAccount getNewSavingsAccount();

	protected abstract CurrentAccount getNewCurrentAccount();
}
